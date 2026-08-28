package juanaprendendo.javacore.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        IO.println(this.nome);
        if (time != null){
            IO.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
