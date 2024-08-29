public class Minimum_in_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6};
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input!");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
