package org.digitalinnovation.arrays;

/*

Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

 */

import java.util.Scanner;

public class Ex01_OrdemInversa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        int count = 0;

        while (count<(numeros.length)){

            System.out.print("Número: ");

            numeros[count] = scan.nextInt();

            count++;
        }

        for (int i = numeros.length-1; i >= 0; i--){

            System.out.print(numeros[i] + " ");

        }

    }

}
