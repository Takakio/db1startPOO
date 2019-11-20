package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTeste {
    @Test
    public void deveCriarMateriaPorMeioDeConstrutor(){
        String nome = "Banco de dados";
        String descricao = "Select, insert, delete, update";
        Integer cargaHoraria = 40;
        Integer quantidadeDeAulas = 20;
        String professor = "Igor";

        Materia materia = new Materia(nome, descricao, cargaHoraria, quantidadeDeAulas, professor);
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHoraria, materia.getCargaHoraria());
        Assert.assertEquals(quantidadeDeAulas, materia.getQuantidadeDeAulas());
        Assert.assertEquals(professor, materia.getProfessor());


    }

}