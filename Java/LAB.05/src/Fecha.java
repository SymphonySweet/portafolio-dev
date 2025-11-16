import java.time.LocalDate;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor sin parámetros
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2025;
    }

    // Constructor con parámetros y validación
    public Fecha(int dia, int mes, int anio) {
        if (esFechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = anio;
        }
    }

    // Métodos get/set
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }

    // Validación de fecha
    private boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12 || dia < 1) return false;
        int diasMes = getNumeroDiasMes(mes, anio);
        return dia <= diasMes;
    }

    // Año bisiesto
    public boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Número de días del mes (decisión múltiple)
    public int getNumeroDiasMes(int mes, int anio) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return esBisiesto() ? 29 : 28;
            default:
                return 0;
        }
    }

    // Nombre del mes
    public String getNombreMes() {
        switch (mes) {
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Mes inválido";
        }
    }

    // Comparaciones
    public boolean esMayor(int dia2, int mes2, int anio2) {
        if (anio2 > anio) return true;
        if (anio2 == anio && mes2 > mes) return true;
        if (anio2 == anio && mes2 == mes && dia2 > dia) return true;
        return false;
    }

    public boolean esMayor(Fecha objFecha2) {
        return esMayor(objFecha2.dia, objFecha2.mes, objFecha2.anio);
    }

    // toString
    public String toString() {
        return anio + "-" + mes + "-" + dia;
    }

    // 🔹 Método RETO: mostrar el calendario del mes actual
    public void mostrarMes() {
        System.out.println("\n     " + getNombreMes().toUpperCase());
        System.out.println(" L  M  M  J  V  S  D");

        // Día de la semana del primer día del mes
        LocalDate fechaInicio = LocalDate.of(anio, mes, 1);
        int diaSemanaInicio = fechaInicio.getDayOfWeek().getValue(); // Lunes=1 ... Domingo=7
        int diasMes = getNumeroDiasMes(mes, anio);

        // Espacios antes del primer día
        for (int i = 1; i < diaSemanaInicio; i++) {
            System.out.print("   ");
        }

        // Días del mes
        for (int diaActual = 1; diaActual <= diasMes; diaActual++) {
            System.out.printf("%2d ", diaActual);

            // Salto de línea cada domingo
            if ((diaSemanaInicio + diaActual - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }
}


