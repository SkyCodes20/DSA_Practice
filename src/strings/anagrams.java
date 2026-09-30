package strings;

import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = sc.nextLine();
        System.out.println("Enter second string: ");
        String se = sc.nextLine();

        s = s.toLowerCase();
        se = se.toLowerCase();

        int [] freq = new int [26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char z : se.toCharArray()) {
            freq[z - 'a']--;
        }

        boolean isAnagram = true;
        for (int count : freq) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);
    }
}
