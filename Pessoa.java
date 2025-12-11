abstract class Pessoa{
    String nome;
    char sexo;
    int idade;

    public Pessoa(String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        validarDados();
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public char getSexo(){
        return sexo;
    }

    public void validarDados(){
        if (idade<=0){
            throw new IllegalArgumentException("idade inválida!");
        }
        if (nome.isEmpty()){
            throw new IllegalArgumentException("nome inválido!");
        }
    }

    @Override
    public String toString(){
        return "**Cadastro Academia** \nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;
    }


}