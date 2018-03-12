package quiz;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Systems
 */
public class Envia extends JFrame {
    private JLabel entrada;
    private JTextField texto;
    private JButton boton;
    private String valor="";
    
    public Envia(){
        super("Quiz Window");
        
        entrada = new JLabel("Entrada :");
        texto = new JTextField(25   );
        boton = new JButton("Aceptar");
        
        this.getContentPane().setBackground(Color.cyan);
        
        this.setLayout(null);
        
        entrada.setBounds(50,100, 50, 50);
        texto.setBounds(120,100,150,50);
        boton.setBounds(100,200,100,50);
        add(entrada);
        add(texto);
        add(boton);
          
        
        boton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                valor = (String) texto.getText();
                Mensaje m = new Mensaje(valor);
                m.setSize(400,500);
                m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                m.setVisible(true);
                setVisible(false);
               // System.out.println(valor);
            }
        });
    }
}
