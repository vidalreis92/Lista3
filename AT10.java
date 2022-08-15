/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import java.util.Scanner;

/**
 *
 * @author Vidal Reis
 */
public class AT10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println("Insira dois números para ver os números entre eles");
        System.out.println("");
        System.out.println("Insira o primeiro número:");
        n1 = sc.nextInt();
        System.out.println("Insira o segundo número:");
        n2 = sc.nextInt();

        soma = (n1 + n2);

        System.out.println("Escolha o que deseja");
        System.out.println("1-Ordem Crescente");
        System.out.println("2-Ordem Descrescente");
        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> {
                System.out.println("Os números que estão entre eles são:");
                if (n1 > n2) {
                    for (int i = (n2 + 1); i < n1; i++) {
                        System.out.print(i + " ");
                    }
                }
                if (n2 > n1) {
                    for (int i = (n1 + 1); i < n2; i++) {
                        System.out.print(i + " ");
                    }
                }
            }
            case 2 -> {
                System.out.println("Os números que estão entre eles são:");
                if (n2 > n1) {
                    for (int i = (n2 - 1); i > n1; i--) {
                        System.out.print(i + " ");
                    }
                }
                if (n1 > n2) {
                    for (int i = (n1 - 1); i > n2; i--) {
                        System.out.print(i + " ");
                    }
                }
            }
            default -> {
                System.out.println("Inválido, Finalizado com sucesso.");
            }
        }
        System.out.println("");
        System.out.println("A soma entre os dois números é: " + soma);
    }
}
