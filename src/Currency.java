import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars = 80;
        System.out.print("Enter the indian currency -> ");
        int rupees = input.nextInt();
        int result = dollars * rupees;
        System.out.println("Converted money is -> " + result);
    }
}
