public class Coche {

    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad;



    public  Coche(){}

    //constructor
    public Coche (String color,String fabricante,String modelo ,Double peso, Double largo,Integer velocidad){
        this.color=color;
        this.fabricante=fabricante;
        this.modelo= modelo;
        this.peso= peso;
        this.largo= largo;
        this.velocidad=velocidad;
    }
    //comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad>0 && cantidad<=110){
            this.velocidad += cantidad;
        }
    }

}
