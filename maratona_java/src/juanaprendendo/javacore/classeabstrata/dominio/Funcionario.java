package juanaprendendo.javacore.classeabstrata.dominio;

public abstract class Funcionario extends Pessoa {
   protected String nome;
   protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public abstract double calcularBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
