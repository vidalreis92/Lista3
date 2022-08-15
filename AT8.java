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
public class AT8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5;
        double soma, media;
                
        System.out.println("Insira o Primeiro valor");
        n1 = sc.nextDouble();
        System.out.println("Insira o Segundo valor");
        n2 = sc.nextDouble();
        System.out.println("Insira o Teceiro valor");
        n3 = sc.nextDouble();
        System.out.println("Insira o Quarto valor");
        n4 = sc.nextDouble();
        System.out.println("Insira o Quinto valor");
        n5 = sc.nextDouble();
        
        soma = (n1 + n2 + n3 + n4 + n5);
        media = (soma / 5);
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
