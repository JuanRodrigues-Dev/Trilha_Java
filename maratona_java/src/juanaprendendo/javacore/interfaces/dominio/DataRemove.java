package juanaprendendo.javacore.interfaces.dominio;

public interface DataRemove {
    void remove();
    default void checkPermission(){
        IO.println("Fazendo checagem de permissoes");
    }
}
