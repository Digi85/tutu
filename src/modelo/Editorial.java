package modelo;
public class Editorial {
   private int ideditorial;
   private String nombre;
   private String codigo;
   private String direccion;
   private String url;
   private String estado;

    public Editorial() {
    }

    public Editorial(int ideditorial, String nombre, String codigo, String direccion, String url, String estado) {
        this.ideditorial = ideditorial;
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.url = url;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
   
   
}
