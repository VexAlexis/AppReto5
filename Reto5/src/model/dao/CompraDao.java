package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.CompraVo;
import util.ConexionDB;

public class CompraDao extends CompraVo{
    //CONSTRUCTOR
    public CompraDao(int iD_Compra, int cantidad, String proveedor, String pagado, String fecha, int iD_Proyecto,
            int iD_MaterialConstruccion) {
        super(iD_Compra, cantidad, proveedor, pagado, fecha, iD_Proyecto, iD_MaterialConstruccion);
    }
    
    //CONSULTAS SQL
    public static ResultSet informeCompra(ConexionDB conn){
        ResultSet rs = null;
        try {
            String query = "SELECT ID_Compra, Constructora, Banco_Vinculado, Ciudad, Proveedor, Banco_Vinculado FROM Compra c INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto WHERE Proveedor = 'Homecenter' AND Ciudad = 'Salento' ";
            rs = conn.getConexion().createStatement().executeQuery(query);            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
