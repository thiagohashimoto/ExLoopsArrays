package org.digitalinnovation.loops;

import java.util.Scanner;

public class Ex06Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int fatorial;
        int multiplicacao = 1;

        System.out.print("Número a ser fatorado: ");

        fatorial = scan.nextInt();

        for (int i = fatorial ; i >= 1 ; i--){

            multiplicacao = multiplicacao * i;

        }

        System.out.println(fatorial + "!= " + multiplicacao);

    }

}
