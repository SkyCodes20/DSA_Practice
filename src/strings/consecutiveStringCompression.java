package strings;

import java.util.Scanner;
                                                // INCOMPLETE CODE //
public class consecutiveStringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<s.length()-1; i++){
            if (s.charAt(i+1)==s.charAt(i)) {
                count++;
            } else {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(s.charAt(s.length()-1));
        sb.append(count);

        System.out.println(sb);

    }
}
