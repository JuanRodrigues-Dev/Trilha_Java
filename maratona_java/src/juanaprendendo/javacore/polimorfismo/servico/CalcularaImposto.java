package juanaprendendo.javacore.polimorfismo.servico;

import juanaprendendo.javacore.polimorfismo.dominio.Computador;
import juanaprendendo.javacore.polimorfismo.dominio.Produto;
import juanaprendendo.javacore.polimorfismo.dominio.Tomate;

public class CalcularaImposto {
    public static void calcularImposto(Produto produto){
        IO.println("Relatótio de Imposto");
        double imposto = produto.calcularImposto();
        IO.println("Produto: "+produto.getNome());
        IO.println("Valor: "+produto.getValor());
        IO.println("Imposto a ser Pago: "+imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate)produto;
            IO.println("Data de Validade: "+tomate.getDataValidade());
        }
    }
}
