package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTeste {
    @Test
    public void deveCriarProfessorPorMeioDeConstrutor(){
        String nome = "Igor";
        String email = "igor@db1.com.br";
        Professor professor = new Professor(nome, email);
        Assert.assertEquals(nome, professor.getNome());
        Assert.assertEquals(email, professor.getEmail());

    }
}