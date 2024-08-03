import java.util.Scanner;

public class Frequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr ={10,5,10,15,10,5};
        int temp = arr.length;
        int count = 0;
        int var_count = 1;
        while (temp != 0) {
            for (int j = 0; j < (arr.length) - 1; j++) {
                if (arr[count] == arr[j]) {
                    var_count += 1;
                }
            }
            count += 1;
            temp--;
            System.out.println(arr[count] + " " + var_count);
        }
    }
}
