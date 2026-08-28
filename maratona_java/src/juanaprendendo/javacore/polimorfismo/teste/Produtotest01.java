package juanaprendendo.javacore.polimorfismo.teste;

import juanaprendendo.javacore.polimorfismo.dominio.Computador;
import juanaprendendo.javacore.polimorfismo.dominio.Televisao;
import juanaprendendo.javacore.polimorfismo.dominio.Tomate;
import juanaprendendo.javacore.polimorfismo.servico.CalcularaImposto;

public class Produtotest01 {
    static void main() {
        Computador computador = new Computador("Acer", 5000);
        Tomate tomate = new Tomate("Sereja", 10);
        Televisao  tv = new Televisao("Samsung", 1500);
        CalcularaImposto.calcularImposto(computador);
        IO.println("-----------------------------------------------");
        CalcularaImposto.calcularImposto(tomate);
        IO.println("-----------------------------------------------");
        CalcularaImposto.calcularImposto(tv);
    }
}
