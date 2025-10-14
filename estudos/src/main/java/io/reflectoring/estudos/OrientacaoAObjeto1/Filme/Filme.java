package io.reflectoring.estudos.OrientacaoAObjeto1.Filme;

public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDasAvaliacoes;

    void exibeFichaTecnica() {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);

    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDasAvaliacoes;
    }

}
