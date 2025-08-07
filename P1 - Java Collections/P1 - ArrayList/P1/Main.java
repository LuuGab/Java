import java.util.ArrayList;

public class Main {
    //Estudando Java Collections - ArrayList
    public static void main(String[] args) {
        //Estrutura base do ArrayList
        ArrayList<String> stringArrayList = new ArrayList<>();

        //Adicionar Elementos — add(elemento);
        stringArrayList.add("A");

        //Remover Elementos — remove(elemento);
        stringArrayList.remove("B");

        //Substituir Elementos — set(int index, elemento)
        stringArrayList.set(1, "C");

        //Conferir qnt. de Elementos — size();
        stringArrayList.size();
    }
}