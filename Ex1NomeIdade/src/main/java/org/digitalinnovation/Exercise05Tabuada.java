package org.digitalinnovation;

import java.util.Scanner;

public class Exercise05Tabuada {

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
