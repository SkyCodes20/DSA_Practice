package oops.Interfaces;

interface Vehicle {
    void move();
}
interface ElectricVehicle extends Vehicle{
    void charge();
}
class Tesla implements ElectricVehicle{
    public void move(){
        System.out.println("Tesla is moving silently");
    }
    public void charge(){
        System.out.println("Tesla is charging at supercharger");
    }
}
public class InterfaceExtends{
    public static void main(String args[]) {
        Vehicle v = new Tesla();
        v.move();
        ElectricVehicle ev = new Tesla();
        ev.move();
        ev.charge();
        Tesla t = new Tesla();
        t.charge();
        t.move();
    }
}
