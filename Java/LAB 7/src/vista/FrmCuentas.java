package vista;

import modelo.Cuenta;
import proceso.Operaciones;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrmCuentas extends JFrame {

    Operaciones op = new Operaciones();

    JTextField txtNumero, txtTitular, txtSaldo;
    JTextArea txtSalida;

    public FrmCuentas() {
        setTitle("Mantenimiento de Cuentas");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Campos de entrada
        add(new JLabel("Número de cuenta:"));
        txtNumero = new JTextField(20);
        add(txtNumero);

        add(new JLabel("Titular:"));
        txtTitular = new JTextField(20);
        add(txtTitular);

        add(new JLabel("Saldo:"));
        txtSaldo = new JTextField(10);
        add(txtSaldo);

        // Botones
        JButton btnRegistrar = new JButton("Registrar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnOrdenar = new JButton("Ordenar");
        JButton btnListar = new JButton("Listar");

        add(btnRegistrar);
        add(btnBuscar);
        add(btnEliminar);
        add(btnOrdenar);
        add(btnListar);

        txtSalida = new JTextArea(10, 30);
        add(new JScrollPane(txtSalida));

        // Eventos
        btnRegistrar.addActionListener(e -> {
            String n = txtNumero.getText();
            String t = txtTitular.getText();
            double s = Double.parseDouble(txtSaldo.getText());
            op.registrarCuenta(new Cuenta(n, t, s));
            txtSalida.setText("Cuenta registrada exitosamente.");
        });

        btnBuscar.addActionListener(e -> {
            String n = txtNumero.getText();
            Cuenta c = op.buscarCuenta(n);
            if (c != null)
                txtSalida.setText("Cuenta encontrada:\n" + c);
            else
                txtSalida.setText("No se encontró la cuenta.");
        });

        btnEliminar.addActionListener(e -> {
            String n = txtNumero.getText();
            if (op.eliminarCuenta(n))
                txtSalida.setText("Cuenta eliminada correctamente.");
            else
                txtSalida.setText("No se encontró la cuenta para eliminar.");
        });

        btnOrdenar.addActionListener(e -> {
            op.ordenarPorSaldo();
            txtSalida.setText("Cuentas ordenadas por saldo.");
        });

        btnListar.addActionListener(e -> {
            StringBuilder sb = new StringBuilder();
            for (Cuenta c : op.listarCuentas()) {
                sb.append(c).append("\n");
            }
            txtSalida.setText(sb.toString());
        });
    }

    public static void main(String[] args) {
        new FrmCuentas().setVisible(true);
    }
}
