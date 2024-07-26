import java.util.Scanner;

public class Reverse {
    static int function(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            rev = rev*10 + digit;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number -> ");
        int number = input.nextInt();
        int result = function(number);
        System.out.println("The reversed number is -> " + result);
    }
}
