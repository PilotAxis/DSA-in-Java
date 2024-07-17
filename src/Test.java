import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        char c;
        do {
            System.out.println("Enter a number -> ");
            number = input.nextInt();
            System.out.println("Press x to stop or any other to continue -> ");
            sum = sum + number;
            c = input.next().trim().charAt(0);
        }
        while (c != 'x');
        System.out.println("The sum of all numbers is -> " + sum);
    }
}