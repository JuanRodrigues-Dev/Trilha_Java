package juanaprendendo.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        IO.println("Dentro do bloco de inicialização");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
