package entities;

import exception.ExceptionBLL;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter
@Setter

public class Dev {
    private String nome;
    private Set<Estudo> inscritos = new LinkedHashSet<>();
    private Set<Estudo> concluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.getDevs().add(this);
        inscritos.addAll(bootcamp.getEstudos());
    }

    private void validaConteudoInscritos()throws ExceptionBLL {
        if(inscritos.isEmpty()){
            throw new ExceptionBLL("Não há estudos inscritos");
        }
    }
    public void progredir() throws ExceptionBLL {
        validaConteudoInscritos();
        Optional<Estudo> estudo = inscritos.stream().findFirst();
        estudo.ifPresent(value -> {
            concluidos.add(value);
            inscritos.remove(value);
        });
    }

    public Double calcTotalXp() {
       return concluidos.stream().mapToDouble(Estudo::calcXp).sum();
    }

}
