package oops.Interfaces;

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
interface Walkable{
    void walk();
}
abstract class Bird{
    String name;
    Bird(String name){
        this.name = name;
    }
    abstract void sound();
    void display(){
        System.out.println("I am "+name);
    }
}
class Eagle extends Bird implements Flyable,Walkable{

    Eagle(String name){
        super(name);
    }
    public void sound(){
        System.out.println("Sound of an Eagle!");
    }
    public void walk(){
        System.out.println("Eagle is walking");
    }
    public void fly(){
        System.out.println("Eagle is flying");
    }
}
class Duck extends Bird implements Flyable,Swimmable,Walkable{
    Duck(String name){
        super(name);
    }
    public void sound(){
        System.out.println("Quack Quack!!");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void walk(){
        System.out.println("Duck is walking");
    }
}
class Penguin extends Bird implements Walkable,Swimmable{
    Penguin(String name){
        super(name);
    }
    public void sound(){
        System.out.println("Sound of a Penguin!");
    }
    public void swim(){
        System.out.println("Penguin is swimming");
    }
    public void walk(){
        System.out.println("Penguin is walking");
    }
}
public class Question7{
    public static void main(String args[]) {
        Flyable f = new Eagle("Chi");
        f.fly();
        Swimmable s = new Duck("Sky");
        s.swim();
        Walkable w = new Penguin("Penta");
        w.walk();
        Bird b = new Duck("jethiya");
        b.display();
        b.sound();
    }
}