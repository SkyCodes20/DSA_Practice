package oops.Interfaces;

interface Calculable {
    int add (int a, int b);
    int multiply (int a , int b);
}
class BasicCalculator implements Calculable{
    public int add(int a, int b){
        return a+b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class CalculableInterface{
    public static void main (String args[]){
        Calculable c = new BasicCalculator();
        System.out.println(c.add(5,6));
        System.out.println(c.multiply(5,6));
    }

}