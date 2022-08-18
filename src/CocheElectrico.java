
public class CocheElectrico extends Coche {
    String motorelectrico;
    public CocheElectrico(){
        super();
    }
    public  CocheElectrico(String motorelectrico,String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad) {
        super(color, fabricante, modelo, peso, largo, velocidad);
        this.motorelectrico=motorelectrico;
    }


    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorelectrico='" + motorelectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
