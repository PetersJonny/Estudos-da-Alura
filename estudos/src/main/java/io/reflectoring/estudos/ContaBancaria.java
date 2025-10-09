package io.reflectoring.estudos;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String nome = "Pedro Júlio";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int escolha = 0;
        double soma; 
        double sub;

        System.out.println("\n");
        System.out.println("                                                INFORMAÇÕES DA CONTA");

        System.out.println("\nNome:                           " + nome);
        System.out.println("Tipo da conta:                  " + tipoConta);
        System.out.println("saldo:                          " + saldo);
        System.out.println("\n");

        System.out.println("                                                AÇÕES NO BANCO");

        while(escolha != 4) {
            System.out.println("\nEscolha entre as seguintes opções:");
            System.out.println("\n1- Verificar saldo.");
            System.out.println("2- Enviar valor.");
            System.out.println("3- Receber valor.");
            System.out.println("4- Sair.");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("O valor do seu saldo é de: " + saldo);
            } else if(escolha == 2) {
                System.out.println("Quanto deseja enviar? ");
                sub = sc.nextDouble();
                if(saldo >= sub) {
                    saldo = saldo - sub;
                
                    System.out.println("O novo saldo é: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if(escolha == 3) {
                System.out.println("Quanto deseja receber? ");
                soma = sc.nextDouble();

                saldo = saldo + soma;
                
                System.out.println("O novo saldo é: " + saldo);
            } else if(escolha == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Esse número não está disponivel.");
            }
        }

    }
}
