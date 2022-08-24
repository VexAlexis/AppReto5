package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.LiderVo;
import util.ConexionDB;

public class LiderDao extends LiderVo{
    //CONSTRUCTOR
    public LiderDao(String Nombre) {
        super(Nombre);
    }

    public LiderDao(String iD_Lider, String nombre, String primer_Apellido, String segundo_Apellido, Float salario,
            String ciudad_residencia, String cargo, int clasificacion, String documento_identidad,
            String fecha_Nacimiento) {
        super(iD_Lider, nombre, primer_Apellido, segundo_Apellido, salario, ciudad_residencia, cargo, clasificacion,
                documento_identidad, fecha_Nacimiento);
    }      
    //CONSULTAS SQL
    public static ResultSet informeLider(ConexionDB conn){
        ResultSet rs = null;
        try {
            String query = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia";
            rs = conn.getConexion().createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
