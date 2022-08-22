package interfaces;
import java.util.List;
public interface CrudEmpleado {
    List<Empleado> getEmpleados();
    void save(Empleado empleado);
    void delete(Empleado empleado);
}
