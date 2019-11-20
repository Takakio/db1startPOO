package com.db1.db1start;

public class Application {

    public Integer soma (Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    public Integer subtracao (Integer numero1, Integer numero2){
        return numero1 - numero2;
    }

    public Integer multiplicacao (Integer numero1, Integer numero2){
        return numero1 * numero2;
    }

    public Integer divisao (Integer numero1, Integer numero2){
        return numero1 / numero2;
    }

    public Integer par (Integer numero1){
        return numero1 % 2;
    }

    public Integer maior(Integer numero1, Integer numero2){
        if (numero1 > numero2){
            return numero1;
        }
        return numero2;
    }

    public Integer quantosImpares(Integer numero1){
        Integer i;
        i = 0;
        Integer contador;
        contador = 0;

        while(i <= numero1){
            if (i % 2 != 0) {
                contador = contador +1;
            }
            i++;
        }
        return contador;
    }

    //-----------------------------------------------------------------------------------------------------------------------

    public String maiusculo(String texto){
        String textoMaiusculo = texto.toUpperCase();
        return textoMaiusculo;

    }

    public String minusculo(String texto){
        String textoMinusculo = texto.toLowerCase();
        return textoMinusculo;

    }

    public Integer contaLetrasDB1start(String texto){
        Integer quantidadeDeLetrasDB1start = texto.length();
        return quantidadeDeLetrasDB1start;
    }
    private String removeNumerosDaString(String texto){
        String removeNumerosDaString;
        return texto.replaceAll("[0-9]", "");
    }


    public Integer contaLetrasSemEspacos(String texto){
        String textoSemEspacos = texto.trim();
        Integer quantasLetras = textoSemEspacos.length();
        return quantasLetras;
    }

    public String apenasPrimeirasLetras(String texto){
        String primeirasLetras = texto.substring(0,4);
        return primeirasLetras;
    }

    public String aPartirDaTerceiraLetra(String texto){
        String restoDaPalavra = texto.substring(3);
        return restoDaPalavra;
    }

    public String apenasUltimasLetras(String texto){
        String textoSemEspacos = texto.trim();
        Integer contaLetras = textoSemEspacos.length();
        String ultimasLetras = textoSemEspacos.substring(contaLetras-4);
        return ultimasLetras;
    }

    public String trocaNomePorAluno(String texto){
        Integer indiceEspaco = texto.indexOf(" ");
        String nomeTratado = texto.substring(indiceEspaco);
        String aluno = "Aluno";
        return aluno.concat(nomeTratado);
    }

    public String[] separaPalavras(String texto) {
        String[] textoDividido = texto.split(", ");
        return textoDividido;
    }

    public Integer quantidadeVogais(String texto){
        return texto
                .trim()
                .replace(" ", "")
                .toUpperCase()
                .replaceAll("[^AEIOU]", "")
                .length();
    }

    public String textoReverso(String texto) {
        String inverso = "";
        for (Integer i = texto.length() - 1; i >= 0; i--)
            inverso += texto.charAt(i);
        return inverso;
    }

    public Double menorValor(Double numero1, Double numero2){
        if (numero1 < numero2){
            return numero1;
        }
        return numero2;
    }

    public Double menorValorEntreTres(Double numero1, Double numero2, Double numero3){
        Double menor;
        if (numero1 < numero2){
            menor = numero1;
        } else {
            menor = numero2;
        }
        if (menor < numero3){
            return menor;
        }
        return numero3;
    }

    public Double mediaEntreTresNumeros(Double numero1, Double numero2, Double numero3){
        Double soma;
        Double media;
        soma = numero1 + numero2 + numero3;
        return media = soma / 3;
    }

    public Double areaDoTriangulo(Double base, Double altura){
        Double area;
        return area = (base*altura)/2;
    }


}
