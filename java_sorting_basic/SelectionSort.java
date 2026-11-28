
public class SelectionSort {

    public static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 1, 5, 9, 10, -2, -9};

        selectionSort(arr);
        print(arr, arr.length);
    }
}
