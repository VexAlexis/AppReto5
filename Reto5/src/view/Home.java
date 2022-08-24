package view;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.LineBorder;

import controller.informesController;
import util.ConexionDB;


public class Home extends JFrame{

    //ATRIBUTOS
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private ConexionDB conn;

    //CONSTRUCTOR
    public Home(informesController iController){        
        setTitle("INFORMES");
        setSize(800,740);
        setVisible(true);
        setResizable(true); 
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(135,230,255));
        setIconImage(Toolkit.getDefaultToolkit().getImage((getClass().getResource("/resources/planeta.png"))));
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        init();
    }

    //Metodo inicializador
    public void init(){
        panel();
        panel2();
        panel3();
        encabezado();
        titulo();
        botones();

    }
    //PANELES HOME
    public void panel(){
        panel = new JPanel();
        getContentPane().add(panel);        
        panel.setLayout(null); 
        panel.setBounds(10,10,765,264);
        panel.setBackground(new Color(53,162,200));
        
    }

    public void panel2(){
        panel2 = new JPanel();
        getContentPane().add(panel2);        
        panel2.setLayout(null); 
        panel2.setBounds(10,284,765,60);
        panel2.setBackground(new Color(53,162,200));
    }

    public void panel3(){
        panel3 = new JPanel();
        getContentPane().add(panel3);        
        panel3.setLayout(null); 
        panel3.setBounds(10,354,765,336);
        panel3.setBackground(new Color(53,162,200));
    }

    public void encabezado(){
        ImageIcon imagen = new ImageIcon(getClass().getResource("/resources/logo.png"));
        JLabel etiqueta1 = new JLabel();
        panel.add(etiqueta1);
        etiqueta1.setLayout(null);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(new Color(53,162,200));
        etiqueta1.setBounds(0, 0, 765,264);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        //etiqueta1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        etiqueta1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(600, 198, Image.SCALE_SMOOTH)));
    }

    public void titulo(){
        JLabel titulo = new JLabel("SOFTWARE PARA REVISIÓN DE INFORMES");
        panel2.add(titulo);
        titulo.setLayout(null);
        titulo.setBounds(0, 0, 765,60);
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setFont(new Font("Verdana", Font.BOLD, 24));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);        
    }

    //INICIALIAZADOR DE BOTONES
    public void botones(){
        btnInforme1();
        btnInforme2();
        btnInforme3();
        btnSalir();        
    }

    //BOTON PARA EL INFORME 1
    public void btnInforme1(){
        JButton btnInfo1 = new JButton("Informe No. 1");
        panel3.add(btnInfo1);
        btnInfo1.setBounds(39, 80, 200, 40);
        btnInfo1.setForeground(Color.white);
        btnInfo1.setBackground(new Color(135,200,240));
        btnInfo1.setFont(new Font("Verdana", Font.BOLD, 20));
        btnInfo1.setBorder(new LineBorder(Color.BLACK,0));

        //EVENTO PARA BOTONES
        MouseListener evento1 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {                
            }
            @Override
            public void mousePressed(MouseEvent e) {                
            }
            @Override
            public void mouseReleased(MouseEvent e) {                
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                btnInfo1.setForeground(Color.white);
                btnInfo1.setBackground(new Color(125,215,255)); 
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnInfo1.setForeground(Color.white);   
                btnInfo1.setBackground(new Color(135,200,240));
            }
        };
        btnInfo1.addMouseListener(evento1);


        //EVENTO PARA MOSTRAR VENTANA INFORME #1
        btnInfo1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Informe1();
            }
        });

    }

    //BOTON PARA EL INFORME 2
    public void btnInforme2(){

        JButton btnInfo2 = new JButton("Informe No. 2");
            panel3.add(btnInfo2);
            btnInfo2.setBounds(278, 80, 200, 40);
            btnInfo2.setForeground(Color.white);
            btnInfo2.setBackground(new Color(135,200,240));
            btnInfo2.setFont(new Font("Verdana", Font.BOLD, 20));
            btnInfo2.setBorder(new LineBorder(Color.BLACK,0));

        //EVENTO PARA BOTONES
        MouseListener evento1 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {                
            }
            @Override
            public void mousePressed(MouseEvent e) {                
            }
            @Override
            public void mouseReleased(MouseEvent e) {                
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                btnInfo2.setForeground(Color.white);
                btnInfo2.setBackground(new Color(125,215,255)); 
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnInfo2.setForeground(Color.white);   
                btnInfo2.setBackground(new Color(135,200,240));
            }
        };
        btnInfo2.addMouseListener(evento1);

        //EVENTO PARA MOSTRAR VENTANA INFORME #1
        btnInfo2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Informe2();
            }
        });

    }

    //BOTON PARA EL INFORME 3
    public void btnInforme3(){

        JButton btnInfo3 = new JButton("Informe No. 3");
        panel3.add(btnInfo3);
        btnInfo3.setBounds(517, 80, 200, 40);
        btnInfo3.setForeground(Color.white);
        btnInfo3.setBackground(new Color(135,200,240));
        btnInfo3.setFont(new Font("Verdana", Font.BOLD, 20));
        btnInfo3.setBorder(new LineBorder(Color.BLACK,0));

        //EVENTO PARA BOTONES
        MouseListener evento1 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {                
            }
            @Override
            public void mousePressed(MouseEvent e) {                
            }
            @Override
            public void mouseReleased(MouseEvent e) {                
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                btnInfo3.setForeground(Color.white);
                btnInfo3.setBackground(new Color(125,215,255)); 
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnInfo3.setForeground(Color.white);   
                btnInfo3.setBackground(new Color(135,200,240));
            }
        };
        btnInfo3.addMouseListener(evento1);

        //EVENTO PARA MOSTRAR VENTANA INFORME #1
        btnInfo3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Informe3();
            }
        });

    }

    //BOTON SALIR
    public void btnSalir(){

        JButton btnSalir = new JButton("Salir");
        panel3.add(btnSalir);
        btnSalir.setBounds(278, 216, 200, 40);
        btnSalir.setForeground(Color.white);
        btnSalir.setBackground(new Color(135,200,240));
        btnSalir.setFont(new Font("Verdana", Font.BOLD, 20));
        btnSalir.setBorder(new LineBorder(Color.BLACK,0));

        //EVENTO PARA BOTONES
        MouseListener evento1 = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {                
            }
            @Override
            public void mousePressed(MouseEvent e) {                
            }
            @Override
            public void mouseReleased(MouseEvent e) {                
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSalir.setForeground(Color.white);
                btnSalir.setBackground(new Color(125,215,255)); 
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnSalir.setForeground(Color.white);   
                btnSalir.setBackground(new Color(135,200,240));
            }
        };
        btnSalir.addMouseListener(evento1);

        //Evento BOTON SALIR
        btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // Se pide una confirmación antes de finalizar el programa
                int option = JOptionPane.showConfirmDialog(
                    null, "¿Estás seguro de que quieres cerrar la aplicación?","Confirmación de cierre", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {                    
                    try {
                        conn = new ConexionDB();
                        if(conn.getConexion() != null){
                            conn.cerrarConexion();
                        }
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                    System.exit(0);
                }
                
            }            
        });

    }




    
}
