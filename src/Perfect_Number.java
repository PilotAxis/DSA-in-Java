import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number -> ");
        int number = input.nextInt();
        int divisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisors += i;
            }
        }
        if (divisors == number) {
            System.out.println("Perfect Number!");
        } else {
            System.out.println("Not a Perfect Number!");
        }
    }
}
