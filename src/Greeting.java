import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name -> ");
        String s = input.nextLine();
        System.out.println(s + ", " + "Welcome on using the Java!");
    }
}
