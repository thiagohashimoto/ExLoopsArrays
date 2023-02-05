package org.digitalinnovation.loops;

import java.util.Scanner;

/*

Nota: Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido.

 */

public class Ex02_Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota = 11;

        while (nota < 0 || nota > 10){

            System.out.print("Digite uma nota de 0 a 10: ");

            nota = scan.nextInt();

            if (nota < 0 || nota > 10){
                System.out.println("Nota inválida!");
            }

        }

        System.out.println("Sua nota é: " + nota);


    }

}
