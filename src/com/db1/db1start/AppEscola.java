package com.db1.db1start;

import java.util.ArrayList;
import java.util.Date;

public class AppEscola {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Leandro", "leandro@gmail.com");

        Aluno aluno2 = new Aluno("Fernanda", "fernanda@gmail.com");

        Professor professor1 = new Professor("Igor Silva", "igor.silva@db1.com.br");

        Materia materia = new Materia();
        materia.nome = "POO";
        materia.descricao = "Abstração, encapsulamento, herança e polimorfismo";
        materia.cargaHoraria = 12;
        materia.quantidadeDeAulas = 3;
        materia.professor = professor1;

        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.alunos = new ArrayList<>();

    }
}
