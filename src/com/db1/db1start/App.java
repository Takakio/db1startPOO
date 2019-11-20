package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {

    }

    public static Integer soma (Integer numero1, Integer numero2){
        Integer resultado;
        resultado = numero1 + numero2;
        return resultado;
    }

    public static Integer subtracao (Integer numero1, Integer numero2){
        Integer resultado;
        resultado = numero1 - numero2;
        return resultado;
    }

    public static String textoMaiusculo (String texto){
        String textoMaiusc = texto.toUpperCase();
        return textoMaiusc;
    }

    public static String textoMinusculo (String texto){
        String textoMinusc = texto.toLowerCase();
        return textoMinusc;
    }

    public static Double menor (Double numero1, Double numero2){
        if (numero1 < numero2){
            return numero1;
        }
        return numero2;
    }

    public static Double menor (Double numero1, Double numero2, Double numero3){
        return null;
    }

    /*public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero 1: ");
        Integer numero1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Numero 2: ");
        Integer numero2 = scan.nextInt();
        scan.nextLine();

        System.out.println(soma(numero1, numero2));
        System.out.println(subtracao(numero1, numero2));

        //-------------------------------------------------------------

        System.out.println("Digite um texto qualquer");
        String texto = scan.next();
        scan.nextLine();
        System.out.println(textoMaiusculo(texto));
        System.out.println(textoMinusculo(texto));

        //-------------------------------------------------------------

        System.out.println("Numero 1: ");
        Double num1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Numero 2: ");
        Double num2 = scan.nextDouble();
        scan.nextLine();

        System.out.println(menor(num1, num2));

    }
     */
}
