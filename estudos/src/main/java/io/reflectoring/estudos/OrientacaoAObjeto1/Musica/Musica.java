package io.reflectoring.estudos.OrientacaoAObjeto.Musica;

public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("O titulo da música é: " + titulo);
        System.out.println("O artista da música é: " + artista);
        System.out.println("O ano do lancamento é: " + anoLancamento);
    }

    void calculMedia(double aval) {
        avaliacao += aval;
        numAvaliacoes++;
    }

    double retorMedia() {
        return avaliacao / numAvaliacoes;
    }
}
