package juanaprendendo.javacore.modificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLim = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }



    public void imorime(){
        IO.println("------------------------------");
        IO.println("Nome: " + this.nome);
        IO.println("Velocidade Maxima: " + this.velocidadeMax);
        IO.println("Velocidade Limite: " + Carro.velocidadeLim);
    }
    public static void setVelocidadeLim(double velocidadeLim){
        Carro.velocidadeLim = velocidadeLim;
    }
    public static double getVelocidadeLim(){
        return Carro.velocidadeLim;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
