package com.db1.db1start;

import java.util.*;

public class UsandoSets {
    public static void main(String[] args) {
        /*Set<String> personagens = new HashSet<>();
        personagens.add("Goku");
        personagens.add("Raito");
        personagens.add("Kira");
        personagens.add("L");
        personagens.add("Ryuuki");
        personagens.add("Kira");

        System.out.println(personagens);

        personagens.forEach(System.out::println);

        personagens.remove("L");
        System.out.println(personagens);

        Optional<String>maybeKira = personagens.stream()
                .filter(s -> s.equals("Kira"))
                .findFirst();
        if (maybeKira.isPresent()){
            System.out.println(maybeKira.get());
        }


        maybeKira.ifPresent(kira -> System.out.println(kira));

        ArrayList<String> ordenados = new ArrayList<>(personagens);
        Collections.sort(ordenados);
        System.out.println(ordenados);
        */

        //Crie um set com uma lista de nomes com 5 nomes sendo adicionados mais de uma vez

        //Remova os nomes "Suzete" ou começados com "F" ou terminados em "naldo"

        //Encontre no set "Suzana" ou não... Se existir, exiba com todas as letras maiusculas

        //Em um set com números inteiros encontre o menor, o maior, a soma e a média

        Set<String> nomes = new HashSet<>();
        nomes.add("Giovanna");
        nomes.add("Alessandra");
        nomes.add("Leticia");
        nomes.add("Alessandra");
        nomes.add("Alessandra");
        nomes.add("Paulo");
        nomes.add("Fabiana");
        nomes.add("Leandro");
        nomes.add("Alessandra");
        nomes.add("Julia");
        nomes.add("Alessandra");
        nomes.add("Suzana");
        System.out.println(nomes);

        nomes.remove("Suzete");

        nomes.removeIf(nome -> nome.startsWith("F"));

        System.out.println(nomes);

        Optional<String> procuraSuzana = nomes.stream()
                .filter(nome -> nome.equals("Suzana"))
                .findFirst();
        if (procuraSuzana.isPresent()){
            System.out.println("Suzana esta presente");
        } else {
            System.out.println("Suzana não existe");
        }

        HashSet<Integer> numeros = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Integer[] min = {Integer.MAX_VALUE};
        Integer[] max = {Integer.MIN_VALUE};
        Integer[] soma = {0};
        numeros.forEach(n -> {
            min[0] = n < min[0] ? n : min[0];
            max[0] = n > max[0] ? n : max[0];
            soma[0] += n;
        });

        System.out.println(min);
        System.out.println(max);
        System.out.println(soma);
    }
}
