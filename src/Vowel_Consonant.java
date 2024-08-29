import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string -> ");
        String word = input.nextLine();
        word = word.toLowerCase();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels ++;
            } else consonants++;
        }
        System.out.println("Number of vowels -> " + vowels);
        System.out.println("Number of consonants -> " + consonants);
    }
}
