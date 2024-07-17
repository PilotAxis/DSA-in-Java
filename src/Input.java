import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        System.out.println("Enter a parameter :");
//        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextLine());
        Scanner input = new Scanner(System.in);
        System.out.print("Please a enter a number : ");
        int number = input.nextInt();
        System.out.println("You entered " + number);
    }
}
