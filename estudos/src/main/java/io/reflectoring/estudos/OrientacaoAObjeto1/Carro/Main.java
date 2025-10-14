package io.reflectoring.estudos.OrientacaoAObjeto1.Carro;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "R8";
        meuCarro.anoCarro = 2003;
        meuCarro.cor = "Azul";

        meuCarro.exibirFichaCarro();

        System.out.println("O carro tem " + meuCarro.IdadeCarro() + " anos");

    }
}
