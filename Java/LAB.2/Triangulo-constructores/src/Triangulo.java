// Ejercicio 1-LAB 2. hipotenusa. Emplee constructores
public class Triangulo {
    double cateto1, cateto2;

    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3, 4);
        System.out.println("La hipotenusa es: " + t1.calcularHipotenusa());
    }
}

