abstract class Vehicle{
    private String vehicleNumber;
    private String vehicleType;
    static int vehicleCount = 0;
    Vehicle(String vehicleNumber, String vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        vehicleCount++;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    abstract void start();
    abstract void off();
}
class Car extends Vehicle{
    String brand;
    Car(String brand,String vehicleNumber, String vehicleType){
        super(vehicleNumber,vehicleType );
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    void start(){
        System.out.println("Engine on");
    }
    void off(){
        System.out.println("Engine off");
    }
    
}
class Owner extends Car{
    String ownerName;
    String ownerContact;
    Owner(String ownerName, String ownerContact,String brand,String vehiceNumber, String vehicleType){
        super(brand,vehiceNumber,vehicleType);
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;

    }
    void display(){
        System.out.println("Owner name: "+ownerName);
        System.out.println("Owner contact: "+ownerContact);
        System.out.println("Vehicle brand: "+getBrand());
        System.out.println("Vehicle number: "+getVehicleNumber());
        System.out.println("Vehicle type: "+getVehicleType());
    }
    
}

public class Oop1 {
    public static void main(String[] args){
        Owner rakkesh = new Owner("Rakkesh", "8678904532", "BMW", "TN325370","Petrol");
        Owner naveen = new Owner("Naveen", "7678904532", "Porsche", "TN32AM0001","Diesel");
        rakkesh.display();
        naveen.display();
        System.out.println("Vehicle count: "+Owner.vehicleCount);
        rakkesh.start();
        rakkesh.off();
    }
}