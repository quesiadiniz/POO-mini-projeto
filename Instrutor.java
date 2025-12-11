public class Instrutor extends Pessoa {

    private String especialidade;

    public Instrutor(String nome, char sexo, int idade, String especialidade){
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        validarDados();
    }

    @Override
    public void validarDados(){
        if (especialidade == null || especialidade.isEmpty()){
            throw new IllegalArgumentException("O instrutor precisa sinalizar uma especialidade!");
        }
    }

    @Override
    public String toString(){
        return ">>> Academia Let&Qsia <<< \n| Instrutor (a): " + getNome() + "\n| Idade: " + getIdade() + "\n| Sexo: " + getSexo() + "\n| Especialidade " + especialidade;
    }


}
