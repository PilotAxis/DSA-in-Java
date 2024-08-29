import java.util.Scanner;

public class Series {
    static void fibonacci(int x) {
        int first = 0;
        int second = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(first + " ");
            int num = first + second;
            first = second;
            second = num;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        fibonacci(N);
    }
}
