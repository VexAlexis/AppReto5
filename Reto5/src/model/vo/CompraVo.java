package model.vo;

public class CompraVo {
    //ATRIBUTOS
    private int ID_Compra;
    private int Cantidad;
    private String Proveedor;
    private String Pagado;
    private String Fecha;
    private int ID_Proyecto;
    private int ID_MaterialConstruccion;
    //CONSTRUCTOR
    public CompraVo(int iD_Compra, int cantidad, String proveedor, String pagado, String fecha, int iD_Proyecto,
            int iD_MaterialConstruccion) {
        ID_Compra = iD_Compra;
        Cantidad = cantidad;
        Proveedor = proveedor;
        Pagado = pagado;
        Fecha = fecha;
        ID_Proyecto = iD_Proyecto;
        ID_MaterialConstruccion = iD_MaterialConstruccion;
    }
    //CONSULTORES Y MODIFICADORES
    public int getID_Compra() {
        return ID_Compra;
    }
    public void setID_Compra(int iD_Compra) {
        ID_Compra = iD_Compra;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public String getProveedor() {
        return Proveedor;
    }
    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }
    public String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public int getID_MaterialConstruccion() {
        return ID_MaterialConstruccion;
    }
    public void setID_MaterialConstruccion(int iD_MaterialConstruccion) {
        ID_MaterialConstruccion = iD_MaterialConstruccion;
    }
    
    
}
