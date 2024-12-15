package Solemne2;

import javax.swing.*;
import java.awt.*;

public class LoteriaFrame extends JFrame {

    public LoteriaFrame() {
        super("Lotería");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10)); // Espaciado

        // Componentes
        JLabel desdeLabel = new JLabel("Monto del premio a optar desde:");
        JTextField desdeField = new JTextField();
        JPanel desdePanel = UtilidadesGUI.crearPanelConMargen(desdeLabel, desdeField);

        JLabel hastaLabel = new JLabel("Monto del premio a optar hasta:");
        JTextField hastaField = new JTextField();
        JPanel hastaPanel = UtilidadesGUI.crearPanelConMargen(hastaLabel, hastaField);

        JButton calcularButton = new JButton("Calcular");
        JPanel calcularPanel = UtilidadesGUI.crearPanelConMargen(calcularButton);

        JLabel resultadoLabel = new JLabel("Monto a pagar por el ticket:");
        JLabel resultadoMonto = new JLabel("-");
        JPanel resultadoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        resultadoPanel.add(resultadoLabel);
        resultadoPanel.add(resultadoMonto);

        // Acción del botón Calcular
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
                JOptionPane.showMessageDialog(this,
                        "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar componentes
        add(desdePanel);
        add(hastaPanel);
        add(calcularPanel);
        add(resultadoPanel);

        setVisible(true);
    }
}
