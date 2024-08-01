import java.util.Scanner;

public class Sum_Digits {
    static int sum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number -> ");
        int num = input.nextInt();
        int result = sum(num);
        System.out.println("Sum of it's digits is -> " + result);
    }
}
