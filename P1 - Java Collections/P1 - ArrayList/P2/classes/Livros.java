package classes;

public class Livros {
    //Atributos
    private String autor;
    private String titulo;
    private String genero;
    private int anoPublicacao;

    //Construtor
    public Livros(String autor, String titulo, String genero, int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
    }

    //Métodos Específicos da Classe
    @Override
    public String toString() {
        return "• Autor: "+autor+" | Título: "+titulo+" | Ano de Publicação: "+anoPublicacao;
    }

    //Getters & Setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
