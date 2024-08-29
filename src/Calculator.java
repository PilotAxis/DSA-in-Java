import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    static float cal(float x, float y) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice (+, -, *, /) -> ");
        String choice = input.next();
        if (Objects.equals(choice, "+")) {
            float a = add(x, y);
            return a;
        }
        if (Objects.equals(choice, "-")) {
            float s = sub(x, y);
            return s;
        }
        if (Objects.equals(choice, "*")) {
            float m = mul(x, y);
            return m;
        }
        if (Objects.equals(choice, "/")) {
            float d = div(x, y);
            return d;
        }
        return 0;
    }

    static float add(float m, float n) {
        float r = m + n;
        return r;
    }
    static float sub(float m, float n) {
        float r = m - n;
        return r;
    }
    static float mul(float m, float n) {
        float r = m * n;
        return r;
    }
    static float div(float m, float n) {
        float r = m / n;
        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers below -> ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float result = cal(a, b);
        System.out.println("The result of the computed result is -> " + result);
    }
}
