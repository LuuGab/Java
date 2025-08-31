package classes;

import java.util.ArrayList;

public class Biblioteca implements Pesquisavel{

    //Atributos
    private ArrayList<Livros> listaLivros;

    //Construtor
    public Biblioteca() {
        listaLivros = new ArrayList<>();
    }

    //Métodos implementados pela Interface
    @Override
    public Livros buscarPorTitulo(String tituloLivro) {
        for (Livros livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                System.out.println(livro.toString());
                return livro;
            } else {
                System.out.println("Livro não encontrado.");
            }
        }
        return null;
    }

    //Métodos Específicos da Classe
    public void adicionarLivros (Livros livro) {
        listaLivros.add(livro);
    }
    public void removerLivros (Livros livro) {
        listaLivros.remove(livro);
    }
}
