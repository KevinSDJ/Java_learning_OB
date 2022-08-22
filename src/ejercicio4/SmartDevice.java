package ejercicio4;

public class SmartDevice {
    double sizeDevice;
    String so;
    String network;
    double ram;
    String processModel;
    public SmartDevice(){}
    public SmartDevice(String so,String network,String processModel,double ram){
        this.processModel=processModel;
        this.ram=ram;
        this.network=network;
        this.so=so;
    }

    public void setSizeDevice(double sizeDevice) {
        this.sizeDevice = sizeDevice;
    }
    public static void onTouch(){
        System.out.println("Touch");
    }
}
