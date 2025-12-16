public class AvaliacaoFisica implements Registravel {
    private double peso;
    private double altura;
    

    public AvaliacaoFisica(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        validarDados();
    }
 
    
    private void validarDados() {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    @Override
    public void registrar() {
        System.out.println("Avaliação física registrada com sucesso!");
    }

    @Override
    public String toString() {
        return "Peso: " + peso +
               " kg | Altura: " + altura +
               " m | IMC: " + String.format("%.2f", calcularIMC());
    }
}
