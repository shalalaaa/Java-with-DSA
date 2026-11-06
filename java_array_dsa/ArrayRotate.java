
import java.util.*;

public class ArrayRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();

        int[] arr = {8, 9, 10, 4, 5, 3, 7, 6};
        int n = arr.length;

        // Handle cases where d is greater than n
        d = d % n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
