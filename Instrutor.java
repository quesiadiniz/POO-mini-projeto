public class Instrutor extends Pessoa implements Registravel{

    public Instrutor(String nome, char sexo, int idade){
        super(nome, sexo, idade);
    }

    @Override
    public void registrar(){
        System.out.println("Instrutor registrado:" + nome);
    }
    
}
