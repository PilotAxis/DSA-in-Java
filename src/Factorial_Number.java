import java.util.Scanner;

public class Factorial_Number {
    static int check_factorial(int num) {
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ->");
        int number = input.nextInt();
        int result = check_factorial(number);
        System.out.println("Factorial of the number is -> " + result);
    }
}
