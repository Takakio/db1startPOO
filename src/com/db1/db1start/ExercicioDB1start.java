package com.db1.db1start;

import java.util.*;

public class ExercicioDB1start {

    public static void main(String[] args) {
        //---Exercicio-1-------------------------------------------------------------
        retornaCores();
        linha();

        //---Exercicio-2-------------------------------------------------------------

        ArrayList<String> compras = new ArrayList();
        compras.addAll(Arrays.asList("Arroz", "Feijão", "Açucar", "Café", "Pão"));
        System.out.println(contaItens(compras));
        linha();

        //---Exercicio-3-------------------------------------------------------------
        System.out.println(recebeTresStringsEDeletaASegunda("Azul", "Roxo", "Amarelo"));
        linha();

        //---Exercicio-4-------------------------------------------------------------
        imprimeLista();
        linha();

        //---Exercicio-5-------------------------------------------------------------
        imprimeListaOrdenada();
        linha();

        //---Exercicio-6-------------------------------------------------------------
        removeDaLista(retornaCores(), "Amarelo");
        linha();

        //---Exercicio-7-------------------------------------------------------------
        imprimeListaOrdenadaInversa(retornaCores());
        linha();

        /*Map<String, List<Integer>> paresEImpares = separaParImpar(Arrays.asList(1,1,2,3,5,7,12,19,31)
                .forEach((chave, valor) -> System.out.println(chave + ": " + valor));
        */
        //---Exercicio-8-------------------------------------------------------------
       /*ArrayList<Integer> listaDeNumeros = new ArrayList();
        listaDeNumeros.addAll(Arrays.asList(4,8,9,7,6,2,3,4,10,15,21,23,24,28,30));
        parOuImpar(listaDeNumeros);
        System.out.println(mapaParImpar);

        */
    }

    private static void linha(){
        System.out.println("-----------------------------------------------------------------------------");
    }
    private static ArrayList<String> retornaCores(){
        ArrayList<String> cores = new ArrayList();
        cores.add("Branco");
        cores.add("Preto");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Grafite");
        return cores;
    }

    private static int contaItens(List<String> compras){
        return compras.size();
    }

    private static ArrayList<String> recebeTresStringsEDeletaASegunda(String cor1, String cor2, String cor3){
        ArrayList<String> cores = new ArrayList();
        cores.addAll(Arrays.asList(cor1,cor2,cor3));
        cores.remove(1);
        return cores;
    }

    private static void imprimeLista(){
        retornaCores().forEach(System.out::println);
    }

    private static void imprimeListaOrdenada(){
        List<String> cores = retornaCores();
        Collections.sort(cores);
        cores.forEach(System.out::println);
    }

    private static void removeDaLista(List<String> cores, String corASerRemovida){
        cores.remove(corASerRemovida);

    }

    private static void imprimeListaOrdenadaInversa(List<String> cores){
        Collections.sort(cores);
        Collections.reverse(cores);
        cores.forEach(System.out::println);
    }

    /*private static Map<String, List<Integer>> separaParImpar(List<Integer> numeros){
        Map<String, List<Integer>> mapa = new HashMap<>();
        mapa.put("PAR", ArrayList;());
        mapa.put("IMPAR", ArrayList;());
        numeros.forEach(n -> {
            if (n % 2 == 0){
                mapa.get("PAR").add(n);
            } else {
                mapa.get("IMPAR").add(n);
            }
        });
        return mapa


    }  */
    /*private static Map<String, Integer> parOuImpar(List<Integer> listaDeNumeros){
        HashMap<Integer, String> mapaParImpar = new HashMap();
        for (int i = 0; i < listaDeNumeros.size(); i++){
            if (listaDeNumeros(i) % 2 == 0){
                mapaParImpar("Par", listaDeNumeros(i));
            } else {
                mapaParImpar("impar", listaDeNumeros(i));
            }
        }

        return mapaParImpar;
    }*/

}