public class Principal {
    public static void main(String[] args) {
        DocenteTiempoParcial parcial = new DocenteTiempoParcial("Goku", "Son", "76543210", 40, 25.5);
        DocenteTiempoCompleto completo = new DocenteTiempoCompleto("Bender", "Rodriguez", "87654321", 5500, 0.10);

        System.out.println("=== DOCENTE TIEMPO PARCIAL ===");
        System.out.println(parcial.obtenerDatos());
        System.out.println("Sueldo Bruto: " + parcial.sbruto());

        System.out.println("\n=== DOCENTE TIEMPO COMPLETO ===");
        System.out.println(completo.obtenerDatos());
        System.out.println("Bonificación en soles: " + completo.boniSoles());
        System.out.println("Sueldo Bruto: " + completo.sbruto());
    }
}
