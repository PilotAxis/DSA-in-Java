import java.util.Scanner;

public class Armstrong {
    static boolean chkarm(int num) {
        int temp = num;
        int res = 0;
        while (temp < 0) {
            int digits = temp % 10;
            temp = temp / 10;
            res = res + (digits*digits*digits);
        }
        if (temp == num) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (chkarm(number)) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }
}
