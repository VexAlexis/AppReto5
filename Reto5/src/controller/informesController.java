package controller;


import java.sql.ResultSet;

import model.dao.CompraDao;
import model.dao.LiderDao;
import model.dao.ProyectosDao;
import util.ConexionDB;

public class informesController {
    //ATRIBUTOS
    private static ConexionDB conn;
    
    //CONSTRUCTOR
    public informesController(ConexionDB conn){
        informesController.conn = conn;
    }

    //METODOS

    //informe 1
    public static ResultSet informe1(){
        return LiderDao.informeLider(conn);
    }

    //informe 2
    public static ResultSet informe2(){
        return ProyectosDao.informeProyecto(conn);
    }

    //informe 3
    public static ResultSet informe3(){
        return CompraDao.informeCompra(conn);
    }




}
