public class Profesor {
    private int codigo;
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    private static int contadorProfesores = 0;
    private static double sumaSueldos = 0;

    public Profesor(int codigo, String nombre, int horasTrabajadas, double tarifaHora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        contadorProfesores++;
        sumaSueldos += calcularSueldo();
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }

    public double getTarifaHora() { return tarifaHora; }
    public void setTarifaHora(double tarifaHora) { this.tarifaHora = tarifaHora; }

    public double calcularSueldo() {
        return horasTrabajadas * tarifaHora;
    }

    public static int getContadorProfesores() {
        return contadorProfesores;
    }

    public static double getSumaSueldos() {
        return sumaSueldos;
    }

    public static void setContadorProfesores(int contadorProfesores) {
        Profesor.contadorProfesores = contadorProfesores;
    }

    public static void setSumaSueldos(double sumaSueldos) {
        Profesor.sumaSueldos = sumaSueldos;
    }

    public static void listado(Profesor p) {
        System.out.println("Código: " + p.getCodigo());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Horas trabajadas: " + p.getHorasTrabajadas());
        System.out.println("Tarifa por hora: " + p.getTarifaHora());
        System.out.println("Sueldo: " + p.calcularSueldo());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Profesor p1 = new Profesor(101, "Jhordan Mayhua", 40, 25);
        Profesor p2 = new Profesor(102, "Bender Rodriguez", 35, 28);
        Profesor p3 = new Profesor(103, "Son Goku", 30, 30);

        listado(p1);
        listado(p2);
        listado(p3);

        System.out.println("Cantidad de profesores: " + getContadorProfesores());
        System.out.println("Suma total de sueldos: " + getSumaSueldos());
    }
}

