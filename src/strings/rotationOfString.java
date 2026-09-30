package strings;

import java.util.Scanner;

public class rotationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcde";

        String con = s + s;

        System.out.println("Enter a string: ");
        String rot = sc.nextLine();

        int length = rot.length();

        System.out.println("Length of the string is "+length);

        if (length == s.length()) {
            System.out.println("Valid Length!");
            System.out.println("Is the String a rotation of " + s + "?");
            System.out.println(con.contains(rot) ? "Yes" : "No");
        } else {
            System.out.println("Invalid Length! not a rotation");
        }
    }
}
