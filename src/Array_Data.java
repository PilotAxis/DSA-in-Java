import java.util.Scanner;

public class Array_Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of the array -> ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value to enter in array -> ");
            int value = input.nextInt();
            arr[i] = value;
        }
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
