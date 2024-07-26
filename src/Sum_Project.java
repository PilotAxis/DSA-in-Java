import java.util.Scanner;

public class Sum_Project {
    static int function(int num) {
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            product = (product * rem);
            num /= 10;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number -> ");
        int number = input.nextInt();
        int result = function(number);
        System.out.println("The result of this is -> " + result);
    }
}