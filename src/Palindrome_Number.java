import java.util.Scanner;

public class Palindrome_Number {
    static int check_palindrome(int number) {
        int temp = number;
        int rev = 0;
        while (number > 0)
        {
            int digit = number % 10;
            number = number / 10;
            rev = rev * 10 + digit;
        }
        if (temp == rev) {
            return 1;
        } else return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int original = input.nextInt();
        int result = check_palindrome(original);
        if (result == 1) {
            System.out.println("The number is palindrome!");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
