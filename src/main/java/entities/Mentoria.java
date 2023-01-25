package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class Mentoria extends Estudo {


    private LocalDate data;


    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public Double calcXp(){
        return XP_PADRAO+20d;
    }

}
