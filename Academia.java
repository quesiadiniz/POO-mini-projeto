import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Aluno> alunos;
    private List<Treino> treinos;



    public Academia() {
        alunos = new ArrayList<>();
        treinos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno inválido");
        }
        alunos.add(aluno);
    }

    public void cadastrarTreino(Treino treino) {
        if (treino == null) {
            throw new IllegalArgumentException("Treino inválido");
        }
        treinos.add(treino);
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public void listarTreinos() {
        for (Treino t : treinos) {
            System.out.println(t);
        }
    }
}
