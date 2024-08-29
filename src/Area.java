import java.util.Scanner;

public class Area {
    static int area(int x, int y) {
        int area;
        area = x * y;
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = area(a, b);
        System.out.println("Area of the circle -> " + result);
    }
}
