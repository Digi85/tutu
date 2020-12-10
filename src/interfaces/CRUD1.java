package interfaces;
import java.util.List;
import modelo.Autor;
public interface CRUD1 {
    public List listarautor();
    public Autor buscarautor(int autor);
    public boolean agregareautor(Autor autor);
    public boolean editarautor(Autor autor);
    public boolean eliminarautor(int autor);   
}
