package juanaprendendo.javacore.interfaces.dominio;

public class DataBAseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        IO.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        IO.println("Removendo do BD");
    }
}
