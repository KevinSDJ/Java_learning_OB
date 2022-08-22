package interfaces;

public class Main {
    public static void main (String[] args){
        CrudEmpleado empleadoCrud = new EmpleadoCrudCassandra(); // EmpleadoCrudMySql o EmpleadoCrudPostgres
        Empleado empleado1= new Empleado("Kevin","De jesus","developer",25);
        empleadoCrud.save(empleado1);
    }
}
