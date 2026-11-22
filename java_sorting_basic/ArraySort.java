
public class ArraySort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 6, 1, 9, 8, 10, 11, -3, 4};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {         

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        print(arr);
    }
}

//for (int j = 0; j < n - 1-i; j++)
// [This is even better than the inner loop that we're using rightnow becacuse this excluse the last sorted element that is
//  already the max element we've put at end after one pass ]
