package classes;

public class Triangulo implements FormasGeometricas{
    //Atributos
    private double base;
    private double altura;

    //Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Métodos Específicos da Classe
    public double areaTriangulo() {
        return (base * altura) / 2;
    }
    @Override
    public String toString() {
        return "Triângulo";
    }

    //Métodos Implementados pela Interface
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    //Getters & Setters
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
