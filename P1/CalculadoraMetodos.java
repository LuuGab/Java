public class CalculadoraMetodos {

    public void interf() {
        System.out.println("=========================");
        System.out.println("=======CALCULADORA=======");
        System.out.println("1) SOMA");
        System.out.println("2) SUBTRAÇÃO");
        System.out.println("3) MULTIPLICAÇÃO");
        System.out.println("4) DIVISÃO");
        System.out.println("5) POTENCIALIZAÇÃO");
        System.out.println("6) RAIZ QUADRADA.");
        System.out.println("7) SAIR (q)");
        System.out.print("\nDigite a operação a ser realizada: ");
    }

    public void somar(double a, double b) {
        double result = a + b;
        System.out.println("RESULTADO: " + result);
    }

    public void subtracao(double a, double b) {
        double result = a - b;
        System.out.println("RESULTADO: " + result);
    }

    public void multiplicacao(double a, double b) {
        double result = a * b;
        System.out.println("RESULTADO: " + result);
    }

    public void divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Impossível realizar divisão por zero.");
        } else {
            double result = a / b;
            System.out.println("RESULTADO: " + result);
        }
    }

    public void potencializacao(double a, double b) {
        double result = Math.pow(a, b);
        System.out.println("RESULTADO: " + result);
    }

    public void raizquadrada(double a) {
        if (a < 0) {
            System.out.println("Não existe raiz de número negativo.");
        } else {
            double result = Math.sqrt(a);
            System.out.println("RESULTADO: " + result);
        }
    }
}
