package exercicios.associacao.teste;

import exercicios.associacao.modelo.Aluno;
import exercicios.associacao.modelo.Local;
import exercicios.associacao.modelo.Professor;
import exercicios.associacao.modelo.Seminario;

public class Teste01 {
    static void main() {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Juan", 20);
        Professor professor = new Professor("Jiraya", "Matematica");
        Aluno [] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Achar One Piece" , alunosParaSeminario, local);
        Seminario [] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
