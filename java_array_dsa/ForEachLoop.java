
public class ForEachLoop {

    // For-each loop is used to traverse an array.
    // It cannot modify primitive array elements through the loop variable.

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        // Traversing the array using for-each loop
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        // Trying to modify elements (this will not modify the original array)
        // for (int ele : arr) {
        //     ele *= 2;
        // }

        // Printing the original array again
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

// For-each automatically steps through every element
// in an array or collection from start to finish.
