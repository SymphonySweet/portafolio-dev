public class DocenteTiempoCompleto extends Docente {
    private double sueldoBasico;
    private double porcentajeBonificacion;

    public DocenteTiempoCompleto(String nombre, String apellido, String dni, double sueldoBasico, double porcentajeBonificacion) {
        super(nombre, apellido, dni);
        this.sueldoBasico = sueldoBasico;
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    public double getSueldoBasico() { return sueldoBasico; }
    public void setSueldoBasico(double sueldoBasico) { this.sueldoBasico = sueldoBasico; }

    public double getPorcentajeBonificacion() { return porcentajeBonificacion; }
    public void setPorcentajeBonificacion(double porcentajeBonificacion) { this.porcentajeBonificacion = porcentajeBonificacion; }

    public String obtenerDatos() {
        return "Nombre: " + getNombre() + " " + getApellido() +
                "\nDNI: " + getDni() +
                "\nSueldo Básico: " + sueldoBasico +
                "\nPorcentaje de Bonificación: " + porcentajeBonificacion;
    }

    public double boniSoles() {
        return sueldoBasico * porcentajeBonificacion;
    }

    public double sbruto() {
        return sueldoBasico + boniSoles();
    }
}
