package org.digitalinnovation.loops;

import java.util.Scanner;

public class Ex04ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int limit;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.print("Quantos números serão processados: ");
        limit = scan.nextInt();

        do {

            System.out.print("Número: ");
            numero = scan.nextInt();

            if ((numero % 2) == 0) {
                par++;
            }
            else {
                impar++;
            }
            count++;

        } while (count < limit);

        System.out.println("Quantidade de pares: " + par);
        System.out.println("Quantidade de ímpares: " + impar);


    }
}
