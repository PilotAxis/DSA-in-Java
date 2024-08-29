public class TypeCasting {
    public static void main(String[] args) {
        int i = 6000;
        float f = 5.67f;
        char c = 'a';
        byte b = 40;
        short s = 4;
        double d = 73947974929.34233;
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        double result = (f * b) + (i / c) + (d - s);
        System.out.println(result);
    }
}
