import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class calculadoraFinanciera {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame mainFrame = new JFrame("Control 1");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);

        // Crear un panel para el menú vertical
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS)); // Disposición vertical
        menuPanel.setBackground(Color.LIGHT_GRAY);

        // Crear botones para las opciones del menú
        JButton facturaButton = new JButton("Factura");
        JButton interesButton = new JButton("Interés");
        JButton salirButton = new JButton("Salir");

        // Alinear botones al centro
        facturaButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        interesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        salirButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Agregar los botones al panel
        menuPanel.add(Box.createVerticalStrut(20)); // Espacio inicial
        menuPanel.add(facturaButton);
        menuPanel.add(Box.createVerticalStrut(10)); // Espacio entre botones
        menuPanel.add(interesButton);
        menuPanel.add(Box.createVerticalStrut(10)); // Espacio entre botones
        menuPanel.add(salirButton);

        // Agregar el panel al lado izquierdo de la ventana principal
        mainFrame.add(menuPanel, BorderLayout.WEST);

        // Acción para "Factura"
        facturaButton.addActionListener(e -> mostrarVentanaFactura());

        // Acción para "Interés"
        interesButton.addActionListener(e -> mostrarVentanaInteres());

        // Acción para "Salir"
        salirButton.addActionListener(e -> {
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

    // Ventana para la opción "Factura"
    private static void mostrarVentanaFactura() {
        JFrame facturaFrame = new JFrame("Factura");
        facturaFrame.setSize(400, 300);
        facturaFrame.setLayout(new BorderLayout());
        facturaFrame.setLocationRelativeTo(null);

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

        facturaFrame.add(panel, BorderLayout.CENTER);

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
                JOptionPane.showMessageDialog(facturaFrame,
                        "Ingrese un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        facturaFrame.setVisible(true);
    }

    // Ventana para la opción "Interés"
    private static void mostrarVentanaInteres() {
        JFrame interesFrame = new JFrame("Interés");
        interesFrame.setSize(400, 400);
        interesFrame.setLayout(new BorderLayout());
        interesFrame.setLocationRelativeTo(null);

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

        interesFrame.add(panel, BorderLayout.CENTER);

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
                JOptionPane.showMessageDialog(interesFrame,
                        "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        interesFrame.setVisible(true);
    }
}
