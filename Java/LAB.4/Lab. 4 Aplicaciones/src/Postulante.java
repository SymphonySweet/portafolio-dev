public class Postulante extends Persona {
    private double nota1;
    private double nota2;

    public Postulante(String nombre, String dni, String direccion, double nota1, double nota2) {
        super(nombre, dni, direccion);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = nota1; }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = nota2; }

    public String generarCodigo() {
        return getNombre().substring(0, 1).toUpperCase() + getDni();
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public String resultado() {
        if (calcularPromedio() >= 14)
            return "ACEPTADO";
        else
            return "RECHAZADO";
    }

    public void mostrarDatos() {
        System.out.println("Código: " + generarCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Resultado: " + resultado());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Postulante p1 = new Postulante("Jordan", "76543210", "Surco", 15, 18);
        Postulante p2 = new Postulante("Bender", "87654321", "Lima", 13, 14);

        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}

