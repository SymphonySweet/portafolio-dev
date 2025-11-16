public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(9, 11, 2025);

        System.out.println("Fecha 1: " + f1);
        System.out.println("Fecha 2: " + f2);

        System.out.println("Mes de f1: " + f1.getNombreMes() + " con " + f1.getNumeroDiasMes(f1.getMes(), f1.getAnio()) + " días");
        System.out.println("Mes de f2: " + f2.getNombreMes() + " con " + f2.getNumeroDiasMes(f2.getMes(), f2.getAnio()) + " días");

        System.out.println("¿f2 es mayor que f1?: " + f2.esMayor(f1));
        System.out.println("¿f2 es mayor que 31/3/2023?: " + f2.esMayor(31, 3, 2023));

        // 🔹 Mostrar el calendario mensual (RETO)
        f2.mostrarMes();
    }
}


