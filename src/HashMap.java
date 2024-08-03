import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int[] hash = new int[256]; // int[26]
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++; // for the lowercase -> hash[s.charAt(i) - 'a'
        }
        int q = input.nextInt();
        while (q-- != 0) {
            char c = input.next().charAt(0);
            System.out.println("Count -> " + hash[c]); // hash[c] - 'a'
        }
    }
}
