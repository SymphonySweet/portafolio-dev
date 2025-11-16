public class DocenteTiempoParcial extends Docente {
    private int horas;
    private double tarifa;

    public DocenteTiempoParcial(String nombre, String apellido, String dni, int horas, double tarifa) {
        super(nombre, apellido, dni);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    public double getTarifa() { return tarifa; }
    public void setTarifa(double tarifa) { this.tarifa = tarifa; }

    public String obtenerDatos() {
        return "Nombre: " + getNombre() + " " + getApellido() +
                "\nDNI: " + getDni() +
                "\nHoras: " + horas +
                "\nTarifa: " + tarifa;
    }

    public double sbruto() {
        return horas * tarifa;
    }
}
