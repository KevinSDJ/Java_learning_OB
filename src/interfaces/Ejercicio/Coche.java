package interfaces.Ejercicio;

public class Coche {
    int puertas;
    String color;
    String modelo;
    public Coche(){}

    public Coche(int puertas, String color, String modelo) {
        this.puertas = puertas;
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
                "puertas=" + puertas +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
