package ga;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Encuesta {
    private String usuario;
    private String sexo;
    private String email;
    private String buscador;

    // Constructor
    public Encuesta(String usuario, String sexo, String email, String buscador) {
        this.usuario = usuario;
        this.sexo = sexo;
        this.email = email;
        this.buscador = buscador;
    }

    // Métodos set/get
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBuscador() { return buscador; }
    public void setBuscador(String buscador) { this.buscador = buscador; }

    // Método para almacenar los valores en un archivo plano
    public void almacenarEnArchivo(String nombreArchivo) {
        try (OutputStream output = new FileOutputStream(nombreArchivo)) {
            Properties prop = new Properties();

            prop.setProperty("Usuario", usuario);
            prop.setProperty("Sexo", sexo);
            prop.setProperty("Email", email);
            prop.setProperty("Buscador", buscador);

            prop.store(output, null);
            System.out.println("Encuesta almacenada en " + nombreArchivo);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    // Método para imprimir los valores registrados
    public void imprimirEncuesta() {
        System.out.println("Usuario: " + usuario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Buscador: " + buscador);
    }
}
