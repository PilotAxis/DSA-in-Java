import java.util.Scanner;

public class Find_Amount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int pos_odd = 0, nev = 0, pos_even = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                nev += 1;
            } else if (arr[i] % 2 == 0 || arr[i] == 0) {
                pos_even += 1;
            } else pos_odd += 1;
        }
        System.out.println(pos_odd);
        System.out.println(pos_even);
        System.out.println(nev);
    }
}
