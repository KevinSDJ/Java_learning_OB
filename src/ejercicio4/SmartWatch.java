package ejercicio4;

public class SmartWatch extends SmartDevice{
    Boolean cardiacSensor;
    Boolean stepsCounter;
    Boolean waterproof;
    public SmartWatch(){}

    public SmartWatch(String so, String network, String processModel, double ram, Boolean cardiacSensor, Boolean stepsCounter, Boolean waterproof) {
        super(so, network, processModel, ram);
        this.cardiacSensor = cardiacSensor;
        this.stepsCounter = stepsCounter;
        this.waterproof = waterproof;
    }

    @Override
    public void setSizeDevice(double sizeDevice) {
        super.setSizeDevice(sizeDevice);
        if(sizeDevice>1.2 && sizeDevice<2.2){
            this.sizeDevice=sizeDevice;
        }else{
            System.out.println("size device is not valid");
        }
    }


    @Override
    public String toString() {
        return "SmartWatch{" +
                "cardiacSensor=" + cardiacSensor +
                ", stepsCounter=" + stepsCounter +
                ", waterproof=" + waterproof +
                ", sizeDevice=" + sizeDevice +
                ", so='" + so + '\'' +
                ", network='" + network + '\'' +
                ", ram=" + ram +
                ", processModel='" + processModel + '\'' +
                '}';
    }
}
