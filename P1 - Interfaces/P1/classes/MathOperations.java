package classes;

public class MathOperations {

    //Operações Matemáticas entre Formas Geométricas
    public static double somarAreas(FormasGeometricas formaA, FormasGeometricas formaB) {
        return formaA.calcularArea() + formaB.calcularArea();
    }
    public static double subtrairAreas(FormasGeometricas formaA, FormasGeometricas formaB) {
        return formaA.calcularArea() - formaB.calcularArea();
    }
    public static void maiorArea (FormasGeometricas formaA, FormasGeometricas formaB) {
        if (formaA.calcularArea() > formaB.calcularArea()) {
            System.out.println(String.valueOf(formaA)+" possui a maior área.");
        } else if (formaA.calcularArea() == formaB.calcularArea()) {
            System.out.println("As formas tem áreas iguais.");
        } else {
            System.out.println(String.valueOf(formaB)+" possui a maior área.");
        }
    }

}
