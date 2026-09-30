package Hashmaps;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        double a = sc.nextDouble();

        System.out.println("Enter a number: ");
        double b = sc.nextDouble();

        System.out.println("Press 1 to choose '+'. 2 for '-'. 3 for '*' and 4 for '/' ");
        double w = sc.nextDouble();
        System.out.print("Your answer is: ");
        if (w==1)
            System.out.println(a+b);
        else if (w==2)
            System.out.println(a-b);
        else if (w==3)
            System.out.println(a*b);
        else if (w==4)
            System.out.println(a/b);
        else if (w==5)
            System.out.print("root of "+a+" is: "+Math.sqrt(a)+"\nroot of "+b+" is: "+Math.sqrt(b));
        else
            System.out.println("Invalid Choice! pls choose between 1 to 4. Try again...");
    }
}