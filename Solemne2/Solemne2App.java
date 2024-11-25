package Solemne2; //dentro de esta carpeta lo tengo profesor
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Solemne2App {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame mainFrame = new JFrame("Solemne 2");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLocationRelativeTo(null);

        // Crear un panel para botones con márgenes
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Márgenes
        menuPanel.setBackground(Color.LIGHT_GRAY);

        // Crear botones del menú
        JButton loteriaButton = new JButton("Lotería");
        JButton energiaButton = new JButton("Energía");
        JButton salirButton = new JButton("Salir");

        // Configuración de los botones
        configurarBoton(loteriaButton);
        configurarBoton(energiaButton);
        configurarBoton(salirButton);

        // Agregar botones al panel
        menuPanel.add(loteriaButton);
        menuPanel.add(Box.createVerticalStrut(10)); // Espaciado entre botones
        menuPanel.add(energiaButton);
        menuPanel.add(Box.createVerticalStrut(10)); // Espaciado entre botones
        menuPanel.add(salirButton);

        // Acciones de los botones
        loteriaButton.addActionListener(e -> mostrarVentanaLoteria());
        energiaButton.addActionListener(e -> mostrarVentanaEnergia());
        salirButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(mainFrame,
                    "¿Está seguro de que desea salir?", "Salir",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // Agregar panel al marco principal
        mainFrame.add(menuPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }

    // Configurar propiedades de los botones
    private static void configurarBoton(JButton boton) {
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        boton.setPreferredSize(new Dimension(200, 40)); // Tamaño preferido
    }

    // Ventana de Lotería
    private static void mostrarVentanaLoteria() {
        JFrame loteriaFrame = new JFrame("Lotería");
        loteriaFrame.setSize(400, 300);
        loteriaFrame.setLocationRelativeTo(null);
        loteriaFrame.setLayout(new GridLayout(5, 1, 10, 10)); // Espaciado

        // Componentes
        JLabel desdeLabel = new JLabel("Monto del premio a optar desde:");
        JTextField desdeField = new JTextField();
        JPanel desdePanel = crearPanelConMargen(desdeLabel, desdeField);

        JLabel hastaLabel = new JLabel("Monto del premio a optar hasta:");
        JTextField hastaField = new JTextField();
        JPanel hastaPanel = crearPanelConMargen(hastaLabel, hastaField);

        JButton calcularButton = new JButton("Calcular");
        JPanel calcularPanel = crearPanelConMargen(calcularButton);

        JLabel resultadoLabel = new JLabel("Monto a pagar por el ticket:");
        JLabel resultadoMonto = new JLabel("-");
        JPanel resultadoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        resultadoPanel.add(resultadoLabel);
        resultadoPanel.add(resultadoMonto);

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

        // Agregar componentes
        loteriaFrame.add(desdePanel);
        loteriaFrame.add(hastaPanel);
        loteriaFrame.add(calcularPanel);
        loteriaFrame.add(resultadoPanel);

        loteriaFrame.setVisible(true);
    }

    // Ventana de Energía
    private static void mostrarVentanaEnergia() {
        JFrame energiaFrame = new JFrame("Energía");
        energiaFrame.setSize(400, 300);
        energiaFrame.setLocationRelativeTo(null);
        energiaFrame.setLayout(new GridLayout(5, 1, 10, 10)); // Espaciado

        // Componentes
        JLabel masaLabel = new JLabel("Masa (kg):");
        JTextField masaField = new JTextField();
        JPanel masaPanel = crearPanelConMargen(masaLabel, masaField);

        JLabel velocidadLabel = new JLabel("Velocidad (m/s):");
        JTextField velocidadField = new JTextField();
        JPanel velocidadPanel = crearPanelConMargen(velocidadLabel, velocidadField);

        JButton calcularButton = new JButton("Calcular");
        JPanel calcularPanel = crearPanelConMargen(calcularButton);

        JLabel resultadoLabel = new JLabel("Energía cinética (J):");
        JLabel resultadoEnergia = new JLabel("-");
        JPanel resultadoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        resultadoPanel.add(resultadoLabel);
        resultadoPanel.add(resultadoEnergia);

        calcularButton.addActionListener(e -> {
            try {
                double masa = Double.parseDouble(masaField.getText());
                double velocidad = Double.parseDouble(velocidadField.getText());
                double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

                resultadoEnergia.setText(String.format("%.2f J", energiaCinetica));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(energiaFrame,
                        "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar componentes
        energiaFrame.add(masaPanel);
        energiaFrame.add(velocidadPanel);
        energiaFrame.add(calcularPanel);
        energiaFrame.add(resultadoPanel);

        energiaFrame.setVisible(true);
    }

    // Método para crear un panel con márgenes y un campo de texto
    private static JPanel crearPanelConMargen(JLabel label, JTextField campo) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(5, 5, 5, 5)); // Márgenes
        panel.add(label, BorderLayout.NORTH);
        panel.add(campo, BorderLayout.CENTER);
        return panel;
    }

    // Método para crear un panel con márgenes y un botón
    private static JPanel crearPanelConMargen(JButton boton) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Márgenes
        panel.add(boton);
        return panel;
    }
}
