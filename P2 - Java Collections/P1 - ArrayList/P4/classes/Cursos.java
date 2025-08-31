package classes;

public class Cursos {
    //Atributos
    private String nomeCurso;
    private Integer cargaHoraria;
    private String campoDeAtuacao;

    //Construtor
    public Cursos() {

    }

    //Métodos Específicos da Classe
    @Override
    public String toString() {
        return "• Nome do Curso: "+nomeCurso+" | Carga Horária: "+cargaHoraria+"h | Campo de Atuação: "+campoDeAtuacao;
    }

    //Getters & Setters
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCampoDeAtuacao() {
        return campoDeAtuacao;
    }
    public void setCampoDeAtuacao(String campoDeAtuacao) {
        this.campoDeAtuacao = campoDeAtuacao;
    }
}
