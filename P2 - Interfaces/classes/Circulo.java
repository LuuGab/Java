package classes;

public class Circulo implements FormasGeometricas{
    //Atributos
    private double raio;

    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Métodos Específicos da Classe
    public double areaCirculo() {
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public String toString() {
        return "Círculo";
    }

    //Métodos Implementados pela Interface
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    //Getters & Setters
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

}
