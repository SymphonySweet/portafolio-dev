package ga;
import java.util.Scanner;

public class MainEncuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de Encuesta ===");
        System.out.print("Ingrese usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Ingrese email: ");
        String email = sc.nextLine();

        System.out.print("Ingrese buscador preferido (Google, Bing, etc.): ");
        String buscador = sc.nextLine();

        // Crear objeto y ejecutar métodos
        Encuesta e = new Encuesta(usuario, sexo, email, buscador);
        e.almacenarEnArchivo("encuesta.properties");
        System.out.println("\nDatos registrados:");
        e.imprimirEncuesta();
    }
}
