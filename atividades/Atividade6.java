package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        double vetor[] = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = sc.nextDouble();
        }
        System.out.println("Informe o valor de x: ");
        x = sc.nextInt();
        
        System.out.println("Multiplos de " + x + ": ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % x == 0 && vetor[i] >= x) {
                System.out.println(vetor[i]);
            }
        }
    }
}