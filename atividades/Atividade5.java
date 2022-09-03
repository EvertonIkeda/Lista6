package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        double vetor[] = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = sc.nextDouble();
        }
        
        System.out.println("Código: ");
        codigo = sc.nextInt();
        
        switch (codigo) {
            case 0:
                System.out.println("Finalizado com sucesso");
                System.exit(0);
                break;
            case 1: 
                for (int i = 0; i < 5; i++) {
                    System.out.println("Vetor[" + i + "]: " + vetor[i]);
                }
                break;
            case 2:
                for (int i = 4; i > -1; i--) {
                    System.out.println("Vetor[" + i + "]: " + vetor[i]);
                }
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}