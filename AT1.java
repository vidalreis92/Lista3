/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista3;

import java.util.Scanner;

/**
 *
 * @author Vidal Reis
 */
public class AT1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
         
            System.out.println("Insira uma nota válida");
            nota = sc.nextInt();
            
        } while ((0 > nota) || (nota > 10));
    }
}
