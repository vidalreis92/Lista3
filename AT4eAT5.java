package com.mycompany.forr;

import java.util.Scanner;

/**
 *
 * @author Vidal Reis
 */
public class AT4eAT5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 80000, b = 200000;
        double c = 0, d = 0;
        double x, y;
        int anos = 0;
        int anoss = 0;

        while (b >= a) {
            a += (a * 0.03);
            b += (b * 0.015);
            anos++;

        }
        System.out.println("A população do país A: " + a);
        System.out.println("A população do país B: " + b);
        System.out.println("Se passaram " + anos + " Anos");

        System.out.println("Insira a população do país C");
        c = sc.nextDouble();

        System.out.println("Insira a população do país D");
        d = sc.nextDouble();

        System.out.println("Insira a taxa de crescimento do país C");
        x = sc.nextDouble();

        System.out.println("Insira a taxa de crescimento do país D");
        y = sc.nextDouble();

        while (d >= c) {
            c += ((c * x) / 100);
            d += ((d * y) / 100);
            anoss++;
        }
        System.out.println("A população do país C: " + c);
        System.out.println("A população do país D: " + d);
        System.out.println("Se passaram " + anoss + " Anos");
    }
}
