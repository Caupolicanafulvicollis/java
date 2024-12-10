package EstimacionError;

import javax.swing.*;

public class ErrorAbsolutoFrame extends JFrame {
    private final CalculoErrorAbsoluto calculoErrorAbsoluto; //Objeto para manejar calculos de interes 

    public ErrorAbsolutoFrame(){
        //Inicilizacion
        super("Calculo Error Absoluto");
        calculoErrorAbsoluto = new CalculoErrorAbsoluto(); //Inicilizador la logica de interes 
        setSize(400,300);
        setLayout(null);

        //Componentes
        JLabel labelValorReal = new JLabel("Valor Real:");
        JTextField campoValorReal = new JTextField();
        JLabel labelValorExperimental = new JLabel("Valor Experimental:");
        JTextField campoValorExperimental = new JTextField();
        JButton buttonErrorAbsoluto = new JButton("Calcular");
        JLabel labelResultadoErrorAbsoluto = new JLabel("Resultado Error Absoluto: ");
        
        // Posicionamiento
        labelValorReal.setBounds(10, 10, 120, 25);
        campoValorReal.setBounds(140, 10, 200, 25);
        labelValorExperimental.setBounds(10, 50, 150, 25);
        campoValorExperimental.setBounds(140, 50, 200, 25);
        buttonErrorAbsoluto.setBounds(140, 90, 100, 25);
        labelResultadoErrorAbsoluto.setBounds(10, 130, 360, 25); // Ampliar el ancho para el resultado

        //Accion del boton calcular 
        buttonErrorAbsoluto.addActionListener(e -> {
            try{
                //Obtener valores de entrada
                double valorReal = Double.parseDouble(campoValorReal.getText());
                double valorExperimental = Double.parseDouble(campoValorExperimental.getText());
                
                //Calcular resultados
                double resultado = calculoErrorAbsoluto.calcularErrorAbsoluto(valorReal, valorExperimental);

                //Mostrar resultado en pantalla
                labelResultadoErrorAbsoluto.setText("Resultado Error Absoluto: " + resultado);
            }
            catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(ErrorAbsolutoFrame.this,
                "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        //Agregar componentes
        add(labelValorReal);
        add(campoValorReal);
        add(labelValorExperimental);
        add(campoValorExperimental);
        add(buttonErrorAbsoluto);
        add(labelResultadoErrorAbsoluto);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ErrorAbsolutoFrame frame = new ErrorAbsolutoFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
