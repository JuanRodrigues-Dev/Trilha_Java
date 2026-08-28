package juanaprendendo.javacore.associacao.teste;

import juanaprendendo.javacore.associacao.dominio.Jogador;
import juanaprendendo.javacore.associacao.dominio.Time;

public class JogadorTeste03 {
    static void main() {
        Jogador jogador = new Jogador("Cafú");
        Time time = new Time("Brasil");
        Jogador [] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        IO.println("-----Jogador-----");

        jogador.imprime();

        IO.println("-----Time-----");
        time.imprime();
    }
}
