package juanaprendendo.javacore.polimorfismo.teste;

import juanaprendendo.javacore.polimorfismo.dominio.Computador;
import juanaprendendo.javacore.polimorfismo.dominio.Produto;
import juanaprendendo.javacore.polimorfismo.dominio.Tomate;
import juanaprendendo.javacore.polimorfismo.servico.CalcularaImposto;

public class ProdutoTest03 {
    static void main() {
        Produto produto = new Computador("Azus",4000);

        Tomate tomate= new Tomate("Americana",20);
        tomate.setDataValidade("11/11/2026");

        CalcularaImposto.calcularImposto(tomate);
        IO.println("-----------------------------------------------");
        CalcularaImposto.calcularImposto(produto);
    }
}
