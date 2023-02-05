package org.digitalinnovation.loops;

import java.util.Scanner;

/*

Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

 */

public class Ex06_Fatorial {

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
