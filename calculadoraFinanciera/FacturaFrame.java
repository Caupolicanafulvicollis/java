package calculadoraFinanciera;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FacturaFrame extends JFrame {

    public FacturaFrame() {
        super("Factura");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Componentes
        JLabel nombreLabel = new JLabel("Nombre del artículo:");
        JTextField nombreField = new JTextField();
        JLabel precioLabel = new JLabel("Precio:");
        JTextField precioField = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        JLabel impuestoLabel = new JLabel("Monto a pagar de impuesto:");
        JLabel totalLabel = new JLabel("Monto total a pagar:");

        JLabel impuestoResultLabel = new JLabel("-");
        JLabel totalResultLabel = new JLabel("-");

        // Crear panel para organizar componentes verticalmente con márgenes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(10, 20, 10, 20)); // Márgenes

        // Agregar componentes al panel
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(precioLabel);
        panel.add(precioField);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(calcularButton);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(impuestoLabel);
        panel.add(impuestoResultLabel);
        panel.add(Box.createVerticalStrut(10)); // Espaciado entre elementos
        panel.add(totalLabel);
        panel.add(totalResultLabel);

        add(panel, BorderLayout.CENTER);

        // Acción del botón Calcular
        calcularButton.addActionListener(e -> {
            try {
                String nombre = nombreField.getText();
                double precio = Double.parseDouble(precioField.getText());
                double impuesto = precio * 0.19;
                double total = precio + impuesto;

                impuestoResultLabel.setText(String.format("$%.2f", impuesto));
                totalResultLabel.setText(String.format("$%.2f", total));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Ingrese un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}
