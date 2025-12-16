public class Exercicio {
    private String nome;
    private int repeticoes;
    private int series;

    public Exercicio (String nome, int repeticoes, int series){
        this.nome = nome;
        this.repeticoes = repeticoes;
        this.series = series;
        validarExercicio();
    }

    private void validarExercicio(){
        if (nome == null|| nome.isBlank()){
            throw new IllegalArgumentException("Exercício inexistente"); 
        }
        if (series<=0 || repeticoes<=0){
            throw new IllegalArgumentException("É necessário ao menos 1 série e 1 repetição!");
        }
    }

    @Override
    public String toString() {
        return nome + " - " + series + "de " + repeticoes;
    }
    
}
