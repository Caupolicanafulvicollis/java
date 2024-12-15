package Solemne2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Solemne2App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Solemne2App().iniciar();
        });
    }

    public void iniciar() {
        // Crear la ventana principal
        JFrame mainFrame = new JFrame("Solemne 2");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setLocationRelativeTo(null);

        // Crear un panel para botones con márgenes
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(new EmptyBorder(20, 20, 20, 20)); // Márgenes
        menuPanel.setBackground(Color.LIGHT_GRAY);

        // Crear botones del menú
        JButton loteriaButton = new JButton("Lotería");
        JButton energiaButton = new JButton("Energía");
        JButton salirButton = new JButton("Salir");

        // Configurar los botones
        UtilidadesGUI.configurarBoton(loteriaButton);
        UtilidadesGUI.configurarBoton(energiaButton);
        UtilidadesGUI.configurarBoton(salirButton);

        // Agregar botones al panel
        menuPanel.add(loteriaButton);
        menuPanel.add(Box.createVerticalStrut(10)); // Espaciado entre botones
        menuPanel.add(energiaButton);
        menuPanel.add(Box.createVerticalStrut(10)); // Espaciado entre botones
        menuPanel.add(salirButton);

        // Acciones de los botones
        loteriaButton.addActionListener(e -> new LoteriaFrame());
        energiaButton.addActionListener(e -> new EnergiaFrame());
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
}
