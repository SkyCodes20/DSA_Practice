package oops.Interfaces;

interface Rentable {
    double getRentPerDay();
}
interface Insurable1  {
    double getInsurancePerDay();
}
interface Trackable{
    String getLocation();
}
abstract class Vehicle1{
    String brand;
    String model;
    Vehicle1(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    abstract String getVehicleType();
    void display(){
        System.out.println("Brand: "+ brand +" Model: "+ model +" Vehicle Type: "+ getVehicleType());
    }
}
class Car extends Vehicle1 implements Rentable,Insurable1{
    Car(String brand, String model){
        super(brand,model);
    }
    public double getRentPerDay(){
        return 2000.0;
    }
    public double getInsurancePerDay(){
        return 500.0;
    }
    String getVehicleType(){
        return "Car";
    }
}
class Truck extends Vehicle1 implements Rentable,Insurable1{
    Truck(String brand, String model){
        super(brand,model);
    }
    public double getRentPerDay(){
        return 5000;
    }
    public double getInsurancePerDay(){
        return 1500;
    }
    String getVehicleType(){
        return "Truck";
    }
}
class Bike1 extends Vehicle1 implements Rentable,Trackable{
    Bike1(String brand, String model){
        super(brand, model);
    }
    public double getRentPerDay(){
        return 500;
    }
    public String getLocation(){
        return "GPS: 20.2961° N, 85.8245° E";
    }
    String getVehicleType(){
        return "Bike";
    }
}
public class Question10{
    public static void main(String[] args) {
        Rentable r = new Truck("Kawasaki","ninja 250");
        double x = r.getRentPerDay();
        double y = ((Insurable1)r).getInsurancePerDay();
        System.out.println("Total cost for 5 days is "+(x+y)*5);
        Insurable1 i = new Car("BMW","10 series");
        double p=i.getInsurancePerDay();
        double q = ((Rentable)i).getRentPerDay();
        System.out.println("Total cost for 5 days is "+(p+q)*5);
        Trackable t = new Bike1("AUDI","Ultra");
        System.out.println(t.getLocation());
        Vehicle1 v = new Truck("Tata","God");
        v.display();
        Vehicle1 v1 = new Bike1("b","c");
        v1.display();
        Vehicle1 v2 = new Car("lfh","ahk");
        v2.display();
    }
}
