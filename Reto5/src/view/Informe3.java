package view;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.informesController;
import util.ConexionDB;

public class Informe3 extends JFrame{
    //ATRIBUTOS
    private JPanel panel;
    private JPanel panel2;
    private informesController iController;
    private ConexionDB conn;
    private DefaultTableModel modelo;
    private JTable tabla;


    //CONSTRUCTOR
    public Informe3(){
        setTitle("Informe No.3");
        setSize(1300,740);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(135,230,255));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }

    //INICIALIZAR ELEMENTOS
    public void init(){
        panel();
        panel2();
        encabezado();
        tabla();
        botones();

    }

    //PANEL #1
    public void panel(){
        panel = new JPanel();
        getContentPane().add(panel);        
        panel.setLayout(null); 
        panel.setBounds(10,10,1265,682);
        panel.setBackground(new Color(53,162,200));
    }

    //PANEL #2
    public void panel2(){
        panel2 = new JPanel();
        panel.add(panel2);       
        panel2.setLayout(null); 
        panel2.setBounds(190,140,885,422);
        panel2.setBackground(new Color(135,230,255));
    }

    //ENCABEZADO
    public void encabezado(){
        JLabel titulo = new JLabel("INFORME #3: COMPRAS REALIZADAS");
        panel.add(titulo);
        titulo.setLayout(null);
        titulo.setBounds(0, 30, 1265, 60);
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setFont(new Font("Verdana", Font.BOLD, 24));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        //titulo.setOpaque(true);
        //titulo.setBackground(Color.BLACK);

        JLabel raya = new JLabel();
        panel.add(raya);
        raya.setLayout(null);
        raya.setBounds(382, 90, 500, 2);
        raya.setOpaque(true);
        raya.setBackground(new Color(50,230,255));    

    }

    //Crear el modelo de la Tabla
    public void tabla(){
        Object columnas[] = new Object[]{"ID_Compra", "Constructora", "Banco_Vinculado"};
        TableModel model = new DefaultTableModel(new Object[][]{}, columnas );
        tabla = new JTable(model);
        modelo = (DefaultTableModel) tabla.getModel();
        JScrollPane scroll = new JScrollPane(tabla);
        data();
        scroll.setBounds(0,0,885,422);
        panel2.add(scroll,BorderLayout.CENTER);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

    }

    //Metodo para traer la data de la BD
    public void data(){      
        ResultSet rs = informesController.informe3();  
        try {  
            while(rs.next()){
                Integer idProyecto = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String bancoVin = rs.getString("Banco_Vinculado");
                modelo.addRow(new Object[] {idProyecto, constructora, bancoVin} );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //BOTONES
    public void botones(){
        btnInforme1();
        btnInforme2();
        btnInforme3();
        btnAtras();
        btnSalir();
        
    }

    public void btnInforme1(){
        JButton btnInfo1 = new JButton("Informe #1");
        panel.add(btnInfo1);
        btnInfo1.setBounds(40, 140, 150, 40);
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

    public void btnInforme2(){
        JButton btnInfo2 = new JButton("Informe #2");
        panel.add(btnInfo2);
        btnInfo2.setBounds(40, 180, 150, 40);
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

    public void btnInforme3(){
        JButton btnInfo3 = new JButton("Informe #3");
        panel.add(btnInfo3);
        btnInfo3.setBounds(40, 220, 150, 40);
        btnInfo3.setForeground(Color.white);
        btnInfo3.setBackground(new Color(50,230,255));
        btnInfo3.setFont(new Font("Verdana", Font.BOLD, 20));
        btnInfo3.setBorder(new LineBorder(Color.BLACK,0));

        //EVENTO PARA MOSTRAR VENTANA INFORME #3
        btnInfo3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Informe3();
            }
        });
    }

    //BOTON ATRAS
    public void btnAtras(){

        JButton btnAtras = new JButton("Atras");
        panel.add(btnAtras);
        btnAtras.setBounds(402, 602, 200, 40);
        btnAtras.setForeground(Color.WHITE);
        btnAtras.setBackground(new Color(135,200,240));
        btnAtras.setFont(new Font("Verdana", Font.BOLD, 18));
        btnAtras.setBorder(new LineBorder(Color.BLACK,0));

        //Evento BOTON ATRAS
        btnAtras.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
                new Home(iController);
            }            
        });

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
                btnAtras.setForeground(Color.white);
                btnAtras.setBackground(new Color(125,215,255)); 
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btnAtras.setForeground(Color.white);   
                btnAtras.setBackground(new Color(135,200,240));
            }
        };
        btnAtras.addMouseListener(evento1);

    }

    //BOTON SALIR
    public void btnSalir(){

        //BOTON SALIR
        JButton btnSalir = new JButton("Salir");
        panel.add(btnSalir);
        btnSalir.setBounds(662, 602, 200, 40);
        btnSalir.setForeground(Color.white);
        btnSalir.setBackground(new Color(135,200,240));
        btnSalir.setFont(new Font("Verdana", Font.BOLD, 20));
        btnSalir.setBorder(new LineBorder(Color.BLACK,0));


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
    }

}
