import classes.Agenda;
import classes.Contatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int resp =0;

        while (resp!=4) {
            System.out.println("\nAgenda de Contatos.");
            System.out.println("1) Adicionar novo contato");
            System.out.println("2) Remover contato");
            System.out.println("3) Listar contatos");
            System.out.println("4) Sair");
            System.out.print("Digite sua opção: ");
            resp = sc.nextInt();
            sc.nextLine();

            switch(resp) {
                case 1:
                    Contatos novoContato = new Contatos();
                    System.out.print("\n• Nome do Contato: ");
                    String nomeContato = sc.nextLine();
                    novoContato.setNome(nomeContato);

                    System.out.print("• Email: ");
                    String emailContato = sc.nextLine();
                    novoContato.setEmail(emailContato);

                    System.out.print("• Telefone (DDD e N°): ");
                    String telefoneContato = sc.nextLine();
                    novoContato.setTelefone(telefoneContato);

                    if (novoContato.getTelefone()==null) {
                        break;
                    }

                    agenda.adicionar(novoContato);
                    break;
                case 2:
                    System.out.print("\nDigite o nome do contato a ser removido: ");
                    String nomeDoContato = sc.nextLine();
                    agenda.remover(nomeDoContato);
                    break;

                case 3:
                    System.out.println(" ");
                    agenda.listar();
                    break;

                case 4:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
       }
    }
}