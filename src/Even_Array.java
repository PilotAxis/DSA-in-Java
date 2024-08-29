// import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[] arr = {3, 4, 5, 8, 2, 1};
        int count = 0;
        for (int k : arr) {
            if (k % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
