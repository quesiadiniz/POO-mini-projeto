public class Aluno extends Pessoa implements Registravel{
    int matricula;
    private String objetivo; //perder peso, ganhar massa, saúde etc...
    
    public Aluno(String nome, char sexo, int idade, int matricula){
        super(nome, sexo, idade);
        this.matricula=matricula;
    }

    @Override
    public void registrar(){
        System.out.println("Aluno registrado:" + nome);
    }

}
