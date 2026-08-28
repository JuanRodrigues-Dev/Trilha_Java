package juanaprendendo.javacore.polimorfismo.teste;

import juanaprendendo.javacore.polimorfismo.dominio.Computador;
import juanaprendendo.javacore.polimorfismo.dominio.Produto;
import juanaprendendo.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main() {
        Produto produto = new Computador("Azus",4000);
        IO.println(produto.getNome());
        IO.println(produto.getValor());
        IO.println(produto.calcularImposto());
        IO.println("--------------------------------------");
        Produto produto2 = new Tomate("Americana",20);
        IO.println(produto2.getNome());
        IO.println(produto2.getValor());
        IO.println(produto2.calcularImposto());
        IO.println("--------------------------------------");
    }
}
