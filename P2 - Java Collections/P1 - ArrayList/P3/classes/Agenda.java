package classes;

import java.util.ArrayList;

public class Agenda implements Gerenciavel<Contatos, String>{
    //Atributos
    ArrayList<Contatos> listaContatos;

    //Construtor
    public Agenda() {
    listaContatos = new ArrayList<>();
    }

    //Métodos Implementados pela Interface
    @Override
    public void adicionar(Contatos contato) {
        listaContatos.add(contato);
    }
    @Override
    public void remover(String nomeContato) {
        boolean contatoRemovido =false;
            for (int i=0; i<listaContatos.size(); i++) {
                if (listaContatos.get(i).getNome().equalsIgnoreCase(nomeContato)) {
                    listaContatos.remove(i);
                    System.out.println("\n"+nomeContato+" removido(a) da agenda.");
                    contatoRemovido =true;
                }
            }
            if (contatoRemovido==false) {
                System.out.println("\nContato não encontrado.");
            }
    }
    @Override
    public void listar() {
        if (!listaContatos.isEmpty()) {
            for (Contatos i : listaContatos) {
                System.out.println(i.toString());
            }
        } else {
            System.out.println("\nNão há nenhum contato na agenda.");
        }
    }
}
