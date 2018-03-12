package quiz;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Envia e = new Envia();
                e.setSize(300,400);
                e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                e.setVisible(true);
            }
        });
    }
    
}
