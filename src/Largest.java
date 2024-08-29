import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ans = Math.max(a, b);
        System.out.println("Largest number is -> " + ans);
    }
}
