package entities;

public abstract class Estudo {

    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;
    public abstract Double calcXp();

}
