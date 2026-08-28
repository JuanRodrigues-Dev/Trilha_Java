package juanaprendendo.javacore.classeabstrata.teste;

import juanaprendendo.javacore.classeabstrata.dominio.Funcionario;
import juanaprendendo.javacore.classeabstrata.dominio.Gerente;

public class Funcionario01 {
    static void main() {
        Gerente gerente = new Gerente("Joana", 13000);
        IO.println(gerente);
        IO.println(gerente.calcularBonus());
        gerente.imprimme();
    }
}
