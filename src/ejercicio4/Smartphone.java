package ejercicio4;

public class Smartphone extends SmartDevice{
    double cameraPixel;
    int cameraQuantity;
    public Smartphone(){}

    public Smartphone(String so, String network, String processModel, double ram, double cameraPixel, int cameraQuantity) {
        super(so, network, processModel, ram);
        this.cameraPixel = cameraPixel;
        this.cameraQuantity = cameraQuantity;
    }

    @Override
    public void setSizeDevice(double sizeDevice) {
        super.setSizeDevice(sizeDevice);
        if(sizeDevice>2.5 && sizeDevice<6.8){
            this.sizeDevice=sizeDevice;
        }else{
            System.out.println("This size device is not valid");
        }
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "cameraPixel=" + cameraPixel +
                ", cameraQuantity=" + cameraQuantity +
                ", sizeDevice=" + sizeDevice +
                ", so='" + so + '\'' +
                ", network='" + network + '\'' +
                ", ram=" + ram +
                ", processModel='" + processModel + '\'' +
                '}';
    }
}
