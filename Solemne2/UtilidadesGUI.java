package Solemne2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class UtilidadesGUI {

    public static void configurarBoton(JButton boton) {
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        boton.setPreferredSize(new Dimension(200, 40)); // Tamaño preferido
    }

    public static JPanel crearPanelConMargen(JLabel label, JTextField campo) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(5, 5, 5, 5)); // Márgenes
        panel.add(label, BorderLayout.NORTH);
        panel.add(campo, BorderLayout.CENTER);
        return panel;
    }

    public static JPanel crearPanelConMargen(JButton boton) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Márgenes
        panel.add(boton);
        return panel;
    }
}
