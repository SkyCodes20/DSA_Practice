package strings;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] reverse = s.split(" ");
        int count = 0;

        for (int i = reverse.length-1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }
    }
}
