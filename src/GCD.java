import java.util.Scanner;

public class GCD {
    static int hcf(int x, int y) {
        if (x == 0){
            return y;
        }
        if (y == 0) {
            return x;
        }
        if (x == y) {
            return x;
        }
        if (x > y) {
            return hcf(x - y, y);
        }
        return hcf(x, y-x);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = hcf(a, b);
        System.out.println("The GCD of two numbers is -> " + result);
    }
}
