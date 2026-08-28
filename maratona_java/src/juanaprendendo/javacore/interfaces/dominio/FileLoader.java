package juanaprendendo.javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        IO.println("Carregando os dados de arquivos");
    }

    @Override
    public void remove() {
        IO.println("Removendo arquivos");
    }
}
