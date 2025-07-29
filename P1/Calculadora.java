import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraMetodos calc = new CalculadoraMetodos();

        String opcao;
        do {
            calc.interf();
            opcao = scanner.next();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o primeiro número: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b1 = scanner.nextDouble();
                    calc.somar(a1, b1);
                    break;
                case "2":
                    System.out.print("Digite o primeiro número: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b2 = scanner.nextDouble();
                    calc.subtracao(a2, b2);
                    break;
                case "3":
                    System.out.print("Digite o primeiro número: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b3 = scanner.nextDouble();
                    calc.multiplicacao(a3, b3);
                    break;
                case "4":
                    System.out.print("Digite o primeiro número: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b4 = scanner.nextDouble();
                    calc.divisao(a4, b4);
                    break;
                case "5":
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double expoente = scanner.nextDouble();
                    calc.potencializacao(base, expoente);
                    break;
                case "6":
                    System.out.print("Digite o número: ");
                    double num = scanner.nextDouble();
                    calc.raizquadrada(num);
                    break;
                case "7":
                case "q":
                case "Q":
                    System.out.println("Programa Encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();

        } while (!opcao.equals("7") && !opcao.equalsIgnoreCase("q"));

        scanner.close();
    }
}
