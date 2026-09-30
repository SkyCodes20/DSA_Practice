package oops.Interfaces;

interface Greetable {
    void greet();
}
class formalPerson implements Greetable{
    @Override
    public void greet(){
        System.out.println("Hello Good Morning");
    }
}
class casualPerson implements  Greetable{
    @Override
    public void greet() {
        System.out.println("Hey whats upp?!");
    }
}
public class GreetableInterface{
    public static void main (String args[]){
        formalPerson fp = new formalPerson();
        casualPerson cp = new casualPerson();
        Greetable g = new formalPerson();
        g.greet();
        fp.greet();
        cp.greet();
    }
}