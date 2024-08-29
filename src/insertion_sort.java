public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 5, 4};
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
