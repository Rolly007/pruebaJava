package quiz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Mensaje extends JFrame{
    private final JLabel mensaje;
    private String valor;
    private JButton regresar;
    
    public Mensaje(String x){
        super("Imprime");
        regresar = new JButton("Regresar");
        this.getContentPane().setBackground(Color.black);     
        this.valor = x;
         
        mensaje = new JLabel(valor);
        mensaje.setForeground(Color.white);
        mensaje.setFont(mensaje.getFont().deriveFont(50f));
        setLayout(new BorderLayout());
     
        add(mensaje,BorderLayout.CENTER);
        add(regresar,BorderLayout.SOUTH);
       
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Envia en = new Envia();
                en.setSize(300,400);
                en.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                en.setVisible(true);
                setVisible(false);
            }
        });
    }
}
