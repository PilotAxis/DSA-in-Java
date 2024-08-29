import java.util.Scanner;

public class LCM {
    static int calculate(int x, int y) {
        int ans = Math.max(x, y);
        while (true) {
            if ((ans % x == 0) && (ans % y == 0)) {
                break;
            }
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int result = calculate(a, b);
        System.out.println("The LCM of 2 numbers is -> " + result);
    }
}
