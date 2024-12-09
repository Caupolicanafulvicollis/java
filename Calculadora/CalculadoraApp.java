package Calculadora;

import javax.swing.*;

public class CalculadoraApp {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame ventana = new JFrame("Calculadora Completa");
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // Agregar la calculadora a la ventana
        CalculadoraGUI calculadora = new CalculadoraGUI();
        calculadora.configurar(ventana);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}
