package juanaprendendo.javacore.construtores.teste;

import juanaprendendo.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    static void main() {
        Anime anime01 = new Anime("Espada 01", "TV" , 12 , "Acão","Ahk");
        //anime01.init("Espada 01", "TV" , 12 , "Acão");
        anime01.imprime();

    }

}
