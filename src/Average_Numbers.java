import java.util.Scanner;

public class Average_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N numbers below (to cancel input x) ->");
        char ch;
        int sum = 0, count = 0;
        do {
            System.out.println("Enter the number ->");
            int number = input.nextInt();
            sum += number;
            count++;
            ch = input.next().trim().charAt(0);
        }
        while (ch != 'x');
        int average = (sum / count);
        System.out.println("The average of " + count + " " + "numbers is -> " + average);
    }
}
