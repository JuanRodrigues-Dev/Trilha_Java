package juanaprendendo.javacore.heranca.modelo;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String mome, String cpf, Endereco endereco, double salario) {
        super(mome, cpf, endereco);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
