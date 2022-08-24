package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.ProyectosVo;
import util.ConexionDB;

public class ProyectosDao extends ProyectosVo{

    //CONSTRUCTOR
    public ProyectosDao(int iD_Proyecto, String fecha_inicio, String constructora, int numero_Bancos,
            int numero_Habitaciones, String banco_Vinculado, float porcentaje_cuota_Inicial, String ciudad,
            String clasificacion, String acabados, String serial, int iD_Tipo, int iD_Lider) {
        super(iD_Proyecto, fecha_inicio, constructora, numero_Bancos, numero_Habitaciones, banco_Vinculado,
                porcentaje_cuota_Inicial, ciudad, clasificacion, acabados, serial, iD_Tipo, iD_Lider);
    }

    //CONSULTAS SQL
    public static ResultSet informeProyecto(ConexionDB conn){
        ResultSet rs = null;
        try {
            String query = "SELECT ID_Proyecto, Constructora, Numero_habitaciones, Ciudad, Clasificacion FROM Proyecto WHERE Clasificacion = 'Casa Campestre' AND (Ciudad = 'Santa Marta' OR Ciudad = 'Cartagena' OR Ciudad = 'Barranquilla') ";
            rs = conn.getConexion().createStatement().executeQuery(query);            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    
}
