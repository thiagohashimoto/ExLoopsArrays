package org.digitalinnovation.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex03_NumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[20];
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        while (count < numeros.length){
            System.out.print("Digite um número: ");
            numeros[count] = scan.nextInt();
            while (numeros[count]<0 || numeros[count]>100){
                System.out.print("Digite novamente: ");
                numeros[count] = scan.nextInt();
            }
            count++;
        }

        System.out.print("Números: {");

        while (count1 < numeros.length-1){

            System.out.print(numeros[count1] + ", ");

            count1++;

        }

        System.out.print(numeros[19] + "}");

        System.out.println(" ");

        System.out.print("Números Sucessivos: {");

        while (count2 < numeros.length-1){

            System.out.print(numeros[count2] + ", ");

            count2++;

        }

        System.out.print(numeros[19] + "}");





    }

}
