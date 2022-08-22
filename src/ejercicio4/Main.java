package ejercicio4;

public class Main {
    public static void main(String[] args){
        Smartphone samsungGalaxyj7 = new Smartphone("android","4G","?",3,12.7,2);
        SmartWatch applewatch = new SmartWatch("mac","watchOs","?",1.2,true,true,true);
        applewatch.setSizeDevice(1.4);
        samsungGalaxyj7.setSizeDevice(5.7);
        System.out.println("SmartWatch:\n"+applewatch+"\nSmartPhone:\n"+samsungGalaxyj7);
    }
}
