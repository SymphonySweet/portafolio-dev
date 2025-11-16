package folderr1;

import java.util.ArrayList;

public class ProgramaArrayList {

    public static void main (String [] args) {
        // Crear un ArrayList de enteros
        ArrayList<Integer> listaEnteros = new ArrayList<>();

        // Registrar valores en el ArrayList
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);
        listaEnteros.add(40);

        // Imprimir valores originales
        System.out.println("Valores originales:");
        imprimirArrayList(listaEnteros);

        // Modificar el valor en la posición 2
        if (listaEnteros.size() > 2) {
            listaEnteros.set(2, 50);
        }

        // Imprimir valores después de la modificación
        System.out.println("\nValores después de la modificación en la posición 2:");
        imprimirArrayList(listaEnteros);

        // Eliminar el valor en la posición 2
        if (listaEnteros.size() > 2) {
            listaEnteros.remove(2);
        }

        // Imprimir valores después de la eliminación
        System.out.println("\nValores después de eliminar el valor en la posición 2:");
        imprimirArrayList(listaEnteros);
    }

    // Método para imprimir los elementos de un ArrayList
    private static void imprimirArrayList(ArrayList<Integer> arrayList) {
        for (Integer valor: arrayList) {
            System.out.println(valor);
        }
    }
}
