
import java.util.Scanner;   //Two pointer technique

public class ArrayReverse {

    // Function to take input
    public static void printInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Function to print array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of array elements you want:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array:");
        printInput(arr, sc);
        
        // Reverse the array using two pointers
        int m = arr.length;
        int i = 0, j = m - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reversed array:");
        print(arr);

        sc.close();
    }
}
