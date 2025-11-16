// Ejercicio 2:
public class Asistente {
    private int codigo;
    private String nombre;
    private int dni;
    private double sueldo;

    private static int contadorAsistentes = 0;
    private static double sumaSueldos = 0;

    public Asistente(int codigo, String nombre, int dni, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        contadorAsistentes++;
        sumaSueldos += sueldo;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    public static int getContadorAsistentes() { return contadorAsistentes; }
    public static void setContadorAsistentes(int contador) { contadorAsistentes = contador; }

    public static double getSumaSueldos() { return sumaSueldos; }
    public static void setSumaSueldos(double suma) { sumaSueldos = suma; }

    public String evaluarSueldo() {
        if (sueldo > 1500) return "mayor a 1500";
        else if (sueldo < 1500) return "menor a 1500";
        else return "igual a 1500";
    }

    public static void listado(Asistente a) {
        System.out.println("Código: " + a.getCodigo());
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("DNI: " + a.getDni());
        System.out.println("Sueldo: " + a.getSueldo());
        System.out.println("El sueldo es " + a.evaluarSueldo());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Asistente.setContadorAsistentes(0);
        Asistente.setSumaSueldos(0);

        Asistente a1 = new Asistente(201, "Bender Rodriguez", 74562318, 1550);

        listado(a1);

        System.out.println("Cantidad de asistentes: " + getContadorAsistentes());
        System.out.println("Suma total de sueldos: " + getSumaSueldos());
    }
}

