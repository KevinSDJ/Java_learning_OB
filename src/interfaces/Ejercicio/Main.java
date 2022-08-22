package interfaces.Ejercicio;

public class Main {
    public static void main(String[] args){
        CocheCrud cochecrud = new CocheCrudImpl();
        Coche mycoche = new Coche(4,"red","bmw");
        cochecrud.save(mycoche);
        cochecrud.delete(mycoche);
        cochecrud.findAll();
    }
}
