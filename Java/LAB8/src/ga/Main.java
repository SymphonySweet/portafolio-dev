package ga;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Declarar un objeto de tipo Map para almacenar productos
        Map<String, Double> productos = new HashMap<>();

        // Registrar 5 productos con sus nombres y precios
        productos.put("Producto1", 10.99);
        productos.put("Producto2", 24.50);
        productos.put("Producto3", 15.75);
        productos.put("Producto4", 30.00);
        productos.put("Producto5", 12.49);

        // Imprimir precios mediante un bucle
        System.out.println("Precios de los productos:");
        for (Double precio : productos.values()) {
            System.out.println("Precio: " + precio);
        }

        // Imprimir nombres y precios mediante un segundo bucle
        System.out.println("\nNombres y precios de los productos:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Precio: " + entry.getValue());
        }
    }
}
