package org.digitalinnovation.arrays;

import java.util.Random;

public class Ex04_ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();
        int menor = 0;

        int[][] matrizAleatoria = new int[4][4];

        for (int i = 0; i < matrizAleatoria.length ; i++) {
            for (int j = 0; j < matrizAleatoria[i].length; j++) {

                int numero = random.nextInt(9);
                matrizAleatoria[i][j] = numero;

                if (menor >= numero){
                    menor = numero;
                }
            }
        }

    }
}
