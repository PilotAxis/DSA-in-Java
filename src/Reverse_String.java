import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string below -> ");
        String name = input.next();
        String reversed = "";
        for (int i = (name.length() - 1); i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println("The reversed string is -> " + reversed);
    }
}
