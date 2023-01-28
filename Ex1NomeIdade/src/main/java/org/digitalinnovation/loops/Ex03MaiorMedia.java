package org.digitalinnovation.loops;

import java.util.Scanner;

public class Ex03MaiorMedia {

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
