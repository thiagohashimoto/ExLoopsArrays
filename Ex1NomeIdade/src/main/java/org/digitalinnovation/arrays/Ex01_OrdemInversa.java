package org.digitalinnovation.arrays;

import java.util.Scanner;

public class Ex01_OrdemInversa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeros = {0,1,2,3,4};
        int count = 0;

        while (count<(numeros.length)){

            System.out.print("Número: ");

            numeros[count] = scan.nextInt();

            count++;
        }

        for (int i = numeros.length-1; i >= 0; i--){

            System.out.println(numeros[i] + " ");

        }

    }

}
