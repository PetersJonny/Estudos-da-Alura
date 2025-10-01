package io.reflectoring.estudos;

public class PraticasBasicJava1 {
    
public static void main(String[] args) {

    System.out.println("PRATICA 1");
    double x = 10.2;
    double y = 11.1;
    double media = (x + y) /2;

    System.out.printf("A média de %.2f com %.2f é: %.2f", x, y, media);

    System.out.println("\n\nPRATICA 2");
    double n = 2.5;
    int m = 1;

    System.out.println("N antes do casting: " + n);
    
    int casting = (int) (n);

    System.out.println("N ficou " + casting + ", assim como m é inteiro, valor de m: " + m);

    System.out.println("\nPRATICA 3");
    char letra = 'n';
    String palavra = "Nigger";

    System.out.println("A letra é: " + letra + ", e a palavra é: " + palavra);

    System.out.println("\nPRATICA 4");
    double precoProduto = 2.0;
    int quantidade = 6;
    double valorTotal = precoProduto * quantidade;

    System.out.println("O valor total é: " + valorTotal);

    System.out.println("\nPRATICA 5");
    double valorEmDolares = 43;
    double valorEmReais = valorEmDolares * 4.94;
    
    System.out.printf("O valor de %.2f dolares em reais é: %.2f", valorEmDolares, valorEmReais);

    System.out.println("\n\nPRATICA 6");
    double precoOriginal = 12;
    double percentualDesconto = 10;
    double calculoDoDesconto = (precoOriginal * percentualDesconto) / 100;
    double valorTotal2 = precoOriginal - calculoDoDesconto;

    System.out.println("O valor do produto era: " + precoOriginal + ", com o desconto de " + percentualDesconto + " o valor ficou: " + valorTotal2);
}

}
