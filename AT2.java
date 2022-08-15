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
public class AT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String senha;
        do {
            System.out.println("Insira um nome: ");
            nome = sc.next();
            
            System.out.println("Insira uma senha: ");
            senha = sc.next();
            
            if ((nome).equals(senha)) {
                
                System.out.println("");
                System.out.println("O nome não pode ser igual a senha");
                System.out.println("");
                
            }
        } while (senha.equals(nome));
        System.out.println("");
        System.out.println("Sucesso");
    }
}
