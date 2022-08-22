package interfaces;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoCrudPostgres implements CrudEmpleado {
    List<Empleado> empleados = new ArrayList<>();
    @Override
    public List<Empleado> getEmpleados() {
        return null;
    }

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public void delete(Empleado empleado) {

    }
}
