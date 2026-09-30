package strings;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        s = s.toLowerCase();

        int [] freq = new int [26];

        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for (int i = 0; i<s.length(); i++){
            if (freq[s.charAt(i)-'a']>0){
                System.out.print(s.charAt(i));
                freq[s.charAt(i)-'a'] = 0;
            }
        }
    }
}
