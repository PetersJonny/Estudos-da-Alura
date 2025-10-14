package io.reflectoring.estudos.AulaBasica;

import java.util.Scanner;

public class PraticasBasicJava2 {
    public static void main(String[] args) {

        @SuppressWarnings("unused")

        Scanner sc = new Scanner(System.in);

        System.out.println("PRATICA 1");

        int num;

        System.out.println("\nDigite um número positivo ou negativo.");
        num = sc.nextInt();

        if(num > 0){
            System.out.println("Seu número é positivo!");
        } else {
            System.out.println("Seu número é negativo!");
        }

        System.out.println("\nPRATICA 2");

        int num1;
        int num2;

        System.out.println("\nDigite dois números inteiros.");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Os números são iguais!");
        } else if (num1 > num2) {
            System.out.println("Os números são diferentes, onde o primeiro número que você botou é maior que o segundo!");
        } else {
            System.out.println("Os números são diferentes, onde o segundo número que você botou é maior que o primeiro!");
        }

        System.out.println("\nPRATICA 3");

        int escolha;
        double tamanhoLado;
        double raio;

        do{
            System.out.println("\nDigite 1 se quer calcular a área do quadrado e digite 2 para calcular a área do círculo");
            escolha = sc.nextInt();
            
            if(escolha == 1){
                System.out.println("Fale o tamanho de um dos lados do quadrado: ");
                tamanhoLado = sc.nextDouble();

                double areaQuadrado = tamanhoLado * tamanhoLado;

                System.out.printf("A área do quadrado é: %.2f", areaQuadrado);
            } else if(escolha == 2) {
                System.out.println("Fale o raio do círculo: ");
                raio = sc.nextDouble();

                double areaCirculo = 3.14 * (raio * raio);

                System.out.printf("A área do círculo é: %.2f", areaCirculo);
            } else {
                System.out.println("O número que digitou não é uma opção!");
            }
        } while (escolha != 1 && escolha != 2);

        System.out.println("\n\nPRATICA 4");

        int numTabuada;
        int cont = 1;

        System.out.println("\nDigite um número para saber a tabuada dele entre 1 a 10: ");
        numTabuada = sc.nextInt();

        System.out.println("Tabuada:");

            while(cont <= 10) {
                System.out.println("\n" + numTabuada + " X " + cont + "= " + numTabuada * cont);
                cont++;
            }
        
        System.out.println("\nPRATICA 5");

        int tipoNum;

        System.out.println("Digite um número inteiro: ");
        tipoNum = sc.nextInt();

        if(tipoNum == 0 || tipoNum % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }

        System.out.println("\nPRATICA 6");

        int numFat;

        System.out.println("\nVamos ver o fatorial de um número? Escolha um número: ");
        numFat = sc.nextInt();

        int resultadoFat = 1;

        for(int n = 1; n <= numFat; n++){
            resultadoFat *= n;
        }

        System.out.println("O resultado da fatoração é: " + resultadoFat);

    }
}
