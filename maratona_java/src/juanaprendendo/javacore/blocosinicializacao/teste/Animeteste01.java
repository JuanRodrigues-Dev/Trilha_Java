package juanaprendendo.javacore.blocosinicializacao.teste;

import juanaprendendo.javacore.blocosinicializacao.dominio.Anime;

public class Animeteste01 {
    static void main() {
        Anime anime = new Anime("onepiece");

        IO.println(anime.getNome());



    }
}
