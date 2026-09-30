package oops.Interfaces;

interface Describable {
    void describe();
}
abstract class Animal{
    String name;
    Animal(String name) {
        this.name = name;
    }
        public abstract void sound();
    void sleep(){
        System.out.println(name + " is sleeping");
    }
}
class Dog extends Animal implements Describable{

    Dog(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("Woof!");
    }
    @Override
    public void describe(){
        System.out.println("i am a dog named "+name);
    }
}
class Cat extends Animal implements Describable{

    Cat(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println("Meow!");
    }
    @Override
    public void describe(){
        System.out.println("i am a cat named "+name);
    }
}
public class InterfaceAndAbstraction{
    public static void main(String args[]) {
        Animal a = new Dog("Tyson");
        Animal b = new Cat("Purry");
        Describable c = new Cat("Neo");
        Describable d = new Dog("Milky");
        Dog obj = new Dog("Lala");
        Cat obj1 = new Cat("Kala");
        a.sleep();
        a.sound();
        d.describe();
        b.sound();
        b.sleep();
        c.describe();
        obj.sleep();
        obj1.describe();

    }
}
