package juanaprendendo.javacore.polimorfismo.servico;

import juanaprendendo.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancodeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
