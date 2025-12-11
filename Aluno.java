public class Aluno extends Pessoa {
    public int matricula;
    private String objetivo; //perder peso, ganhar massa, saúde etc...
    
    public Aluno(String nome, char sexo, int idade, int matricula, String objetivo){
        super(nome, sexo, idade);
        this.matricula=matricula;
        this.objetivo=objetivo;
        validarDados();
    }

    @Override
    public void validarDados(){
        if (nome.isEmpty()){
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public int getMatricula(){
        return matricula;
    }

    public void objetivoPessoal(){
        if (objetivo.isEmpty()){
            System.out.println("não há objetivo especifico");
        }

        else {
            System.out.println("O objetivo do aluno - " + getNome() + " - é " + objetivo);
        }
    }

    @Override
    public String toString(){
        return ">>> Academia Let&Qsia <<< \n| Aluno (a): " + getNome() + "\n| Idade: " + getIdade() + "\n| Sexo: " + getSexo() + "\n| Matricula numero: " + matricula;
    }


}
