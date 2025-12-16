import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();

        int opcao;

        do {
            System.out.println("\n===== ACADEMIA LET&QSIA =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar instrutor");
            System.out.println("3 - Criar treino");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Listar treinos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar 

            try {
                switch (opcao) {

                    case 1:
                        System.out.print("Nome do aluno: ");
                        String nomeAluno = sc.nextLine();

                        System.out.print("Sexo (M/F): ");
                        char sexoAluno = sc.nextLine().charAt(0);

                        System.out.print("Idade: ");
                        int idadeAluno = sc.nextInt();

                        System.out.print("Matrícula: ");
                        int matricula = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Objetivo: ");
                        String objetivo = sc.nextLine();

                        Aluno aluno = new Aluno(nomeAluno, sexoAluno, idadeAluno, matricula, objetivo);
                        academia.cadastrarAluno(aluno);

                        System.out.println("Aluno cadastrado com sucesso!");
                        break;

                    case 2:
                        System.out.print("Nome do instrutor: ");
                        String nomeInstrutor = sc.nextLine();

                        System.out.print("Sexo (M/F): ");
                        char sexoInstrutor = sc.nextLine().charAt(0);

                        System.out.print("Idade: ");
                        int idadeInstrutor = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Especialidade: ");
                        String especialidade = sc.nextLine();

                        Instrutor instrutor = new Instrutor(
                                nomeInstrutor,
                                sexoInstrutor,
                                idadeInstrutor,
                                especialidade
                        );

                        System.out.println("Instrutor cadastrado com sucesso!");
                        System.out.println(instrutor);
                        break;

                    case 3:
                        System.out.print("Nome do treino: ");
                        String nomeTreino = sc.nextLine();

                        List<Exercicio> exercicios = new ArrayList<>();

                        System.out.print("Quantos exercícios deseja adicionar? ");
                        int qtd = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < qtd; i++) {
                            System.out.print("Nome do exercício: ");
                            String nomeEx = sc.nextLine();

                            Exercicio ex = new Exercicio(nomeEx);
                            exercicios.add(ex);
                        }

                        Treino treino = new Treino(nomeTreino, exercicios);
                        treino.registrar(); // uso da interface Registravel
                        academia.cadastrarTreino(treino);

                        break;

                    case 4:
                        academia.listarAlunos();
                        break;

                    case 5:
                        academia.listarTreinos();
                        break;

                    case 0:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        sc.close();
    }
}
