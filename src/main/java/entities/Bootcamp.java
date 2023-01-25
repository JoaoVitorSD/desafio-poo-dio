package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Bootcamp {
    private final LocalDate inicio = LocalDate.now();

    private final LocalDate fim = inicio.plusDays(45);

    private String nome;

    private String descricao;

    private Set<Mentoria> mentorias= new LinkedHashSet<>();

    private Set<Atividade> atividades= new LinkedHashSet<>();

    private Set<Dev> devs = new LinkedHashSet<>();

    public Set<Estudo> getEstudos(){
        Set<Estudo> aux = new LinkedHashSet<>();
        aux.addAll(mentorias);
        aux.addAll(atividades);

        return aux;
    }
}
