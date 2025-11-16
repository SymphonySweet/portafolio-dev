package proceso;

import modelo.Cuenta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Operaciones {
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    // Registrar cuenta
    public void registrarCuenta(Cuenta c) {
        cuentas.add(c);
    }

    // Buscar cuenta por número
    public Cuenta buscarCuenta(String numero) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equals(numero)) {
                return c;
            }
        }
        return null;
    }

    // Eliminar cuenta
    public boolean eliminarCuenta(String numero) {
        Cuenta c = buscarCuenta(numero);
        if (c != null) {
            cuentas.remove(c);
            return true;
        }
        return false;
    }

    // Ordenar cuentas por saldo
    public void ordenarPorSaldo() {
        Collections.sort(cuentas, Comparator.comparingDouble(Cuenta::getSaldo));
    }

    // Listar todas las cuentas
    public ArrayList<Cuenta> listarCuentas() {
        return cuentas;
    }
}

