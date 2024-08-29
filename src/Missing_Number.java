public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 7, 5};
        int n = arr.length + 1;
        int org = 0;
        for (int j = 0; j < arr.length; j++) {
            org += arr[j];
        }
        int all = (n * (n + 1)) / 2;
        int result = all - org;
        System.out.println("Missing Number is -> " + result);
    }
}
