import classes.Biblioteca;
import classes.Livros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String resp ="";

        do {
            System.out.print("Adicionar Livro? (S/N): ");
            resp = sc.nextLine();

            if (resp.equalsIgnoreCase("n")) {
                continue;
            }

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Gênero: ");
            String genero = sc.nextLine();

            System.out.print("Ano Publicação: ");
            int ano = sc.nextInt();
            sc.nextLine();

            biblioteca.adicionarLivros(new Livros(autor, titulo, genero, ano));

            System.out.println("");
            System.out.println("Buscando Livro por Título...");
            System.out.print("Título: ");
            String tituloLivro = sc.nextLine();

            biblioteca.buscarPorTitulo(tituloLivro);
        } while (!resp.equalsIgnoreCase("n"));
        System.out.print("\nPrograma encerrando...");
    }
}