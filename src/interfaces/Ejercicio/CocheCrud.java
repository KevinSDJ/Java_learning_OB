package interfaces.Ejercicio;
import java.util.List;
public interface CocheCrud {
    void save(Coche coche);
    List<Coche> findAll();
    void delete(Coche coche);
}
