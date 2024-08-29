import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount -> ");
        double p = input.nextDouble();
        System.out.print("Enter the rate -> ");
        float r = input.nextFloat();
        System.out.print("Enter the time -> ");
        int t = input.nextInt();
        double si = (p*r*t)/100;
        System.out.println("The simple interest calculated is -> " + si);
    }
}
