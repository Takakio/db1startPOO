package com.db1.db1start;

public class Materia {
    public String nome;
    public String descricao;
    public Integer cargaHoraria;
    public Integer quantidadeDeAulas;
    public Professor professor;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Integer getQuantidadeDeAulas() {
        return quantidadeDeAulas;
    }

    public Professor getProfessor() {
        return professor;
    }
}
