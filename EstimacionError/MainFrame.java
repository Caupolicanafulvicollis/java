//Clase Ventana Principal
package EstimacionError;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    public MainFrame() {
        // Crear la ventana principal
        super("Estimacion del Error Absoluto y Relativo");
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); //disenho aboluto para poscionar elementos manualmente
        
        // Crear el menu y las opciones
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem ErAbs = new JMenuItem("Calculo Error Absoluto");
        JMenuItem ErRel = new JMenuItem("Calculo Error Relativo");
        JMenuItem salItem = new JMenuItem("Salir");

        //Agregar las opciones al menu
        menu.add(ErAbs);
        menu.add(ErRel);
        menu.add(salItem);
        menuBar.add(menu);
        
        setJMenuBar(menuBar); //Asigna la barra de menú menuBar a la ventana principal (MainFrame).

        //Mensaje explicativo
        JTextArea mensajeUsuario = new JTextArea(
            "Bienvenido al programa Control 1.\n\n"
            + "Por favor, elige una de las siguientes opciones en el menú:\n"
            + "1. Factura: Para calcular el monto total de un artículo con impuesto.\n"
            + "2. Interés: Para calcular el interés ganado por un depósito.\n"
            + "3. Salir: Para cerrar el programa."
        );
        mensajeUsuario.setBounds(20, 20, 360, 150);
        mensajeUsuario.setEditable(false); // Hacer el área de texto no editable
        mensajeUsuario.setLineWrap(true); // Ajustar el texto a las líneas
        mensajeUsuario.setWrapStyleWord(true); // Cortar palabras completas
        mensajeUsuario.setBackground(getContentPane().getBackground()); // Fondo igual al de la ventana

        add(mensajeUsuario); // Agregar el mensaje al marco principal

        //Acciones para las opciones del menu
        ErAbs.addActionListener(this::mostrarVentanaErAbs);
        ErRel.addActionListener(this::mostrarVentanaErRel);
        salItem.addActionListener(this::salir);
    }

    private void mostrarVentanaErAbs(ActionEvent e) {
        ErrorAbsolutoFrame ErAbsoluteFrame = new ErrorAbsolutoFrame();
        ErAbsoluteFrame.setVisible(true);
    }
    private void mostrarVentanaErRel(ActionEvent e) {
        ErrorRelativoFrame ErRelativeFrame = new ErrorRelativoFrame();
        ErRelativeFrame.setVisible(true);
    }
    private void salir(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "El programa finalizará su ejecución.");
        System.exit(0);
    }
}

