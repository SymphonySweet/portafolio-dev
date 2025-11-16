package folderr1;

import java.util.List;

public class UtilImpresion {

    public static void imprimirConFor(List<? extends Imprimible> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Índice " + i + " -> " + lista.get(i).obtenerTexto());
        }
    }

    public static void imprimirConForEach(List<? extends Imprimible> lista) {
        for (Imprimible elem : lista) {
            System.out.println(elem.obtenerTexto());
        }
    }
}
