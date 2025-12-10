abstract class Pessoa{
    String nome;
    char sexo;
    int idade;

    public Pessoa(String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }


}