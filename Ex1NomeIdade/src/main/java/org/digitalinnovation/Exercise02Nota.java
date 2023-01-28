package org.digitalinnovation;

import java.util.Scanner;

public class Exercise02Nota {

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
