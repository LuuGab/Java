package classes;

public interface Gerenciavel<Generic, String> {
    public void adicionar(Generic g);
    public void remover(String g);
    public void listar();
}
