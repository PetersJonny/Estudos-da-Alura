package io.reflectoring.estudos.OrientacaoAObjeto1.Carro;

public class Carro {
    String modelo;
    int anoCarro;
    String cor;
    int ano;

    void exibirFichaCarro() {
        System.out.println("Modélo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    int IdadeCarro() {
        ano = 2025;
        return ano - anoCarro;
    }
}
