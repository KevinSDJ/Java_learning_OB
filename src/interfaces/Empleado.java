package interfaces;

public class Empleado {
    String name;
    String lastName;
    String rol;
    int age;

    public Empleado(){}
    public Empleado(String name, String lastName,String rol, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.rol=rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rol='" + rol + '\'' +
                ", age=" + age +
                '}';
    }
}
