package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atividade extends Estudo{
    private String titulo;

    private String descricao;

    private Integer cargaHoraria;

    public Double calcXp(){
        return XP_PADRAO*cargaHoraria;
    }
}
