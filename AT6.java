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
public class AT6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        for (i = 1; i <= 20; i = i + 2) {
            System.out.println(i + " ");

        }

        System.out.println("Gostaria de mostrar os números um ao lado do outro?");
        System.out.println("1-Sim");
        System.out.println("2-Não");
        int menu = sc.nextInt();

        switch (menu) {
            case 1 -> {
                for (i = 1; i <= 20; i = i + 2) {
                    System.out.print(i + " ");
                }
            }
            case 2 ->
                System.out.println("Finalizado com sucesso.");
        }
    }
}
