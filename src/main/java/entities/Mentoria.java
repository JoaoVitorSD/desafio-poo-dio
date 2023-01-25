package entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class Mentoria {
    private String titulo;
    private String descricao;

    private LocalDate date;

    public Long calcXp(){
        return 0L;
    }

    public Mentoria(String titulo, String descricao, LocalDate date) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
