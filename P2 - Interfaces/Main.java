import classes.*;

public class Main {
    //Práticando e Estudando Interfaces
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(5, 5);
        Triangulo triangulo = new Triangulo(5, 5);

        System.out.println("Área do Círculo: "+circulo.calcularArea());
        System.out.println("Área do Quadrado: "+quadrado.calcularArea());
        System.out.println("Área do Retângulo: "+retangulo.calcularArea());
        System.out.println("Área do Triângulo: "+triangulo.calcularArea());
        System.out.println(" ");
        System.out.println("Área do Círculo + Área do Quadrado: "+MathOperations.somarAreas(circulo, quadrado));
        MathOperations.maiorArea(circulo, quadrado);
        System.out.println(" ");
        System.out.println("Área do Retângulo + Área do Triângulo: "+MathOperations.somarAreas(retangulo, triangulo));
        MathOperations.maiorArea(retangulo, triangulo);
    }
}