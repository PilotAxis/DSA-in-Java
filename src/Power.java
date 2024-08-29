import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int number = input.nextInt();
        int power = (int) Math.pow(number, 2);
        System.out.println("Power of number -> " + power);
    }
}
