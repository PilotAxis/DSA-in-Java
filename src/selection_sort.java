public class selection_sort {
    static void sorted_array(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array -> ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 3, 2, 7};
        sorted_array(arr);
    }
}
