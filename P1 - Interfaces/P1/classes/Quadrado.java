package classes;

public class Quadrado implements FormasGeometricas{
    //Atributos
    private double lado;

    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //Métodos Específicos da Classe
    public double areaQuadrado() {
        return Math.pow(lado, 2);
    }
    @Override
    public String toString() {
        return "Quadrado";
    }

    //Métodos Implementados pela Interface
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    //Getters & Setters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}
