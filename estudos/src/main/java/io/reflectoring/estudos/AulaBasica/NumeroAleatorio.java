package io.reflectoring.estudos.AulaBasica;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);

        System.out.println("Tente acertar o número de 1 a 100, você tem 5 tentativas: ");

        int num = 0;

        for (int i = 0; i < 5; i++) {
            num = scanner.nextInt();

            if(num == numeroGerado) {
                System.out.println("Você acertou o número!!!");
                break;
            } else if(num < numeroGerado) {
                System.out.println("O número que digitou é menor que o número.");
            }else{
                System.out.println("O número que digitou é maior que o número.");
            }
        }

        if(num != numeroGerado) {
            System.out.println("Você errou o número, o número era " + numeroGerado + ", mais sorte da próxima vez!");
        }

    }
}
