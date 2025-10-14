package io.reflectoring.estudos.OrientacaoAObjeto1.Filme;

public class Main {
    public static void main(String[] args) {
        
        Filme meuFilme = new Filme();

        meuFilme.nome = "Dragon ball";
        meuFilme.anoDeLancamento = 2018;
        meuFilme.duracaoEmMinutos = 110;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        System.out.printf("Média de avaliações do filme: %.2f", meuFilme.pegaMedia());

    }
}
