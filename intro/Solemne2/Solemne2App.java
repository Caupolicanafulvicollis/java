package Solemne2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solemne2App {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame mainFrame = new JFrame("Solemne 2");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new BorderLayout());

        // Crear el menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem loteriaItem = new JMenuItem("Lotería");
        JMenuItem energiaItem = new JMenuItem("Energía");
        JMenuItem salirItem = new JMenuItem("Salir");

        // Agregar elementos al menú
        menu.add(loteriaItem);
        menu.add(energiaItem);
        menu.addSeparator();
        menu.add(salirItem);
        menuBar.add(menu);

        // Establecer el menú en la ventana principal
        mainFrame.setJMenuBar(menuBar);

        // Acción para "Lotería"
        loteriaItem.addActionListener(e -> mostrarVentanaLoteria());

        // Acción para "Energía"
        energiaItem.addActionListener(e -> mostrarVentanaEnergia());

        // Acción para "Salir"
        salirItem.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(mainFrame,
                    "¿Está seguro de que desea salir?", "Salir",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // Mostrar la ventana principal
        mainFrame.setVisible(true);
    }

    // Ventana para la opción "Lotería"
    private static void mostrarVentanaLoteria() {
        JFrame loteriaFrame = new JFrame("Lotería");
        loteriaFrame.setSize(400, 300);
        loteriaFrame.setLocationRelativeTo(null);
        loteriaFrame.setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes de entrada y salida
        JLabel desdeLabel = new JLabel("Monto del premio a optar desde:");
        JTextField desdeField = new JTextField();
        JLabel hastaLabel = new JLabel("Monto del premio a optar hasta:");
        JTextField hastaField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        JLabel resultadoLabel = new JLabel("Monto a pagar por el ticket:");
        JLabel resultadoMonto = new JLabel("-");

        // Botón para calcular el monto del ticket
        calcularButton.addActionListener(e -> {
            try {
                int desde = Integer.parseInt(desdeField.getText());
                int hasta = Integer.parseInt(hastaField.getText());
                int montoPagar;

                if (hasta <= 1000000) {
                    montoPagar = 1000;
                } else if (hasta > 1000000 && hasta <= 5000000) {
                    montoPagar = 2000;
                } else if (hasta > 5000000 && hasta <= 10000000) {
                    montoPagar = 3000;
                } else {
                    throw new IllegalArgumentException("El monto del premio no es válido.");
                }

                resultadoMonto.setText("$" + montoPagar);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(loteriaFrame,
                        "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(loteriaFrame,
                        ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar los componentes a la ventana
        loteriaFrame.add(desdeLabel);
        loteriaFrame.add(desdeField);
        loteriaFrame.add(hastaLabel);
        loteriaFrame.add(hastaField);
        loteriaFrame.add(new JLabel()); // Espacio vacío
        loteriaFrame.add(calcularButton);
        loteriaFrame.add(resultadoLabel);
        loteriaFrame.add(resultadoMonto);

        loteriaFrame.setVisible(true);
    }

    // Ventana para la opción "Energía"
    private static void mostrarVentanaEnergia() {
        JFrame energiaFrame = new JFrame("Energía");
        energiaFrame.setSize(400, 300);
        energiaFrame.setLocationRelativeTo(null);
        energiaFrame.setLayout(new GridLayout(5, 2, 10, 10));

        // Componentes de entrada y salida
        JLabel masaLabel = new JLabel("Masa (kg):");
        JTextField masaField = new JTextField();
        JLabel velocidadLabel = new JLabel("Velocidad (m/s):");
        JTextField velocidadField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        JLabel resultadoLabel = new JLabel("Energía cinética (J):");
        JLabel resultadoEnergia = new JLabel("-");

        // Botón para calcular la energía cinética
        calcularButton.addActionListener(e -> {
            try {
                double masa = Double.parseDouble(masaField.getText());
                double velocidad = Double.parseDouble(velocidadField.getText());
                double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

                resultadoEnergia.setText(String.format("%.2f", energiaCinetica) + " J");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(energiaFrame,
                        "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar los componentes a la ventana
        energiaFrame.add(masaLabel);
        energiaFrame.add(masaField);
        energiaFrame.add(velocidadLabel);
        energiaFrame.add(velocidadField);
        energiaFrame.add(new JLabel()); // Espacio vacío
        energiaFrame.add(calcularButton);
        energiaFrame.add(resultadoLabel);
        energiaFrame.add(resultadoEnergia);

        energiaFrame.setVisible(true);
    }
}
