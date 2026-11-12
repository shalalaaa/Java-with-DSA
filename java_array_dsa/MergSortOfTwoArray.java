
public class MergSortOfTwoArray {

    public static void main(String[] args) {

        int[] a = {2, 5, 6, 9, 10};
        int[] b = {1, 3, 4, 5, 7, 8};

        int[] c = new int[a.length + b.length];

        System.out.println("Before Merging:");
        for (int ele : c) {
            System.out.print(ele + " ");
        }

        System.out.println();

        merge(c, a, b);

        System.out.println("After Merging:");
        for (int ele : c) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {

        int i = 0, j = 0, k = 0;

        // Compare elements of both arrays
        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of array a
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of array b
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
