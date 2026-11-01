import java.util.*;

public class LinearSearch {

    public static void ArrayInput(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        ArrayInput(arr, sc);

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean flag = false;// This mean target is initally not inside the array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Target is in array");
        } else {
            System.out.println("Target is not in array");
        }

        sc.close();
    }
}