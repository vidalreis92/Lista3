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
public class AT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, civ;
        int idade;
        double salario;

        System.out.println("insira um Nome: ");
        nome = sc.next();

        if (nome.length() <= 3) {
            System.out.println("Inválido, 'Nome' precisa ter mais que 3 caracteres");
            System.exit(0);
        }

        System.out.println("Insira uma Idade: ");
        idade = sc.nextInt();

        if ((idade <= 0) || (idade >= 150)) {
            System.out.println("Inválido, 'Idade' precisa ser entre 0 e 150");
            System.exit(0);
        }

        System.out.println("Insira seu Salário");
        salario = sc.nextDouble();

        if (salario <= 0) {
            System.out.println("Inválido, 'Salário' precisa ser maior que 0");
            System.exit(0);
        }

        System.out.println("Insira seu Sexo");
        System.out.println("f - para Mulher");
        System.out.println("m - para Homem");
        sexo = sc.next();

        if (((sexo.equals("f")) || (sexo.equals("m")))) {
        } else {
            System.out.println("Inválido, 'Sexo' prexisa ser f ou m");
            System.exit(0);
        }

        System.out.println("Insira seu Estaco Civil");
        System.out.println("s - para Solteiro(a)");
        System.out.println("c - para Casado(a)");
        System.out.println("v - para Viúvo(a)");
        System.out.println("d - para Divorciado(a)");
        civ = sc.next();

        if (((civ.equals("s")) || (civ.equals("c")) || (civ.equals("v")) || (civ.equals("d")))) {
        } else {
            System.out.println("Inválido, Estado Civil precisa ser igual á 's', 'c', 'v' ou 'd'");
            System.exit(0);
        }
        System.out.println("Todos os dados foram validados com sucesso");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + civ);
    }
}
