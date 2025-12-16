import java.util.List;

public class Treino implements Registravel{
    private String nomeTreino;
    private List<Exercicio> exercicios;

    public Treino(String nomeTreino, List<Exercicio> exercicios){
        this.nomeTreino = nomeTreino;
        if (exercicios == null) {
            throw new IllegalArgumentException("Lista de exercícios inválida!");
        }
        this.exercicios = exercicios;
    }

    public void addExercicio(Exercicio exercicio){
        if (exercicio==null){
            throw new NullPointerException("Exercicio invalido!");
        }
        exercicios.add(exercicio);
    }

    public void removerExercicio(Exercicio exercicio){
        if (exercicios.contains(exercicio)){
            exercicios.remove(exercicio);
        } else {
            throw new IllegalArgumentException("Exercicio não encontrado!");
        }
    }

    public void treinoCompleto() {
    for (Exercicio e : exercicios) {
        System.out.println(e);
        }
    }

    @Override
    public void registrar(){
        if (exercicios.isEmpty()){
            throw new IllegalStateException("o Treino deve conter ao menos 1 exercicio");
        }

        System.out.println("Treino " + nomeTreino + " registrado com sucesso!");
    }

}
