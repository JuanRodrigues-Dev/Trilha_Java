package juanaprendendo.javacore.classeabstrata.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario = this.salario - this.salario*0.2;
    }

    @Override
    public void imprimme() {
        IO.println(this.nome);
        IO.println(this.salario);
    }
}
