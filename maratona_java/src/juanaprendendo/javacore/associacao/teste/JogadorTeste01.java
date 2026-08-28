package juanaprendendo.javacore.associacao.teste;

import juanaprendendo.javacore.associacao.dominio.Jogador;

public class JogadorTeste01 {
    static void main() {
        Jogador jogador01 = new Jogador("Pele");
        Jogador jogador02 = new Jogador("Ronaldo");
        Jogador jogador03 = new Jogador("Romário");
        Jogador jogador04 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador01, jogador02, jogador03, jogador04};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }


}
