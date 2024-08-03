import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        // BFA for string
//        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        char ch = 'a';
//        int count = 0;
//        for (int i = 0; i < (name.length() - 1); i++) {
//            char c = name.charAt(i);
//            if (c == ch) {
//                count += 1;
//            }
//        }
//        System.out.println(count);

        // Brute Force Approach (for an array)
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int number = input.nextInt();
//        int count = 0;
//        for (int j = 0; j < n; j++) {
//            if (arr[j] == number) {
//                count += 1;
//            }
//        }
//
//        System.out.println(count);

        // Optimized Approach (for an array)
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int[] hash = new int[13];
//        for (int i = 0; i < size; i++) {
//            hash[arr[i]] += 1;
//        }
//
//        int q;
//        q = input.nextInt();
//        while (q-- != 0) {
//            int number;
//            number = input.nextInt();
//            System.out.print(hash[number] + " ");
//        }
    }
}
