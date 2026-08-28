package juanaprendendo.javacore.associacao.teste;

import juanaprendendo.javacore.associacao.dominio.Escola;
import juanaprendendo.javacore.associacao.dominio.Professor;

public class EscolaTeste01 {
    static void main() {
        Professor professor = new Professor("Juan");
        Professor professor1 = new Professor("Tobi");
        Professor [] professors= {professor,professor1};
        Escola escola = new Escola("Academia Vila",professors);

    }
}
