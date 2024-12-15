package calculadoraFinanciera;

import javax.swing.*;
import java.awt.*;

public class CalculadoraFinancieraApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraFinancieraApp().iniciar();
        });
    }

    public void iniciar() {
        // Crear la ventana principal
        JFrame mainFrame = new JFrame("Calculadora Financiera");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);

        // Crear un panel para el menú vertical
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
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

        // Configurar acciones de los botones
        facturaButton.addActionListener(e -> new FacturaFrame());
        interesButton.addActionListener(e -> new InteresFrame());
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
}
