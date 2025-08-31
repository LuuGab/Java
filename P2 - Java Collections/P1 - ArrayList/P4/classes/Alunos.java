package classes;

public class Alunos {
    //Atributos
    private String nomeAluno;
    private Cursos cursoAluno;

    //Construtor
    public Alunos() {

    }

    //Métodos Específicos da Classe
    @Override
    public String toString() {
        String curso = (cursoAluno != null) ? cursoAluno.getNomeCurso() : "Sem curso";
        return "• Aluno(a): "+nomeAluno+" | Curso: "+curso;
    }

    //Getters & Setters
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Cursos getCursoAluno() {
        return cursoAluno;
    }
    public void setCursoAluno(Cursos cursoAluno) {
        this.cursoAluno = cursoAluno;
    }
}
