import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Práticando e Estudando ArrayList
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
        String option;

        do {
            System.out.println("---------------------------------");
            System.out.println("Praticando com a Classe ArrayList");
            System.out.println("---------------------------------");
            System.out.println("A) Conferir elementos da lista");
            System.out.println("B) Conferir a qnt. de elementos");
            System.out.println("C) Adicionar elementos");
            System.out.println("D) Remover elementos");
            System.out.println("E) Substituir elementos");
            System.out.println("Q) Sair.");
            System.out.println("---------------------------------");
            System.out.print("Digite a opção desejada:");
            option = scanner.nextLine().trim();

            switch (option) {
                case "A":
                case "a":
                    if (nomes.isEmpty()) {
                        System.out.println("Não há elementos na lista.");
                    } else {
                        for (String listaDosElementos : nomes) {
                            System.out.println(listaDosElementos);
                        }
                    }
                    break;

                case "B":
                case "b":
                    System.out.println("Quantidade de Elementos da Lista: "+nomes.size());
                    break;

                case "C":
                case "c":
                    System.out.print("Digite o nome do elemento a ser adicionado(a): ");
                    String novoElemento = scanner.nextLine();
                    nomes.add(novoElemento);
                    break;

                case "D":
                case "d":
                    System.out.print("Escreva o elemento a ser removido(a): ");
                    String elementoRemovido = scanner.nextLine();

                    nomes.remove(elementoRemovido);

                    if(nomes.remove(elementoRemovido)) {
                        System.out.println("Elemento removido com sucesso.");
                    } else {
                        System.out.println("Elemento não encontrado(a).");
                    }
                    break;

                case "E":
                case "e":
                    System.out.println("--------------------------------------");
                    for (int i=0; i<nomes.size(); i++) {
                        System.out.println(i+") "+ nomes.get(i));
                    }

                    System.out.print("Escolha o elemento a ser substituido(a):");
                    int indexEscolhido = scanner.nextInt();
                    scanner.nextLine();

                    if (indexEscolhido>nomes.size() || indexEscolhido<0) {
                        System.out.println("Valor incompatível ou incorreto.");
                    } else {
                        System.out.print("Digite o nome do novo elemento: ");
                        String elementoSubstituido = scanner.nextLine();
                        nomes.set(indexEscolhido, elementoSubstituido);
                    }
                    break;

                case "Q":
                case "q":
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção incompatível ou incorreta.");
                    break;
            }
        } while (!option.equalsIgnoreCase("q"));
        scanner.close();
    }
}