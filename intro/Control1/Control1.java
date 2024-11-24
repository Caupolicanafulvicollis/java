import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control1 {

    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame mainFrame = new JFrame("Control 1");
        JMenuBar menuBar = new JMenuBar();

        // Crear el menú y las opciones
        JMenu menu = new JMenu("Opciones");
        JMenuItem facturaItem = new JMenuItem("Factura");
        JMenuItem interesItem = new JMenuItem("Interés");
        JMenuItem salirItem = new JMenuItem("Salir");

        // Agregar las opciones al menú
        menu.add(facturaItem);
        menu.add(interesItem);
        menu.add(salirItem);
        menuBar.add(menu);

        // Configurar la ventana principal
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        // Acción para "Factura"
        facturaItem.addActionListener(e -> mostrarVentanaFactura());

        // Acción para "Interés"
        interesItem.addActionListener(e -> mostrarVentanaInteres());

        // Acción para "Salir"
        salirItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "El programa finalizará su ejecución.");
            System.exit(0);
        });
    }

    private static void mostrarVentanaFactura() {
        JFrame facturaFrame = new JFrame("Factura");
        facturaFrame.setSize(400, 200);
        facturaFrame.setLayout(null);

        JLabel labelNombre = new JLabel("Nombre del artículo:");
        JLabel labelPrecio = new JLabel("Precio:");
        JTextField campoNombre = new JTextField();
        JTextField campoPrecio = new JTextField();
        JButton calcularButton = new JButton("Calcular");

        JLabel resultadoImpuesto = new JLabel();
        JLabel resultadoTotal = new JLabel();

        labelNombre.setBounds(20, 20, 150, 25);
        labelPrecio.setBounds(20, 60, 150, 25);
        campoNombre.setBounds(180, 20, 180, 25);
        campoPrecio.setBounds(180, 60, 180, 25);
        calcularButton.setBounds(140, 100, 100, 25);
        resultadoImpuesto.setBounds(20, 140, 360, 25);
        resultadoTotal.setBounds(20, 170, 360, 25);

        calcularButton.addActionListener(e -> {
            try {
                double precio = Double.parseDouble(campoPrecio.getText());
                double impuesto = precio * 0.19;
                double total = precio + impuesto;
                resultadoImpuesto.setText("Monto a pagar de impuesto: $" + impuesto);
                resultadoTotal.setText("Monto total a pagar: $" + total);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(facturaFrame, "Ingrese un precio válido.");
            }
        });

        facturaFrame.add(labelNombre);
        facturaFrame.add(labelPrecio);
        facturaFrame.add(campoNombre);
        facturaFrame.add(campoPrecio);
        facturaFrame.add(calcularButton);
        facturaFrame.add(resultadoImpuesto);
        facturaFrame.add(resultadoTotal);

        facturaFrame.setVisible(true);
    }

    private static void mostrarVentanaInteres() {
        JFrame interesFrame = new JFrame("Interés");
        interesFrame.setSize(400, 300);
        interesFrame.setLayout(null);

        JLabel labelNombre = new JLabel("Nombre del depositante:");
        JLabel labelRut = new JLabel("RUT del depositante:");
        JLabel labelCapital = new JLabel("Capital depositado:");
        JLabel labelInteres = new JLabel("Porcentaje de interés:");
        JTextField campoNombre = new JTextField();
        JTextField campoRut = new JTextField();
        JTextField campoCapital = new JTextField();
        JTextField campoInteres = new JTextField();
        JButton calcularButton = new JButton("Calcular");

        JLabel resultadoInteres = new JLabel();
        JLabel resultadoCapitalFinal = new JLabel();

        labelNombre.setBounds(20, 20, 150, 25);
        labelRut.setBounds(20, 60, 150, 25);
        labelCapital.setBounds(20, 100, 150, 25);
        labelInteres.setBounds(20, 140, 150, 25);
        campoNombre.setBounds(180, 20, 180, 25);
        campoRut.setBounds(180, 60, 180, 25);
        campoCapital.setBounds(180, 100, 180, 25);
        campoInteres.setBounds(180, 140, 180, 25);
        calcularButton.setBounds(140, 180, 100, 25);
        resultadoInteres.setBounds(20, 220, 360, 25);
        resultadoCapitalFinal.setBounds(20, 250, 360, 25);

        calcularButton.addActionListener(e -> {
            try {
                double capital = Double.parseDouble(campoCapital.getText());
                double interes = Double.parseDouble(campoInteres.getText()) / 100;
                double montoInteres = capital * interes;
                double capitalFinal = capital + montoInteres;
                resultadoInteres.setText("Monto interés ganado: $" + montoInteres);
                resultadoCapitalFinal.setText("Capital final: $" + capitalFinal);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(interesFrame, "Ingrese valores válidos.");
            }
        });

        interesFrame.add(labelNombre);
        interesFrame.add(labelRut);
        interesFrame.add(labelCapital);
        interesFrame.add(labelInteres);
        interesFrame.add(campoNombre);
        interesFrame.add(campoRut);
        interesFrame.add(campoCapital);
        interesFrame.add(campoInteres);
        interesFrame.add(calcularButton);
        interesFrame.add(resultadoInteres);
        interesFrame.add(resultadoCapitalFinal);

        interesFrame.setVisible(true);
    }
}

