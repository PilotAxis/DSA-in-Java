import java.util.Scanner;

public class Even_Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For the month of August.");
        int count = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                count += 1;
            }
        }
        System.out.println("Total number of even days -> " + count);
    }
}
