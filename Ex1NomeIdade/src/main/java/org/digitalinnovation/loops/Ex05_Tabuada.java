package org.digitalinnovation.loops;

/*

Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.

 */

import java.util.Scanner;

public class Ex05_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Tabuada do número: ");
        numero = scan.nextInt();


        for (int i = 1 ; i < 11 ; i++){

            System.out.println(numero + " X " + i + " = " + (numero * i));

        }


    }
}
