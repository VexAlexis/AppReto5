package model.vo;

public class ProyectosVo {
    //ATRIBUTOS
    private int ID_Proyecto;
    private String Fecha_inicio;
    private String Constructora;
    private int Numero_Bancos;
    private int Numero_Habitaciones;
    private String Banco_Vinculado;
    private float Porcentaje_cuota_Inicial;
    private String Ciudad;
    private String Clasificacion;
    private String Acabados;
    private String Serial;
    private int ID_Tipo;
    private int ID_Lider;
    //CONSTRUCTOR
    public ProyectosVo(int iD_Proyecto, String fecha_inicio, String constructora, int numero_Bancos,
            int numero_Habitaciones, String banco_Vinculado, float porcentaje_cuota_Inicial, String ciudad,
            String clasificacion, String acabados, String serial, int iD_Tipo, int iD_Lider) {
        ID_Proyecto = iD_Proyecto;
        Fecha_inicio = fecha_inicio;
        Constructora = constructora;
        Numero_Bancos = numero_Bancos;
        Numero_Habitaciones = numero_Habitaciones;
        Banco_Vinculado = banco_Vinculado;
        Porcentaje_cuota_Inicial = porcentaje_cuota_Inicial;
        Ciudad = ciudad;
        Clasificacion = clasificacion;
        Acabados = acabados;
        Serial = serial;
        ID_Tipo = iD_Tipo;
        ID_Lider = iD_Lider;
    }
    //CONSULTORES Y MODIFICADORES
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getFecha_inicio() {
        return Fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        Fecha_inicio = fecha_inicio;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
    public int getNumero_Bancos() {
        return Numero_Bancos;
    }
    public void setNumero_Bancos(int numero_Bancos) {
        Numero_Bancos = numero_Bancos;
    }
    public int getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }
    public void setNumero_Habitaciones(int numero_Habitaciones) {
        Numero_Habitaciones = numero_Habitaciones;
    }
    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }
    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }
    public float getPorcentaje_cuota_Inicial() {
        return Porcentaje_cuota_Inicial;
    }
    public void setPorcentaje_cuota_Inicial(float porcentaje_cuota_Inicial) {
        Porcentaje_cuota_Inicial = porcentaje_cuota_Inicial;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }
    public String getAcabados() {
        return Acabados;
    }
    public void setAcabados(String acabados) {
        Acabados = acabados;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public int getID_Tipo() {
        return ID_Tipo;
    }
    public void setID_Tipo(int iD_Tipo) {
        ID_Tipo = iD_Tipo;
    }
    public int getID_Lider() {
        return ID_Lider;
    }
    public void setID_Lider(int iD_Lider) {
        ID_Lider = iD_Lider;
    }
    
    
}
