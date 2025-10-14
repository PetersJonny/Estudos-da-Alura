package io.reflectoring.estudos.OrientacaoAObjeto1.Musica;

public class Main {
    public static void main(String[] args) {
        
        Musica favMusica = new Musica();

        favMusica.titulo = "Legends Never Die";
        favMusica.artista = "J.Fla";
        favMusica.anoLancamento = 2018;
        
        favMusica.exibirFichaTecnica();

        favMusica.calculMedia(10);
        favMusica.calculMedia(7);
        favMusica.calculMedia(9);

        System.out.printf("A média é %.2f", favMusica.retorMedia());

    }
}
