import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number -> ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " " + "x" + " " + i + " " + "=" + " " + number*i);
        }
    }
}
