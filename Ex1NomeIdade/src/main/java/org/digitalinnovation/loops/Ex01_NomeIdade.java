package org.digitalinnovation.loops;

import java.util.Scanner;
/*
Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando
o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0
no campo nome)

 */

public class Ex01_NomeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String nome;
        int idade;

        while (true) {

            System.out.print("Nome: ");
            nome = scanner.next();

            if (nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.println("Nome é: " + nome);
            System.out.println("Idade é: " + idade);

        }


    }
}