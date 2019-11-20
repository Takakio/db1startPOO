package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import javax.swing.*;

public class AppTest {

    @Test

    public void deveSomarERetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(-5,10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSomarERetornar3(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.soma(0,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSomarERetornar7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.soma(4,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSubtrairEretornar9(){
        Application application = new Application();
        Integer expected = 9;
        Integer response = application.subtracao(18,9);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMultiplicarERetornar15(){
        Application application = new Application();
        Integer expected = 15;
        Integer response = application.multiplicacao(3,5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveDividirERetornar20(){
        Application application = new Application();
        Integer expected = 20;
        Integer response = application.divisao(60,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveVerificarNumeroPar(){
        Application application = new Application();
        Integer expected = 0;
        Integer response = application.par(12);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveRetornarOMaior(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.maior(10,8);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveRetornarQuantidadeDeImpares(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.quantosImpares(10);
        Assert.assertEquals(expected,response);
    }

    @Test
    public void DeveRetornarTextoMaiusculo(){
        Application application = new Application();
        String expected = "LEANDRO";
        String response = application.maiusculo("leandro");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveRetornarTextoMinusculo(){
        Application application = new Application();
        String expected = "leandro";
        String response = application.minusculo("LEANDRO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveRetornarQuantidadeDeLetrasDB1start(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.contaLetrasDB1start("DB1Start");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveRetornarQuantidadeDeLetrasSemEspacos(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.contaLetrasSemEspacos(" DB1Start ");
        Assert.assertEquals(expected, response);
    }

    @Test

    public void DeveraRetornarApenasPrimeirasLetras(){
        Application application = new Application();
        String expected = "Lean";
        String response = application.apenasPrimeirasLetras("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test

    public void DeveraRetornarAPartirDaTerceiraLetra(){
        Application application = new Application();
        String expected = ("ndro Mikio Takahashi");
        String response = application.aPartirDaTerceiraLetra("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void DeveRetornarApenasUltimasLetras(){
        Application application = new Application();
        String expected = ("ashi");
        String response = application.apenasUltimasLetras("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void trocaNomePorAluno(){
        Application application = new Application();
        String expected = ("Aluno Mikio Takahashi");
        String response = application.trocaNomePorAluno("Leandro Mikio Takahashi");
        Assert.assertEquals(expected, response);
    }

    @Test

    public void separaPalavras(){
        Application application = new Application();
        String[] expected = new String[]{"banana", "maçã", "melancia"};
        String[] response = application.separaPalavras("banana, maçã, melancia");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveContarQuantidadeDeVogais(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.quantidadeVogais("LEANDRO");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarOTextoInverso(){
        Application application = new Application();
        String expected = ("trats1BD");
        String response = application.textoReverso("DB1start");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarOMenorValor(){
        Application application = new Application();
        Double expected = 10.8;
        Double response = application.menorValor(10.8,20.5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarOMenorValorEntreTres(){
        Application application = new Application();
        Double expected = 3.2;
        Double response = application.menorValorEntreTres(7.8,5.4,3.2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarAMediaEntreTresNumeros(){
        Application application = new Application();
        Double expected = 11.333333333333334;
        Double response = application.mediaEntreTresNumeros(10.0,17.0,7.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarAAreaDoTriangulo(){
        Application application = new Application();
        Double expected = 6.0;
        Double response = application.areaDoTriangulo(3.0,4.0);
        Assert.assertEquals(expected,response);
    }

}
