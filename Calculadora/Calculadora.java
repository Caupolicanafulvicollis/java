package Calculadora;
import javax.swing.*; //para ventanas y botones
import java.awt.*; //para manejar diseñpo y colores
import java.awt.event.ActionListener; // Para detectar clics
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.border.EmptyBorder;


// Este paquete contiene las clases que implementan la calculadora


public class Calculadora{
    public static void main(String[] args){
        //Crear una ventana
        JFrame ventana = new JFrame("Diseño");
        ventana.setSize(400,500); //ventana (ancho,alto)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar la app al salir
        ventana.setLayout(null); //permitir diseño absoluto (manual)

//PANTALLA
    //Crear el panel negro
        JPanel pantallaNegra= new JPanel();
        pantallaNegra.setBackground(Color.BLACK); //Fondo negro
        pantallaNegra.setBounds(30, 30, 340, 70); // Posición y tamaño del panel
        pantallaNegra.setBorder(new EmptyBorder(10, 10, 10, 10)); // Márgenes internos (arriba, izquierda, abajo, derecha)
        pantallaNegra.setLayout(new BorderLayout()); //para centrar el mensaje

    //Crear un Jlabel para mostrar el mensaje
        JLabel mensaje = new JLabel(" ", SwingConstants.CENTER); //Texto vacio centrado
        mensaje.setForeground(new Color(0,255,0)); //texto blanco para que se vea negro
        mensaje.setFont(new Font("Monospaced",Font.BOLD,16)); //Fuente y tamaño del texto mensaje        
        pantallaNegra.add(mensaje);

//BOTONES
    //crear botones
        JButton boton1= new JButton("1");
        JButton boton2= new JButton("2");
        JButton boton3= new JButton("3");
        JButton boton4= new JButton("4");
        JButton boton5= new JButton("5");
        JButton boton6= new JButton("6");
        JButton boton7= new JButton("7");
        JButton boton8= new JButton("8");
        JButton boton9= new JButton("9");
        JButton boton0= new JButton("0");
        JButton botonSuma= new JButton("+");
        JButton botonResta= new JButton("-");
        JButton botonMultiplicacion= new JButton("x");
        JButton botonDivision= new JButton("/");
        JButton botonPunto= new JButton(".");
        JButton botonIgual= new JButton("=");
        JButton botonCE = new JButton("CE");

    //Posicionar los botones
        boton1.setBounds(30, 120, 60, 30);
        boton2.setBounds(100, 120, 60, 30);
        boton3.setBounds(170, 120, 60, 30);
        boton4.setBounds(30, 160, 60, 30);
        boton5.setBounds(100, 160, 60, 30);
        boton6.setBounds(170, 160, 60, 30);
        botonSuma.setBounds(260, 120, 50, 30);
        botonIgual.setBounds(320, 120, 50, 30);
        botonCE.setBounds(320, 160, 50, 30); // Botón CE ocupa todo el ancho

        //variables para construir la expresion y calcular el resultado
        StringBuilder expresion= new StringBuilder();
        //Varaible que guarda el ultimo resultado
        AtomicInteger memoria = new AtomicInteger(0);
        
    //Acciones a los botones
        boton1.addActionListener(e-> 
            {
            expresion.append("1"); //Agregar 1 a la expresion
            mensaje.setText(expresion.toString()); //Mostrar en pantalla
            });
        boton2.addActionListener(e-> 
            {
            expresion.append("2"); //Agregar 2 a la expresion
            mensaje.setText(expresion.toString());
            });
        boton3.addActionListener(e-> 
            {
            expresion.append("3");
            mensaje.setText(expresion.toString());
            });
        boton4.addActionListener(e-> 
            {
            expresion.append("4");
            mensaje.setText(expresion.toString());
            });
        boton5.addActionListener(e-> 
            {
            expresion.append("5");
            mensaje.setText(expresion.toString());
            });
        boton6.addActionListener(e-> 
            {
            expresion.append("6");
            mensaje.setText(expresion.toString());
            });
        botonSuma.addActionListener(e-> {
            if (expresion.length()==0)
            {
                expresion.append(memoria.get()).append("+"); //Usar memoria y agregar +
                
            } else if (!expresion.toString().endsWith("+")) 
            {
                expresion.append("+");    //Agregar + si no esta al final
            }
            mensaje.setText(expresion.toString()); //Mostrar en pantalla

        });
        botonIgual.addActionListener(e-> {
            try {
                    String[] partes = expresion.toString().split("\\+");
                
                    if (partes.length==2)
                    {
                        int num1=Integer.parseInt(partes[0].trim());
                        int num2=Integer.parseInt(partes[1].trim());
                        memoria.set(num1 + num2); // Cambiar a AtomicInteger
                        mensaje.setText(String.valueOf(memoria.get())); //mostrar el resultado en pantalla
                        expresion.setLength(0); //Reiniciar la expresion
                    } 
                    else 
                    { 
                        mensaje.setText("Error"); //
                    }
                }
                catch (Exception ex) {
                    mensaje.setText("Error");
                    expresion.setLength(0); //Reiniciar la expresion en caso de error
                }
        });
        botonCE.addActionListener(e-> {
            expresion.setLength(0); //Reiniciar la expresion
            memoria.set(0); //Reinicia la memoria
            mensaje.setText(""); //Limpia la pantalla
        });

//AGREGAR COMPONENTES A LA VENTANA
        ventana.add(pantallaNegra);
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(boton4);
        ventana.add(boton5);
        ventana.add(boton6);
        ventana.add(botonSuma);
        ventana.add(botonIgual);
        ventana.add(botonCE);
        
        // Hacer visible la ventana
        ventana.setVisible(true);

    }
}