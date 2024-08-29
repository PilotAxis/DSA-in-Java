import java.util.Scanner;

public class Palindrome {
    static boolean chkpalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (chkpalindrome(str)) {
            System.out.println(str + " is palindrome!");
        } else {
            System.out.println(str + " is not palindrome!");
        }
    }
}
