package modelo;
public class Usuario {
    private int idusuario;
    private String nombre;
    private String apelidos;
    private String dni;
    private String estado;

    public Usuario() {
    }

    public Usuario(int idusuario, String nombre, String apelidos, String dni, String estado) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.dni = dni;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
