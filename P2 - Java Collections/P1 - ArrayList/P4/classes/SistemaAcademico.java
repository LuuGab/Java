package classes;

import java.util.ArrayList;

public class SistemaAcademico {
    //Atributos
    private ArrayList<Alunos> listaAlunos;
    private ArrayList<Cursos> listaCursos;

    //Construtor
    public SistemaAcademico() {
        listaAlunos = new ArrayList<Alunos>();
        listaCursos = new ArrayList<Cursos>();
    }

    //Métodos Específicos da Classe
    public void adicionarAluno(Alunos aluno) {
        listaAlunos.add(aluno);
    }

    public void removerAluno(String nomeAluno) {
        boolean alunoRemovido =false;
        for (int i=0; i<listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getNomeAluno().equalsIgnoreCase(nomeAluno)) {
                listaAlunos.remove(i);
                System.out.println("\n"+nomeAluno+" removido da lista de cursos.");
                alunoRemovido =true;
            }
        }
        if (alunoRemovido==false) {
            System.out.println("\nAluno(a) não encontrado.");
        }
    }

    public void listarAlunos() {
        if (!listaAlunos.isEmpty()) {
            for (int i=0; i<listaAlunos.size(); i++) {
                System.out.println(listaAlunos.get(i).toString());
            }
        } else {
            System.out.println("\nNão há nenhum aluno cadastrado.");
        }
    }

    public void atualizarCursoAluno(String nomeAluno, String novoCurso) {
        boolean alunoEncontrado =false;
        boolean cursoAtualizado =false;
        for (int i=0; i<listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getNomeAluno().equalsIgnoreCase(nomeAluno)) {
                alunoEncontrado =true;
                for (int j=0; j<listaCursos.size(); j++) {
                    if (listaCursos.get(j).getNomeCurso().equalsIgnoreCase(novoCurso)) {
                        listaAlunos.get(i).setCursoAluno(listaCursos.get(j));
                        System.out.println("\nCurso atualizado com sucesso para o aluno "+nomeAluno);
                        cursoAtualizado=true;
                    }
                }
            }
        }
        if(alunoEncontrado==false) {
            System.out.println("\nAluno(a) não encontrado.");
        } else if (cursoAtualizado==false) {
            System.out.println("\nCurso informado não encontrado no sistema.");
        }
    }

    public void adicionarCurso(Cursos curso) {
        listaCursos.add(curso);
    }

    public void removerCurso(String nomeCurso) {
        boolean cursoRemovido =false;
        for (int i=0; i<listaCursos.size(); i++) {
            if (listaCursos.get(i).getNomeCurso().equalsIgnoreCase(nomeCurso)) {
                listaCursos.remove(i);
                System.out.println("\n"+nomeCurso+" removido da lista de cursos.");
                cursoRemovido =true;
            }
        }
        if (cursoRemovido==false) {
            System.out.println("\nCurso não encontrado.");
        }
    }

    public void listarCursos () {
        if (!listaCursos.isEmpty()) {
            for (int i=0; i<listaCursos.size(); i++) {
                System.out.println(listaCursos.get(i).toString());
            }
        } else {
            System.out.println("\nNão há nenhum curso cadastrado.");
        }
    }

    public Cursos buscarCursoPorNome(String nomeCurso) {
        boolean cursoEncontrado =false;
        for(int i=0; i<listaCursos.size(); i++) {
            if (listaCursos.get(i).getNomeCurso().equalsIgnoreCase(nomeCurso)) {
                cursoEncontrado =true;
                return listaCursos.get(i);
            }
        }
        if (cursoEncontrado==false) {
            System.out.println("Curso não encontrado ou existente.");
        }
        return null;
    }
}
