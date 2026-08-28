package juanaprendendo.javacore.associacao.teste;

import juanaprendendo.javacore.associacao.dominio.Jogador;
import juanaprendendo.javacore.associacao.dominio.Time;

public class JogadorTeste02 {
    static void main() {
        Jogador jogador1 = new Jogador("Juan");
        Time time = new Time("Botafogo");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
