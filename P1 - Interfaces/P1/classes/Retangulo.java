package classes;

public class Retangulo implements FormasGeometricas{
    //Atributos
    private double base;
    private double altura;

    //Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Métodos Específicos da Classe
    public double areaRetangulo() {
        return base * altura;
    }
    @Override
    public String toString() {
        return "Retângulo";
    }

    //Métodos Implementados pela Interface
    @Override
    public double calcularArea() {
        return base * altura;
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
