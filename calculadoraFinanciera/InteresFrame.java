package calculadoraFinanciera;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class InteresFrame extends JFrame {

    public InteresFrame() {
        super("Interés");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Componentes
        JLabel nombreLabel = new JLabel("Nombre del depositante:");
        JTextField nombreField = new JTextField();
        JLabel rutLabel = new JLabel("Rut del depositante:");
        JTextField rutField = new JTextField();
        JLabel capitalLabel = new JLabel("Capital depositado:");
        JTextField capitalField = new JTextField();
        JLabel interesLabel = new JLabel("Porcentaje de interés:");
        JTextField interesField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        JLabel interesGanadoLabel = new JLabel("Monto interés ganado:");
        JLabel capitalFinalLabel = new JLabel("Capital final:");

        JLabel interesGanadoResultLabel = new JLabel("-");
        JLabel capitalFinalResultLabel = new JLabel("-");

        // Crear panel para organizar componentes verticalmente con márgenes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(10, 20, 10, 20)); // Márgenes

        // Agregar componentes al panel
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(rutLabel);
        panel.add(rutField);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(capitalLabel);
        panel.add(capitalField);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(interesLabel);
        panel.add(interesField);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(calcularButton);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(interesGanadoLabel);
        panel.add(interesGanadoResultLabel);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(capitalFinalLabel);
        panel.add(capitalFinalResultLabel);

        add(panel, BorderLayout.CENTER);

        // Acción del botón Calcular
        calcularButton.addActionListener(e -> {
            try {
                String nombre = nombreField.getText();
                String rut = rutField.getText();
                double capital = Double.parseDouble(capitalField.getText());
                double porcentajeInteres = Double.parseDouble(interesField.getText()) / 100;

                double interesGanado = capital * porcentajeInteres;
                double capitalFinal = capital + interesGanado;

                interesGanadoResultLabel.setText(String.format("$%.2f", interesGanado));
                capitalFinalResultLabel.setText(String.format("$%.2f", capitalFinal));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}
