import classes.Alunos;
import classes.Cursos;
import classes.SistemaAcademico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaAcademico sistemaAcademico = new SistemaAcademico();
        int resp =0;

        while (resp!=8) {
            System.out.println("\nSistema Acadêmico");
            System.out.println("1) Cadastrar novos alunos");
            System.out.println("2) Remover alunos do sistema");
            System.out.println("3) Listar alunos cadastrados");
            System.out.println("4) Atualizar status dos alunos");
            System.out.println(" ");
            System.out.println("5) Cadastrar novos cursos");
            System.out.println("6) Remover cursos do sistema");
            System.out.println("7) Listar cursos cadastrados");
            System.out.println("8) Sair");
            System.out.print("Digite sua opção: ");
            resp = sc.nextInt();
            sc.nextLine();

            switch(resp) {
                case 1:
                    Alunos novoAluno = new Alunos();
                    System.out.print("\n• Nome do Aluno: ");
                    String nomeAluno = sc.nextLine();
                    novoAluno.setNomeAluno(nomeAluno);

                    System.out.print("• "+nomeAluno+" possui algum curso? (Y/N): ");
                    String respCurso = sc.nextLine();

                    if (respCurso.equalsIgnoreCase("Y")) {
                        System.out.print("• Nome do Curso: ");
                        String nomeCurso = sc.nextLine();
                        novoAluno.setCursoAluno(sistemaAcademico.buscarCursoPorNome(nomeCurso));
                    } else if ((respCurso.equalsIgnoreCase("N"))) {
                        novoAluno.setCursoAluno(null);
                } else {
                        System.out.println("\nOpção inválida.");
                        break;
                    }

                    sistemaAcademico.adicionarAluno(novoAluno);
                    break;
                case 2:
                    System.out.print("\n• Digite o nome do aluno a ser removido: ");
                    String nomeDoAluno = sc.nextLine();
                    sistemaAcademico.removerAluno(nomeDoAluno);
                    break;

                case 3:
                    System.out.println(" ");
                    sistemaAcademico.listarAlunos();
                    break;

                case 4:
                    System.out.print("\n• Digite o nome do aluno: ");
                    String updAluno = sc.nextLine();

                    System.out.print("• Digite o nome do novo curso do aluno: ");
                    String updCursoAluno = sc.nextLine();

                    sistemaAcademico.atualizarCursoAluno(updAluno, updCursoAluno);
                    break;

                case 5:
                    Cursos novoCurso = new Cursos();
                    System.out.print("\n• Digite o nome do curso: ");
                    String nomeCurso = sc.nextLine();
                    novoCurso.setNomeCurso(nomeCurso);

                    System.out.print("• Digite a carga horária do curso (h): ");
                    int cargaHCurso = sc.nextInt();
                    novoCurso.setCargaHoraria(cargaHCurso);

                    sc.nextLine();

                    System.out.print("• Digite o campo de atuação do curso: ");
                    String campoCurso = sc.nextLine();
                    novoCurso.setCampoDeAtuacao(campoCurso);

                    sistemaAcademico.adicionarCurso(novoCurso);
                    break;
                case 6:
                    System.out.print("\n• Digite o nome do curso a ser removido: ");
                    String nomeDoCurso = sc.nextLine();
                    sistemaAcademico.removerCurso(nomeDoCurso);
                    break;

                case 7:
                    System.out.println(" ");
                    sistemaAcademico.listarCursos();
                    break;

                case 8:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        }
    }
}