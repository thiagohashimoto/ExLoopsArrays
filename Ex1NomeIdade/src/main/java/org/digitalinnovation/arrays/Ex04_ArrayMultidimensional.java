package org.digitalinnovation.arrays;

/*

Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Após isso determine o menor número da matriz e a sua posição(linha, coluna).

 */

import java.util.Random;

public class Ex04_ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();
        int menor = 9;
        int posLinha = 0;
        int posColuna = 0;

        int[][] matrizAleatoria = new int[4][4];

        for (int i = 0; i < matrizAleatoria.length ; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {

                int numero = random.nextInt(9);
                matrizAleatoria[i][j] = numero;
                if (menor >= matrizAleatoria[i][j]){
                    menor = matrizAleatoria[i][j];
                    posLinha = i + 1;
                    posColuna = j + 1;
                }
            }
        }
        System.out.println("Matriz: ");

        for (int[] linha : matrizAleatoria ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
        System.out.println("Menor número da matriz: " + menor);
        System.out.println("Posição: " + posLinha + "x" + posColuna);
        }
}

