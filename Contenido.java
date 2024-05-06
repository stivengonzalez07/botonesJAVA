
package examenrb;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Contenido extends JPanel implements ActionListener {
    private JLabel lblSaludo, lblNombre,lblIntro,lblPre;
    private JLabel lblN1,lblN2,lblN3,lblN4,lblN5,lblN6,lblN7,lblN8,lblN9,lblN10;
    private JLabel lblUniR,lblFot1,lblFot2,lblFot3,lblFot4,lblFot5,lblFot6,lblFot7,lblFot8,lblFot9,lblFot10;
    private JTextField txtNombre;
    private JButton btnCali;
    private JRadioButton rbtPre11,rbtPre12,rbtPre13,rbtPre14;
    private JRadioButton rbtPre21,rbtPre22,rbtPre23,rbtPre24;
    private JRadioButton rbtPre31,rbtPre32,rbtPre33,rbtPre34;
    private JRadioButton rbtPre41,rbtPre42,rbtPre43,rbtPre44;
    private JRadioButton rbtPre51,rbtPre52,rbtPre53,rbtPre54;
    private JRadioButton rbtPre61,rbtPre62,rbtPre63,rbtPre64;
    private JRadioButton rbtPre71,rbtPre72,rbtPre73,rbtPre74;
    private JRadioButton rbtPre81,rbtPre82,rbtPre83,rbtPre84;
    private JRadioButton rbtPre91,rbtPre92,rbtPre93,rbtPre94;
    private JRadioButton rbtPre101,rbtPre102,rbtPre103,rbtPre104;
    private ButtonGroup btg1,btg2,btg3,btg4,btg5,btg6,btg7,btg8,btg9,btg10;
   
    public Contenido (){
       setLayout(null);
       setBackground(new Color(187, 231, 254));
       createLabel();
       createCajas();
       createBoton();
       createRadbot();
        
        

    }

    private void createLabel() {
            //lineas de texto presentacion
            
           lblSaludo=new JLabel();
           lblSaludo.setText("EXAMEN");
           lblSaludo.setFont(new Font("Arial",3,15));
           lblSaludo.setBounds(10, 10, 100, 30);
           add(lblSaludo); 
            
           lblNombre=new JLabel();
           lblNombre.setText("Nombre: ");
           lblNombre.setFont(new Font("Arial",0,15));
           lblNombre.setBounds(10, 30, 100, 30);
           add(lblNombre);
           
           lblIntro=new JLabel();
           lblIntro.setText("Examen de seleccion multiple con calificacion de 1 a 5");
           lblIntro.setFont(new Font("Arial",0,15));
           lblIntro.setBounds(10, 60, 400, 30);
           add(lblIntro);
           
           lblPre=new JLabel();
           lblPre.setText("seleccione la respuesta correcta");
           lblPre.setFont(new Font("Arial",1,15));
           lblPre.setBounds(10, 80, 400, 30);
           add(lblPre);
           
           ImageIcon uni=new ImageIcon(getClass().getResource("/Banderas/unir.png"));
        lblUniR=new JLabel();
        lblUniR.setBounds(400, 10, 420,100);
        lblUniR.setIcon(new ImageIcon(uni.getImage().getScaledInstance(lblUniR.getWidth(), lblUniR.getHeight(), Image.SCALE_SMOOTH)));
        lblUniR.setVisible(true);
        add(lblUniR);
          //lineas, pregunta 1
           lblN1=new JLabel();
           lblN1.setText("1.");
           lblN1.setFont(new Font("Arial",1,15));
           lblN1.setBounds(10, 140, 60, 30);
           add(lblN1);
           
  ImageIcon col=new ImageIcon(getClass().getResource("/Banderas/Colombia.png"));
        lblFot1=new JLabel();
        lblFot1.setBounds(30, 140, 100,80);
        lblFot1.setIcon(new ImageIcon(col.getImage().getScaledInstance(lblFot1.getWidth(), lblFot1.getHeight(), Image.SCALE_SMOOTH)));
        lblFot1.setVisible(true);
        add(lblFot1);
        //preg2  
        
          lblN2=new JLabel();
           lblN2.setText("2.");
           lblN2.setFont(new Font("Arial",1,15));
           lblN2.setBounds(10, 250, 60, 30);
           add(lblN2);
           
  ImageIcon esp=new ImageIcon(getClass().getResource("/Banderas/Espana.png"));
        lblFot2=new JLabel();
        lblFot2.setBounds(30, 250, 100,80);
        lblFot2.setIcon(new ImageIcon(esp.getImage().getScaledInstance(lblFot2.getWidth(), lblFot2.getHeight(), Image.SCALE_SMOOTH)));
        lblFot2.setVisible(true);
        add(lblFot2);
        
        //preg3
      lblN3=new JLabel();
           lblN3.setText("3.");
           lblN3.setFont(new Font("Arial",1,15));
           lblN3.setBounds(10, 360, 60, 30);
           add(lblN3);
           
  ImageIcon ale=new ImageIcon(getClass().getResource("/Banderas/Alemania.png"));
        lblFot3=new JLabel();
        lblFot3.setBounds(30, 360, 100,80);
        lblFot3.setIcon(new ImageIcon(ale.getImage().getScaledInstance(lblFot3.getWidth(), lblFot3.getHeight(), Image.SCALE_SMOOTH)));
        lblFot3.setVisible(true);
        add(lblFot3);  
      //preg4
      lblN4=new JLabel();
           lblN4.setText("4.");
           lblN4.setFont(new Font("Arial",1,15));
           lblN4.setBounds(10, 470, 60, 30);
           add(lblN4);
           
        ImageIcon can=new ImageIcon(getClass().getResource("/Banderas/Canada.png"));
        lblFot4=new JLabel();
        lblFot4.setBounds(30, 470, 100,80);
        lblFot4.setIcon(new ImageIcon(can.getImage().getScaledInstance(lblFot4.getWidth(), lblFot4.getHeight(), Image.SCALE_SMOOTH)));
        lblFot4.setVisible(true);
        add(lblFot4);  
           //preg5
            lblN5=new JLabel();
           lblN5.setText("8.");
           lblN5.setFont(new Font("Arial",1,15));
           lblN5.setBounds(300, 470, 60, 30);
           add(lblN5);
           
  ImageIcon cno=new ImageIcon(getClass().getResource("/Banderas/CNorte.png"));
        lblFot5=new JLabel();
        lblFot5.setBounds(320, 470, 100,80);
        lblFot5.setIcon(new ImageIcon(cno.getImage().getScaledInstance(lblFot5.getWidth(), lblFot5.getHeight(), Image.SCALE_SMOOTH)));
        lblFot5.setVisible(true);
        add(lblFot5);  
           //preg6
        lblN6=new JLabel();
        lblN6.setText("7.");
        lblN6.setFont(new Font("Arial",1,15));
        lblN6.setBounds(300, 360, 60, 30);
        add(lblN6);
           
        ImageIcon csu=new ImageIcon(getClass().getResource("/Banderas/CSur.png"));
        lblFot6=new JLabel();
        lblFot6.setBounds(320, 360, 100,80);
        lblFot6.setIcon(new ImageIcon(csu.getImage().getScaledInstance(lblFot6.getWidth(), lblFot6.getHeight(), Image.SCALE_SMOOTH)));
        lblFot6.setVisible(true);
        add(lblFot6); 
        //preg7
        lblN7=new JLabel();
           lblN7.setText("6.");
           lblN7.setFont(new Font("Arial",1,15));
           lblN7.setBounds(300, 250, 60, 30);
           add(lblN7);
           
  ImageIcon dom=new ImageIcon(getClass().getResource("/Banderas/Dominicana.png"));
        lblFot7=new JLabel();
        lblFot7.setBounds(320, 250, 100,80);
        lblFot7.setIcon(new ImageIcon(dom.getImage().getScaledInstance(lblFot7.getWidth(), lblFot7.getHeight(), Image.SCALE_SMOOTH)));
        lblFot7.setVisible(true);
        add(lblFot7);
        
        //preg8
        lblN8=new JLabel();
           lblN8.setText("5.");
           lblN8.setFont(new Font("Arial",1,15));
           lblN8.setBounds(300, 140, 60, 30);
           add(lblN8);
           
  ImageIcon ecu=new ImageIcon(getClass().getResource("/Banderas/Ecuador.png"));
        lblFot8=new JLabel();
        lblFot8.setBounds(320, 140, 100,80);
        lblFot8.setIcon(new ImageIcon(ecu.getImage().getScaledInstance(lblFot8.getWidth(), lblFot8.getHeight(), Image.SCALE_SMOOTH)));
        lblFot8.setVisible(true);
        add(lblFot8);
        //preg9
           lblN9=new JLabel();
           lblN9.setText("9.");
           lblN9.setFont(new Font("Arial",1,15));
           lblN9.setBounds(600, 140, 60, 30);
           add(lblN9);
           
  ImageIcon rus=new ImageIcon(getClass().getResource("/Banderas/Rusia.png"));
        lblFot9=new JLabel();
        lblFot9.setBounds(620, 140, 100,80);
        lblFot9.setIcon(new ImageIcon(rus.getImage().getScaledInstance(lblFot9.getWidth(), lblFot9.getHeight(), Image.SCALE_SMOOTH)));
        lblFot9.setVisible(true);
        add(lblFot9);
        //preg10
        lblN10=new JLabel();
           lblN10.setText("10.");
           lblN10.setFont(new Font("Arial",1,15));
           lblN10.setBounds(600, 250, 60, 30);
           add(lblN10);
           
  ImageIcon fra=new ImageIcon(getClass().getResource("/Banderas/Francia.png"));
        lblFot10=new JLabel();
        lblFot10.setBounds(620, 250, 100,80);
        lblFot10.setIcon(new ImageIcon(fra.getImage().getScaledInstance(lblFot10.getWidth(), lblFot10.getHeight(), Image.SCALE_SMOOTH)));
        lblFot10.setVisible(true);
        add(lblFot10);
           
    }

    private void createCajas() {
         //cajas de texto
         txtNombre=new JTextField();
        txtNombre.setText("");
        txtNombre.setForeground(new Color(106, 37, 200));
        txtNombre.setFont(new Font("Arial",0,18));
        txtNombre.setBounds(80, 35, 300, 20);
        add(txtNombre);
    }

    private void createBoton() {
        //boton calificar y limpiar
        btnCali=new JButton();
        btnCali.setText("CALIFICAR");
        btnCali.setForeground(new Color( 214, 44, 248));
        btnCali.setFont(new Font("Arial",3,30));
        btnCali.setBounds(600, 500, 225, 50);
        add(btnCali);
        btnCali.addActionListener(this);


    }

    private void createRadbot() {
//radio botones pregunta 1
        rbtPre11=new JRadioButton("Colombia");
        rbtPre11.setBounds(140, 140, 100, 20);
        rbtPre11.setBackground(new Color(187, 231, 254));
        add(rbtPre11);
        rbtPre12=new JRadioButton("Venezuela");
        rbtPre12.setBounds(140, 160, 90, 20);
        rbtPre12.setBackground(new Color(187, 231, 254));
        add(rbtPre12);
        rbtPre13=new JRadioButton("Peru");
        rbtPre13.setBounds(140, 180, 100, 20);
        rbtPre13.setBackground(new Color(187, 231, 254));
        add(rbtPre13);
        rbtPre14=new JRadioButton("Ecuador");
        rbtPre14.setBounds(140, 200, 100, 20);
        rbtPre14.setBackground(new Color(187, 231, 254));
        add(rbtPre14);
        
        btg1= new ButtonGroup();
        btg1.add(rbtPre11);
        btg1.add(rbtPre12);
        btg1.add(rbtPre13);
        btg1.add(rbtPre14);
       //preg 2
        rbtPre21=new JRadioButton("Ecuador");
        rbtPre21.setBounds(140, 250, 100, 20);
        rbtPre21.setBackground(new Color(187, 231, 254));
        add(rbtPre21);
        rbtPre22=new JRadioButton("España");
        rbtPre22.setBounds(140, 270, 90, 20);
        rbtPre22.setBackground(new Color(187, 231, 254));
        add(rbtPre22);
        rbtPre23=new JRadioButton("Bolivia");
        rbtPre23.setBounds(140, 290, 100, 20);
        rbtPre23.setBackground(new Color(187, 231, 254));
        add(rbtPre23);
        rbtPre24=new JRadioButton("Argentina");
        rbtPre24.setBounds(140, 310, 100, 20);
        rbtPre24.setBackground(new Color(187, 231, 254));
        add(rbtPre24);
        
        btg2= new ButtonGroup();
        btg2.add(rbtPre21);
        btg2.add(rbtPre22);
        btg2.add(rbtPre23);
        btg2.add(rbtPre24);
        
        //preg 3
        rbtPre31=new JRadioButton("Suiza");
        rbtPre31.setBounds(140, 360, 100, 20);
        rbtPre31.setBackground(new Color(187, 231, 254));
        add(rbtPre31);
        rbtPre32=new JRadioButton("Polonia");
        rbtPre32.setBounds(140, 380, 90, 20);
        rbtPre32.setBackground(new Color(187, 231, 254));
        add(rbtPre32);
        rbtPre33=new JRadioButton("Finlandia");
        rbtPre33.setBounds(140,400, 100, 20);
        rbtPre33.setBackground(new Color(187, 231, 254));
        add(rbtPre33);
        rbtPre34=new JRadioButton("Alemania");
        rbtPre34.setBounds(140, 420, 100, 20);
        rbtPre34.setBackground(new Color(187, 231, 254));
        add(rbtPre34);
        
        btg3= new ButtonGroup();
        btg3.add(rbtPre31);
        btg3.add(rbtPre32);
        btg3.add(rbtPre33);
        btg3.add(rbtPre34);
 
        //preg 4
        rbtPre41=new JRadioButton("Francia");
        rbtPre41.setBounds(140, 470, 100, 20);
        rbtPre41.setBackground(new Color(187, 231, 254));
        add(rbtPre41);
        rbtPre42=new JRadioButton("Londres");
        rbtPre42.setBounds(140, 490, 90, 20);
        rbtPre42.setBackground(new Color(187, 231, 254));
        add(rbtPre42);
        rbtPre43=new JRadioButton("Canada");
        rbtPre43.setBounds(140,510, 100, 20);
        rbtPre43.setBackground(new Color(187, 231, 254));
        add(rbtPre43);
        rbtPre44=new JRadioButton("EE UU");
        rbtPre44.setBounds(140, 530, 100, 20);
        rbtPre44.setBackground(new Color(187, 231, 254));
        add(rbtPre44);
        
        btg4= new ButtonGroup();
        btg4.add(rbtPre41);
        btg4.add(rbtPre42);
        btg4.add(rbtPre43);
        btg4.add(rbtPre44);
        //preg5
        rbtPre51=new JRadioButton("Colombia");
        rbtPre51.setBounds(430, 140, 100, 20);
        rbtPre51.setBackground(new Color(187, 231, 254));
        add(rbtPre51);
        rbtPre52=new JRadioButton("Venezuela");
        rbtPre52.setBounds(430, 160, 90, 20);
        rbtPre52.setBackground(new Color(187, 231, 254));
        add(rbtPre52);
        rbtPre53=new JRadioButton("Peru");
        rbtPre53.setBounds(430, 180, 100, 20);
        rbtPre53.setBackground(new Color(187, 231, 254));
        add(rbtPre53);
        rbtPre54=new JRadioButton("Ecuador");
        rbtPre54.setBounds(430, 200, 100, 20);
        rbtPre54.setBackground(new Color(187, 231, 254));
        add(rbtPre54);
        
        btg5= new ButtonGroup();
        btg5.add(rbtPre51);
        btg5.add(rbtPre52);
        btg5.add(rbtPre53);
        btg5.add(rbtPre54);
       //preg6
        rbtPre61=new JRadioButton("Ecuador");
        rbtPre61.setBounds(430, 250, 100, 20);
        rbtPre61.setBackground(new Color(187, 231, 254));
        add(rbtPre61);
        rbtPre62=new JRadioButton("España");
        rbtPre62.setBounds(430, 270, 90, 20);
        rbtPre62.setBackground(new Color(187, 231, 254));
        add(rbtPre62);
        rbtPre63=new JRadioButton("Nicaragua");
        rbtPre63.setBounds(430, 290, 100, 20);
        rbtPre63.setBackground(new Color(187, 231, 254));
        add(rbtPre63);
        rbtPre64=new JRadioButton("R. Dominicana");
        rbtPre64.setBounds(430, 310, 120, 20);
        rbtPre64.setBackground(new Color(187, 231, 254));
        add(rbtPre64);
        
        btg6= new ButtonGroup();
        btg6.add(rbtPre61);
        btg6.add(rbtPre62);
        btg6.add(rbtPre63);
        btg6.add(rbtPre64);
        
        //preg 7
        rbtPre71=new JRadioButton("Korea del Sur");
        rbtPre71.setBounds(430, 360, 120, 20);
        rbtPre71.setBackground(new Color(187, 231, 254));
        add(rbtPre71);
        rbtPre72=new JRadioButton("Japon");
        rbtPre72.setBounds(430, 380, 90, 20);
        rbtPre72.setBackground(new Color(187, 231, 254));
        add(rbtPre72);
        rbtPre73=new JRadioButton("Tokio");
        rbtPre73.setBounds(430,400, 100, 20);
        rbtPre73.setBackground(new Color(187, 231, 254));
        add(rbtPre73);
        rbtPre74=new JRadioButton("China");
        rbtPre74.setBounds(430, 420, 100, 20);
        rbtPre74.setBackground(new Color(187, 231, 254));
        add(rbtPre74);
        
        btg7= new ButtonGroup();
        btg7.add(rbtPre71);
        btg7.add(rbtPre72);
        btg7.add(rbtPre73);
        btg7.add(rbtPre74);
 
        //preg 8
        rbtPre81=new JRadioButton("Japon");
        rbtPre81.setBounds(430, 470, 100, 20);
        rbtPre81.setBackground(new Color(187, 231, 254));
        add(rbtPre81);
        rbtPre82=new JRadioButton("Rusia");
        rbtPre82.setBounds(430, 490, 90, 20);
        rbtPre82.setBackground(new Color(187, 231, 254));
        add(rbtPre82);
        rbtPre83=new JRadioButton("Korea del Norte");
        rbtPre83.setBounds(430,510, 120, 20);
        rbtPre83.setBackground(new Color(187, 231, 254));
        add(rbtPre83);
        rbtPre84=new JRadioButton("Korea del Sur");
        rbtPre84.setBounds(430, 530, 120, 20);
        rbtPre84.setBackground(new Color(187, 231, 254));
        add(rbtPre84);

       //preg 9
       rbtPre91=new JRadioButton("Francia");
        rbtPre91.setBounds(730, 140, 100, 20);
        rbtPre91.setBackground(new Color(187, 231, 254));
        add(rbtPre91);
        rbtPre92=new JRadioButton("Rusia");
        rbtPre92.setBounds(730, 160, 90, 20);
        rbtPre92.setBackground(new Color(187, 231, 254));
        add(rbtPre92);
        rbtPre93=new JRadioButton("Noruega");
        rbtPre93.setBounds(730, 180, 100, 20);
        rbtPre93.setBackground(new Color(187, 231, 254));
        add(rbtPre93);
        rbtPre94=new JRadioButton("Islandia");
        rbtPre94.setBounds(730, 200, 100, 20);
        rbtPre94.setBackground(new Color(187, 231, 254));
        add(rbtPre94);
        
        btg9= new ButtonGroup();
        btg9.add(rbtPre91);
        btg9.add(rbtPre92);
        btg9.add(rbtPre93);
        btg9.add(rbtPre94);
       //preg10
        rbtPre101=new JRadioButton("Rusia");
        rbtPre101.setBounds(730, 250, 100, 20);
        rbtPre101.setBackground(new Color(187, 231, 254));
        add(rbtPre101);
        rbtPre102=new JRadioButton("Francia");
        rbtPre102.setBounds(730, 270, 90, 20);
        rbtPre102.setBackground(new Color(187, 231, 254));
        add(rbtPre102);
        rbtPre103=new JRadioButton("Bolivia");
        rbtPre103.setBounds(730, 290, 100, 20);
        rbtPre103.setBackground(new Color(187, 231, 254));
        add(rbtPre103);
        rbtPre104=new JRadioButton("Chile");
        rbtPre104.setBounds(730, 310, 100, 20);
        rbtPre104.setBackground(new Color(187, 231, 254));
        add(rbtPre104);
        
        btg10= new ButtonGroup();
        btg10.add(rbtPre101);
        btg10.add(rbtPre102);
        btg10.add(rbtPre103);
        btg10.add(rbtPre104);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnCali){
            int sum=0;
            float cali;
            String nombre,preg1,preg2,preg3,preg4,preg5,preg6,preg7,preg8,preg9,preg10;
            nombre="";
            nombre=txtNombre.getText() .trim();
            if(nombre.isEmpty())mensaje("Casilla de nombre vacia");
            else {
                if(rbtPre11.isSelected()){preg1="Respuesta 1: Correcta";
                sum++;
                }
                else if(rbtPre12.isSelected())preg1="Respuesta 1: Incorrecta";
                else if(rbtPre13.isSelected())preg1="Respuesta 1: Incorrecta";
                else if(rbtPre14.isSelected())preg1="Respuesta 1: Incorrecta";
                else preg1="No marco respuesta";
                
                if(rbtPre21.isSelected())preg2="Respuesta 2: Incorrecta";
                else if(rbtPre22.isSelected()){preg2="Respuesta 2: Correcta";
                sum++;
                }
                else if(rbtPre23.isSelected())preg2="Respuesta 2: Incorrecta";
                else if(rbtPre24.isSelected())preg2="Respuesta 2: Incorrecta";
                else preg2="No marco respuesta";
                
                if(rbtPre31.isSelected())preg3="Respuesta 3: Incorrecta";
                else if(rbtPre32.isSelected())preg3="Respuesta 3: Incorrecta";
                else if(rbtPre33.isSelected())preg3="Respuesta 3: Incorrecta";
                else if(rbtPre34.isSelected()){preg3="Respuesta 3: Correcta";
                sum++;
                }
                else preg3="No marco respuesta";
                
                if(rbtPre41.isSelected())preg4="Respuesta 4: Incorrecta";
                else if(rbtPre42.isSelected())preg4="Respuesta 4: Incorrecta";
                else if(rbtPre43.isSelected()){preg4="Respuesta 4: Correcta";
                sum++;
                }
                else if(rbtPre44.isSelected())preg4="Respuesta 4: Incorrecta";
                else preg4="No marco respuesta";
                
                if(rbtPre51.isSelected())preg5="Respuesta 5: Incorrecta";
                else if(rbtPre52.isSelected())preg5="Respuesta 5: Incorrecta";
                else if(rbtPre53.isSelected())preg5="Respuesta 5: Incorrecta";
                else if(rbtPre54.isSelected()){preg5="Respuesta 5: Correcta";
                sum++;
                }
                else preg5="No marco respuesta";
                
                if(rbtPre61.isSelected())preg6="Respuesta 6: Incorrecta";
                else if(rbtPre62.isSelected())preg6="Respuesta 6: Incorrecta";
                else if(rbtPre63.isSelected())preg6="Respuesta 6: Incorrecta";
                else if(rbtPre64.isSelected()){preg6="Respuesta 6: Correcta";
                sum++;
                }
                else preg6="No marco respuesta";
                
                
                
                if(rbtPre71.isSelected()){preg7="Respuesta 7: Correcta";
                sum++;
                }
                else if(rbtPre72.isSelected())preg7="Respuesta 7: Incorrecta";
                else if(rbtPre73.isSelected())preg7="Respuesta 7: Incorrecta";
                else if(rbtPre74.isSelected())preg7="Respuesta 7: Incorrecta";
                else preg7="No marco respuesta";
                
                
                
                if(rbtPre81.isSelected())preg8="Respuesta 8: Incorrecta";
                else if(rbtPre82.isSelected())preg8="Respuesta 8: Incorrecta";
                else if(rbtPre83.isSelected()){preg8="Respuesta 8: Correcta";
                sum++;
                }
                else if(rbtPre84.isSelected())preg8="Respuesta 8: Incorrecta";
                else preg8="No marco respuesta";
                
                
                
                if(rbtPre91.isSelected())preg9="Respuesta 9: Incorrecta";
                else if(rbtPre92.isSelected()){preg9="Respuesta 9: Correcta";
                sum++;
                }
                else if(rbtPre93.isSelected())preg9="Respuesta 9: Incorrecta";
                else if(rbtPre94.isSelected())preg9="Respuesta 9: Incorrecta";
                else preg9="No marco respuesta";
                
                
                
                if(rbtPre101.isSelected())preg10="Respuesta 10: Incorrecta";
                else if(rbtPre102.isSelected()){preg10="Respuesta 10: Correcta";
                sum++;
                }
                else if(rbtPre103.isSelected())preg10="Respuesta 10: Incorrecta";
                else if(rbtPre104.isSelected())preg10="Respuesta 10: Incorrecta";
                else preg10="No marco respuesta";
                
                cali=(float)(sum*0.5);
                
                
                //mensaje de respuesta y borrado del formulario
                mensaje("Nombre: "+nombre.toUpperCase()+"\n"+preg1+"\n"+preg2+"\n"+preg3+"\n"+preg4+"\n"+preg5+"\n"+preg6+"\n"+preg7+"\n"+preg8+"\n"+preg9+"\n"+preg10+"\n"+"Calificacion: "+cali);
                txtNombre.setText("");
                btg1.clearSelection();
                btg2.clearSelection();
                btg3.clearSelection();
                btg4.clearSelection();
                btg5.clearSelection();
                btg6.clearSelection();
                btg7.clearSelection();
                btg8.clearSelection(); 
                btg9.clearSelection();
                btg10.clearSelection();
                txtNombre.requestFocus();
                }
    }
    }

      private void mensaje(String m) {
            JOptionPane.showMessageDialog(null, m);
}
}
