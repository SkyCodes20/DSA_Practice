package strings;

import java.util.Scanner;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        int [] freq = new int [26];

        s = s.toLowerCase();

        for (char c: s.toCharArray()){
            freq[c-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)-'a'] == 1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
