import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers below ->");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is : " + c);

    }
}
