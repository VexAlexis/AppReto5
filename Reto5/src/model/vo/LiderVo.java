package model.vo;

public class LiderVo {
    //ATRIBUTOS
    private String ID_Lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private Float Salario;
    private String Ciudad_residencia;
    private String Cargo;
    private int Clasificacion;
    private String Documento_identidad;
    private String Fecha_Nacimiento;
    //CONSTRUCTOR
    public LiderVo(String Nombre){
        this.Nombre = Nombre;
    }

    public LiderVo(String iD_Lider, String nombre, String primer_Apellido, String segundo_Apellido, Float salario,
            String ciudad_residencia, String cargo, int clasificacion, String documento_identidad,
            String fecha_Nacimiento) {
        ID_Lider = iD_Lider;
        Nombre = nombre;
        Primer_Apellido = primer_Apellido;
        Segundo_Apellido = segundo_Apellido;
        Salario = salario;
        Ciudad_residencia = ciudad_residencia;
        Cargo = cargo;
        Clasificacion = clasificacion;
        Documento_identidad = documento_identidad;
        Fecha_Nacimiento = fecha_Nacimiento;
    }
    //CONSULTORES Y MODIFICADORES
    public String getID_Lider() {
        return ID_Lider;
    }
    public void setID_Lider(String iD_Lider) {
        ID_Lider = iD_Lider;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }
    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido) {
        Segundo_Apellido = segundo_Apellido;
    }
    public Float getSalario() {
        return Salario;
    }
    public void setSalario(Float salario) {
        Salario = salario;
    }
    public String getCiudad_residencia() {
        return Ciudad_residencia;
    }
    public void setCiudad_residencia(String ciudad_residencia) {
        Ciudad_residencia = ciudad_residencia;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public int getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(int clasificacion) {
        Clasificacion = clasificacion;
    }
    public String getDocumento_identidad() {
        return Documento_identidad;
    }
    public void setDocumento_identidad(String documento_identidad) {
        Documento_identidad = documento_identidad;
    }
    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }
    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }
    


    
}
