import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int x = input.nextInt();
        int first = 0;
        int second = 1;
        if (x < 0) {
            System.out.println("Enter a valid number");
        }
        else if (x == 0) {
            System.out.println(first);
        }
        else {
            for (int i = 2; i < x; i++) {
                int c = first + second;
                first = second;
                second = c;
            }
            System.out.println(second);
        }
    }
}
