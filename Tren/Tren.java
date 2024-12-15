
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Tren extends JFrame {
    
    int kmRec, diasTren;
    float pagoSd; 
            
    JLabel lblNombreCliente, lblRutCliente,  lblKmRec, lblDiasTren, lblPagoSd, lblDesc, lblPfinal;
    JTextField txtNombreCliente, txtRutCliente, txtKmRec, txtDiasTren;
    JButton boton;
    
    public Tren(){
        lblNombreCliente = new JLabel("* Nombre del cliente: ");
        lblRutCliente = new JLabel("* Rut Cliente: ");
        lblKmRec = new JLabel("* Distancia a recorrer Kms: ");
        lblDiasTren = new JLabel("* Número de días de estancia en el tren: ");
        lblPagoSd = new JLabel();
        lblDesc = new JLabel();
        lblPfinal = new JLabel(); 
        boton = new JButton("Calcular pago");
        
        txtNombreCliente = new JTextField(12);
        txtRutCliente = new JTextField(12);
        txtKmRec = new JTextField(12);
        txtDiasTren = new JTextField(4);
        
        lblNombreCliente.setBounds(50, 20, 200, 30);
        txtNombreCliente.setBounds(300, 25, 200, 20);
        lblRutCliente.setBounds(50, 50, 200, 30);
        txtRutCliente.setBounds(300, 55, 100, 20);
        lblKmRec.setBounds(50, 60, 200, 70);
        txtKmRec.setBounds(300, 85, 80, 20);
        lblDiasTren.setBounds(50, 90, 250, 70);
        txtDiasTren.setBounds(300, 115, 50 ,20);
        lblPagoSd.setBounds(120,200,300, 70);
        lblDesc.setBounds(120, 250, 300, 30);
        lblPfinal.setBounds(120, 300, 300, 30);
        
        boton.setBounds(220, 165,120, 30);
               
        Container panel = getContentPane();
        panel.setLayout(null);
        panel.add(lblNombreCliente);
        panel.add(lblRutCliente);
        panel.add(lblKmRec);
        panel.add(lblDiasTren);
        panel.add(lblPagoSd);
        panel.add(lblDesc);
        panel.add(lblPfinal);
        panel.add(txtNombreCliente);
        panel.add(txtRutCliente);
        panel.add(txtKmRec);
        panel.add(txtDiasTren);
        panel.add(boton);
        
        panel.setBackground(Color.CYAN);
        boton.addActionListener(new ActionListener(){   
            public void actionPerformed(ActionEvent e){
                String nombre = txtNombreCliente.getText();
                String rut = txtRutCliente.getText();
                String distancia = txtKmRec.getText();
                String dias = txtDiasTren.getText();
                
                float descuento = 0;
                float precioKm = (float) 0.75;     // Se establece el precio por KM en $0.75
                
                if (nombre.equals("") || rut.equals("") || distancia.equals("") || dias.equals("")){
                    JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos solicitados", "Información", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    diasTren = Integer.parseInt(dias);
                    kmRec = Integer.parseInt(distancia);
                    pagoSd = kmRec * precioKm;
                    
                    if ((diasTren > 2) && (kmRec > 3000)){
                        descuento = (float) 0.3;                         
                                                          
                    } 
                    lblPagoSd.setText("PAGO SIN DESCUENTO...............:  $ "+ pagoSd );
                    lblDesc.setText("DESCUENTO APLICADO...............:  $ "+ descuento * pagoSd );     
                    lblPfinal.setText("PAGO FINAL....................................:  $ " + (pagoSd - (descuento * pagoSd)));   
                }
                
                
            }
            
        });
    } 

 
}  