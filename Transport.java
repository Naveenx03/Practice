class Vehicle
{
    String model;
    String type;
    Vehicle(String model,String type)
    {
        this.model=model;
        this.type=type;
    }
    void display()
    {
        System.out.println("Model of Vehicle : "+model);
        System.out.println("Type of Vehicle : "+type);
    }
}
class Car extends Vehicle
{
    int registryno;
    String color;
    Car(int registryno,String color,String model,String type)
    {
        super(model,type);
        this.registryno=registryno;
        this.color=color;
    }
    void display()
    {
        super.display();
        System.out.println("Register Number : "+registryno);
        System.out.println("Color of the Car : "+color);
    }
}
class Owner extends Car{
    String name;
    String blood;
    long phoneno;
    Owner(String name,String blood,long phoneno, int registryno,String color, String model,String type)
    {
        super(registryno,color,model,type);
        this.name=name;
        this.blood=blood;
        this.phoneno=phoneno;
    }
    void display()
    {
        super.display();
        System.out.println("Owner Name : "+name);
        System.out.println("Blood : "+blood);
        System.out.println("Mobile No : "+phoneno);
    }
}
public class Transport {
    public static void main(String args[])
    {
        Owner obj=new Owner("Rakkesh","O-",8438101623L,146,"Black","Ev","four wheeler");
        Owner tobj=new Owner("TamilSelvan","AB+",8825891262L,178,"Black","Petrol","four wheeler");
        obj.display();
        System.out.println();
        tobj.display();

    }
}