package controller;

import util.ConexionDB;
import view.*;

public class MainController {

    public MainController(){

        //Crear Objetos
        ConexionDB conn = new ConexionDB();
        informesController iController = new informesController(conn);
        new Home(iController);
    }   
    
}
