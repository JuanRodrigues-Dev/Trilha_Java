package juanaprendendo.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        IO.println(this.nome);
        if (professores == null){
            return;
        }
        for (Professor professor : professores){
            IO.println(professor.getNome());
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Escola(String nome) {
        this.nome = nome;
    }
}
