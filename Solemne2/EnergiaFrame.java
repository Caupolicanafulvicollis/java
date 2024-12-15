package Solemne2;

import javax.swing.*;
import java.awt.*;

public class EnergiaFrame extends JFrame {

    public EnergiaFrame() {
        super("Energía");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10)); // Espaciado

        // Componentes
        JLabel masaLabel = new JLabel("Masa (kg):");
        JTextField masaField = new JTextField();
        JPanel masaPanel = UtilidadesGUI.crearPanelConMargen(masaLabel, masaField);

        JLabel velocidadLabel = new JLabel("Velocidad (m/s):");
        JTextField velocidadField = new JTextField();
        JPanel velocidadPanel = UtilidadesGUI.crearPanelConMargen(velocidadLabel, velocidadField);

        JButton calcularButton = new JButton("Calcular");
        JPanel calcularPanel = UtilidadesGUI.crearPanelConMargen(calcularButton);

        JLabel resultadoLabel = new JLabel("Energía cinética (J):");
        JLabel resultadoEnergia = new JLabel("-");
        JPanel resultadoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        resultadoPanel.add(resultadoLabel);
        resultadoPanel.add(resultadoEnergia);

        // Acción del botón Calcular
        calcularButton.addActionListener(e -> {
            try {
                double masa = Double.parseDouble(masaField.getText());
                double velocidad = Double.parseDouble(velocidadField.getText());
                double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

                resultadoEnergia.setText(String.format("%.2f J", energiaCinetica));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar componentes
        add(masaPanel);
        add(velocidadPanel);
        add(calcularPanel);
        add(resultadoPanel);

        setVisible(true);
    }
}
