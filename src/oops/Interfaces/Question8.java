package oops.Interfaces;

interface Taxable{
    double getTax();
}
interface Insurable{
    double getInsurance();
}
abstract class BankAccount{
    String holderName;
    double balance;
    BankAccount(String holderName, double balance){
        this.holderName = holderName;
        this.balance = balance;
    }
    abstract String getAccountType();
    void display(){
        System.out.println("\nAccount holder name: "+holderName + "\n" + "Account Balance: " + balance + "\n" + "Account Type: " +getAccountType());
    }
}
class SavingsAccount extends BankAccount implements Taxable, Insurable {
    SavingsAccount(String holderName,double balance){
        super(holderName,balance);
    }
    public String getAccountType(){
        return "Savings";
    }
    public double getTax(){
        return 2.5*balance*0.01;
    }
    public double getInsurance(){
        return 1*0.01*balance;
    }
}
class CurrentAccount extends BankAccount implements Taxable{
    CurrentAccount(String holderName, double balance){
        super(holderName,balance);
    }
    public String getAccountType(){
        return "Current";
    }
    public double getTax(){
        return 5*0.01*balance;
    }
}
public class Question8{
    public static void main(String args[]) {
        Taxable t = new CurrentAccount("Sarthak",200);
        System.out.println("Tax: "+t.getTax());
        Insurable i = new SavingsAccount("Sarthak",500);
        System.out.println("Insurance: "+i.getInsurance());
        BankAccount b = new CurrentAccount("Sky",5000);
        b.display();
        SavingsAccount s = new SavingsAccount("Sarthak",200);
        s.display();
        System.out.println("Tax: "+ s.getTax());
        System.out.println("Final balance: "+(s.balance-s.getTax()));
        CurrentAccount c = new CurrentAccount("Aryan",5000);
        c.display();
        System.out.println("Tax: "+c.getTax());
        System.out.println("Final balance: "+(c.balance-c.getTax()));
    }
}