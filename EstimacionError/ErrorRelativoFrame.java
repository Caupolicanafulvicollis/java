package EstimacionError;

import javax.swing.*;

public class ErrorRelativoFrame extends JFrame {
    private final CalculoErrorRelativo calculoErrorRelativo; //

    public ErrorRelativoFrame(){
        //Inicilización
        super("Calculo Error Relativo");
        calculoErrorRelativo = new CalculoErrorRelativo(); //Inicilizador la logica de interes 
        setSize(400,300);
        setLayout(null);

        //Componentes
        JLabel labelValorReal = new JLabel("Valor Real");
        JTextField campoValorReal = new JTextField();
        JLabel labelValorExperimental = new JLabel("Valor Experimental");
        JTextField campoValorExperimental = new JTextField();
        JButton buttonErrorRelativo = new JButton("Calcular");
        JLabel labelResultadoErrorRelativo = new JLabel("Resultado Error Relativo");

        //Posicionamiento
        labelValorReal.setBounds(10, 10, 120, 25);
        campoValorReal.setBounds(140, 10, 200, 25);
        labelValorExperimental.setBounds(10, 50, 150, 25);
        campoValorExperimental.setBounds(140, 50, 200, 25);
        buttonErrorRelativo.setBounds(140, 90, 100, 25);
        labelResultadoErrorRelativo.setBounds(10, 130, 360, 25); // Ampliar el ancho para el resultado

        //Accion del boton calcular
        buttonErrorRelativo.addActionListener(e -> {
            try {
                //Obtener valores de entrada
                double valorReal = Double.parseDouble(campoValorReal.getText());
                double valorExperimental = Double.parseDouble(campoValorExperimental.getText());

                //Calcular resultados
                double resultado = calculoErrorRelativo.calcularErrorRelativo(valorReal, valorExperimental);

                //Mostrar resultado en pantalla
                labelResultadoErrorRelativo.setText("Resultado Error Relativo: "+ resultado);
            }
            catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(ErrorRelativoFrame.this,
                "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        //Agregar compoenentes 
        add(labelValorReal);
        add(campoValorReal);
        add(labelValorExperimental);
        add(campoValorExperimental);
        add(buttonErrorRelativo);
        add(labelResultadoErrorRelativo);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ErrorAbsolutoFrame frame = new ErrorAbsolutoFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}