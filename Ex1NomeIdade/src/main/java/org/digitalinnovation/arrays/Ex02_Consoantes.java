package org.digitalinnovation.arrays;

/*

Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

 */

import java.util.Scanner;

public class Ex02_Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int qtdconsoantes = 0;
        int count = 0;

        String[] consoante = new String[6];

        while(count < consoante.length){

            System.out.print("Letra: ");
            String letra = scan.next();


            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                qtdconsoantes++;
                consoante[count] = letra;
            }
            count++;
        }

        System.out.println("Consoantes: ");
        for (String consoantes: consoante) {
            if (consoantes != null) {
                System.out.print(consoantes + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + (qtdconsoantes));


    }

}
