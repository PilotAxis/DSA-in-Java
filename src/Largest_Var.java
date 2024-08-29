import java.util.Scanner;

public class Largest_Var {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int number;
        System.out.println("Enter 0 to stop or continue -> ");
        while (true) {
            number = input.nextInt();
            if (number == 0) {
                break;
            } else {
                if (number > largest) {
                    largest = number;
                }
            }
        }
        if (largest == Integer.MIN_VALUE) {
            System.out.println("No numbers were inputted.");
        } else {
            System.out.println("Largest numbers among them is -> " + largest);
        }
    }
}
