package com.db1.db1start;

public class Aluno extends Pessoa {
    private Double nota;

    public Aluno(String nome, String email){
        super(nome, email);
    }

    @Override
    public String toString() {
        return super.toString() + "Aluno{" +
                "nota=" + nota +
                '}';
    }
}
