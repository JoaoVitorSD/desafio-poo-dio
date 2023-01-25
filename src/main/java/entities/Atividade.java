package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atividade {
    private String titulo;

    private String descricao;

    private Integer cargaHoraria;

    public Long calcXp(){
        return 0L;
    }
}
