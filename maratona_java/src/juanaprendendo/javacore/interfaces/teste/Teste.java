package juanaprendendo.javacore.interfaces.teste;

import juanaprendendo.javacore.interfaces.dominio.DataBAseLoader;
import juanaprendendo.javacore.interfaces.dominio.FileLoader;

public class Teste {
    static void main() {
        DataBAseLoader teste = new DataBAseLoader();
        FileLoader teste01 = new FileLoader();

        teste.load();
        teste01.load();
        teste.remove();
        teste01.remove();
    }
}
