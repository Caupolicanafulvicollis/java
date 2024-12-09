package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener; // Importación correcta de ActionListener
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.border.EmptyBorder;

public class CalculadoraGUI {
    private final CalculadoraLogica logica; // Lógica de operaciones matemáticas
    private final StringBuilder expresion; // Construcción de la expresión actual
    private final AtomicInteger memoria; // Memoria para almacenar el resultado
    private final AtomicReference<String> ultimaOperacion; // Última operación seleccionada
    private JLabel mensaje; // Pantalla para mostrar resultados y operaciones

    public CalculadoraGUI() {
        logica = new CalculadoraLogica(); // Inicializar la lógica
        expresion = new StringBuilder(); // Inicializar la expresión
        memoria = new AtomicInteger(0); // Inicializar la memoria
        ultimaOperacion = new AtomicReference<>(""); // Inicializar la última operación
    }

    /**
     * Configura la interfaz gráfica y agrega los componentes a la ventana.
     *
     * @param ventana La ventana principal.
     */
    public void configurar(JFrame ventana) {
        // PANTALLA NEGRA
        JPanel pantallaNegra = new JPanel();
        pantallaNegra.setBackground(Color.BLACK);
        pantallaNegra.setBounds(30, 30, 340, 70);
        pantallaNegra.setBorder(new EmptyBorder(10, 10, 10, 10));
        pantallaNegra.setLayout(new BorderLayout());

        mensaje = new JLabel("", SwingConstants.CENTER);
        mensaje.setForeground(new Color(0, 255, 0)); // Color verde para estilo retro
        mensaje.setFont(new Font("Monospaced", Font.BOLD, 16)); // Fuente monoespaciada
        pantallaNegra.add(mensaje);

        ventana.add(pantallaNegra); // Agregar pantalla a la ventana

        // BOTONES NUMÉRICOS
        JButton[] botonesNumericos = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            final int numero = i; // Crear una copia local y final de `i`
            botonesNumericos[i] = crearBoton(String.valueOf(numero), e -> {
                expresion.append(numero);
                mensaje.setText(expresion.toString());
            });
        }

        // BOTONES DE OPERACIONES
        JButton botonSuma = crearBoton("+", e -> procesarOperacion("+"));
        JButton botonResta = crearBoton("-", e -> procesarOperacion("-"));
        JButton botonMultiplicacion = crearBoton("x", e -> procesarOperacion("x"));
        JButton botonDivision = crearBoton("÷", e -> procesarOperacion("÷"));
        JButton botonIgual = crearBoton("=", e -> procesarIgual());
        JButton botonCE = crearBoton("CE", e -> reiniciar());

        // POSICIONAR BOTONES
        botonesNumericos[1].setBounds(30, 120, 60, 30);
        botonesNumericos[2].setBounds(100, 120, 60, 30);
        botonesNumericos[3].setBounds(170, 120, 60, 30);
        botonesNumericos[4].setBounds(30, 160, 60, 30);
        botonesNumericos[5].setBounds(100, 160, 60, 30);
        botonesNumericos[6].setBounds(170, 160, 60, 30);
        botonesNumericos[7].setBounds(30, 200, 60, 30);
        botonesNumericos[8].setBounds(100, 200, 60, 30);
        botonesNumericos[9].setBounds(170, 200, 60, 30);
        botonesNumericos[0].setBounds(100, 240, 60, 30);

        botonSuma.setBounds(260, 120, 50, 30);
        botonResta.setBounds(320, 120, 50, 30);
        botonMultiplicacion.setBounds(260, 160, 50, 30);
        botonDivision.setBounds(320, 160, 50, 30);
        botonIgual.setBounds(320, 200, 50, 30);
        botonCE.setBounds(260, 200, 50, 30);

        // AGREGAR BOTONES A LA VENTANA
        for (JButton boton : botonesNumericos) {
            ventana.add(boton);
        }
        ventana.add(botonSuma);
        ventana.add(botonResta);
        ventana.add(botonMultiplicacion);
        ventana.add(botonDivision);
        ventana.add(botonIgual);
        ventana.add(botonCE);
    }

    /**
     * Método auxiliar para crear un botón con una acción asociada.
     *
     * @param texto  Texto del botón.
     * @param accion Acción a ejecutar cuando se presiona el botón.
     * @return El botón creado.
     */
    private JButton crearBoton(String texto, ActionListener accion) {
        JButton boton = new JButton(texto);
        boton.addActionListener(accion);
        return boton;
    }

    /**
     * Procesa la operación seleccionada por el usuario.
     *
     * @param operacion El operador seleccionado (+, -, x, ÷).
     */
    private void procesarOperacion(String operacion) {
        realizarOperacionPendiente();
        ultimaOperacion.set(operacion);
    }

    /**
     * Calcula el resultado de la operación actual y lo muestra en pantalla.
     */
    private void procesarIgual() {
        realizarOperacionPendiente();
        ultimaOperacion.set(""); // Reinicia la operación
    }

    /**
     * Reinicia la calculadora, limpiando la memoria y la pantalla.
     */
    private void reiniciar() {
        expresion.setLength(0);
        memoria.set(0);
        ultimaOperacion.set("");
        mensaje.setText("");
    }

    /**
     * Realiza la operación pendiente utilizando los valores de memoria y expresión.
     */
    private void realizarOperacionPendiente() {
        if (expresion.length() > 0) {
            int numero = Integer.parseInt(expresion.toString());
            memoria.set(logica.realizarOperacion(memoria.get(), numero, ultimaOperacion.get()));
            mensaje.setText(String.valueOf(memoria.get()));
            expresion.setLength(0);
        }
    }
}
