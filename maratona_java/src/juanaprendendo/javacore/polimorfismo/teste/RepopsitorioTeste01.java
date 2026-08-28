package juanaprendendo.javacore.polimorfismo.teste;

import juanaprendendo.javacore.polimorfismo.repositorio.Repositorio;
import juanaprendendo.javacore.polimorfismo.servico.RepositorioBancodeDados;

public class RepopsitorioTeste01 {
    static void main() {
        Repositorio repositorioBancodeDados = new RepositorioBancodeDados();
        repositorioBancodeDados.salvar();
    }
}
