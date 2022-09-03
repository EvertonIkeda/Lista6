package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int negativo=0;
        double soma=0;
        double vetor[] = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] < 0) {
                negativo++;
            } else {
                soma = soma + vetor[i];
            }
        }
        
        System.out.println("Quantidade de valores negativos: " + negativo);
        System.out.println("Soma dos valores positivos: " + soma);
    }
}