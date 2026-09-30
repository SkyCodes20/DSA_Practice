package strings;

public class palindrome {

    public static boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;
        boolean flag = true;
        while (i <= j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
    }
}