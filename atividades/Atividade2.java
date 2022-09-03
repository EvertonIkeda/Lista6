package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double media=0, maior=0, menor=0;
        double vetor[] = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = sc.nextDouble();
            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
            }
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
            media = media + vetor[i];
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Vetor[" + i + "]: " + vetor[i]);
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A média dos valores é: " + (media / 5));
    }
}