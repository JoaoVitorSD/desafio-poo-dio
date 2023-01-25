package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Dev {
    private String nome;
    private List<Mentoria> mentorias;

    private List<Atividade> atividades;

    public void inscreverBootcamp(){

    }
    public void progredir(){

    }
    public void calcTotalXp(){

    }
    public void exibirCursos(){

    }
}
