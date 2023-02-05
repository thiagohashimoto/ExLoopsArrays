package org.digitalinnovation.loops;

import java.util.Scanner;

/*

Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

 */

public class Ex03_MaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 0;
        int numero;
        int maior = 0;
        int soma = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) {
                maior = numero;
            }

            contador++;

        }while (contador < 5);

        int media = soma/5;

        System.out.println("Número maior: " + maior);
        System.out.println("Média: " + media);

    }

}
