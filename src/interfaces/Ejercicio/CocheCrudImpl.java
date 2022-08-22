package interfaces.Ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CocheCrudImpl implements  CocheCrud {
    List<Coche> coches = new ArrayList<>();
    @Override
    public void save(Coche coche) {
        System.out.println("save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll");
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete");
    }
}
