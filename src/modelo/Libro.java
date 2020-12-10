package modelo;
public class Libro {
    private int idlibro;
    private String titulo;
    private String isbn;
    private String paginas;
    private String anio;
    private int stock;
    private int stock_disponible;
    private int idautor;
    private int idpais;
    private int ideditorial;

    public Libro() {
    }

    public Libro(int idlibro, String titulo, String isbn, String paginas, String anio, int stock, int stock_disponible, int idautor, int idpais, int ideditorial) {
        this.idlibro = idlibro;
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.anio = anio;
        this.stock = stock;
        this.stock_disponible = stock_disponible;
        this.idautor = idautor;
        this.idpais = idpais;
        this.ideditorial = ideditorial;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_disponible() {
        return stock_disponible;
    }

    public void setStock_disponible(int stock_disponible) {
        this.stock_disponible = stock_disponible;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }
    
}
