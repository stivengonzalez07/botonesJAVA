
package examenrb;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Formulario extends JFrame {

    public Formulario() {
            
            setTitle("EXAMEN BANDERAS");
            setSize(850,600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setLocationRelativeTo(null);
            Contenido x=new Contenido();
            add(x);
           
             
}
}

