package oops.Interfaces;

interface Discountable {
    double getDiscount();
}
abstract class Product{
    String name;
    double price;
    Product (String name,double price){
        this.name = name;
        this.price = price;
    }
    public abstract String getCategory();

    void display(){
        System.out.println("Name: "+name+"\n" + "Price: "+price+ "\n" + "Category: "+getCategory());
        System.out.println();
    }
}
class ElectronicsProduct extends Product implements Discountable{
    String name;
    ElectronicsProduct(String name, double price) {
        super(name, price);
    }
    public double getDiscount(){
        return 10.0;
    }
    public String getCategory(){
        return "Electronics";
    }
}
class FoodProduct extends Product implements Discountable{
    FoodProduct(String name, double price){
        super(name,price);
    }
    public double getDiscount(){
        return 2.5;
    }
    public String getCategory(){
        return "Food";
    }
}
public class DiscountableTest{
    public static void main(String args[]) {
        Product p = new ElectronicsProduct("Airpods",10000);
        Product p1 = new FoodProduct("Chole kulche",150);
        Discountable d = new ElectronicsProduct("Macbook",100000);
        Discountable d1 = new FoodProduct("Dosa",50);
        FoodProduct f = new FoodProduct("Idli",27.5);
        p.display();
        p1.display();
        System.out.println("Discount on Electronics "+((Discountable) p).getDiscount());
        System.out.println("Discount on Food "+((Discountable)p1).getDiscount());
        ElectronicsProduct e = new ElectronicsProduct("Iphone 18 pro max",100010);
        System.out.println("Price of "+f.name+" after discount "+(f.price-f.getDiscount()));
        System.out.println("Price of "+e.name+" after discount "+(e.price-e.getDiscount()));
    }
}