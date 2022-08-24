package util;

import java.sql.*;

public class ConexionDB {
    //ATRIBUTOS
    private Connection conn;
    
    //CONSTRUCTOR
    public ConexionDB(){
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
            if(conn != null){
                System.out.println("Conexion Realizada!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //CONSULTOR
    public Connection getConexion(){
        return conn;
    }

    //METODOS
    public void cerrarConexion() throws SQLException{
        conn.close();
        System.out.println("Conexion cerrada!");
    }
    
}
