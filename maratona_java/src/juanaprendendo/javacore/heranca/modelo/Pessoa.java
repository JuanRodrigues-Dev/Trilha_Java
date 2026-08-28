package juanaprendendo.javacore.heranca.modelo;

public class Pessoa {
    private String mome;
    private String cpf;
    private Endereco endereco ;

    public Pessoa(String mome, String cpf, Endereco endereco) {
        this.mome = mome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
