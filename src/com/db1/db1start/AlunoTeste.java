package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTeste {
    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        String nome = "Jessica";
        String email = "jessica@gmail.com";
        Aluno aluno = new Aluno (nome,email);
        Assert.assertEquals(nome, aluno.getNome());
        Assert.assertEquals(email, aluno.getEmail());


    }
}