public class Resize_Array {
    static int[] resize(int[] arr, int hold) {
        int[] temp = new int[hold];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
//        arr = temp;
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
        // Manual Array Copy!
        // System.arraycopy(arr, 0, temp, 0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int capacity = 8;
        int[] result = resize(arr, capacity);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
