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
        if (nome.isEmpty() || nome.isBlank()){
            throw new IllegalArgumentException("Exercício inexistente"); 
        }
        if (series<=0 || repeticoes<=0){
            throw new NullPointerException("è necessario ao menos 1 seria/repeticao!");
        }
    }



    
}
