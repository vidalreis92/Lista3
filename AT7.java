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
public class AT7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [5];
        int maior = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número: ");
            a[i] = sc.nextInt();
            
            if (a[i] > maior) {
                maior = a[i];
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
