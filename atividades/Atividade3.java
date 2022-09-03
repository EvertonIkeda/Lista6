package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r=-1, igual=0;
        double vetor[] = new double[10];
        double repetido[] = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = sc.nextDouble();
            igual = 0;
            for (int j = 0; j < (i+1); j++) {
                if (vetor[i] == vetor[j]) {
                    igual++;
                }
            }
            if (igual > 1) {
                igual = 0;
                for (int j = 0; j < (r+1); j++) {
                    if (vetor[i] == repetido[j]) {
                        igual++;
                    }
                }
                if (igual == 0) {
                    r++;
                    repetido[r] = vetor[i];
                }
            }
        }
        
        if (r > -1) {
            for (int i = 0; i < (r+1); i++) {
            System.out.println("Valor " + repetido[i] + " é repetido");
            }
        }
    }
}