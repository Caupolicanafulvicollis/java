package EstimacionError;

import javax.swing.*;
import java.awt.*;

public class ErrorAbsolutoFrame extends Frame {
    private final CalculoErrorAbsoluto calculoErrorAbsoluto; //Objeto para manejar calculos de interes 

    public ErrorAbsolutoFrame(){
        //Inicilizacion
        super("Calculo Error Absoluto");
        calculoErrorAbsoluto = new CalculoErrorAbsoluto(); //Inicilizador la logica de interes 
        setSize(400,300);
        setLayout(null);

        //Componentes
        JLabel labelValorReal = new JLabel("Valor Real");
        JTextField campoValorReal = new JTextField();
        JLabel labelValorExperimental = new JLabel("Valor Experimental");
        JTextField campoValorExperimental = new JTextField();
        JButton buttonErrorAbsoluto = new JButton("Calcular");
        JLabel labelResultadoErrorAbsoluto = new JLabel("Resultado Error Absoluto");
        
        //Posionamiento
        labelValorReal.setBounds(10, 10, 100, 20);
        campoValorReal.setBounds(120, 10, 200, 20);
        labelValorExperimental.setBounds(10, 40, 100, 20);
        campoValorExperimental.setBounds(120, 40, 200, 20);
        buttonErrorAbsoluto.setBounds(120, 70, 100, 20);
        labelResultadoErrorAbsoluto.setBounds(10, 100, 100, 20);
    }

}
