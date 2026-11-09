import java.util.*; // if you want to reverse certain part of array example :- index 2 to 5 in this case
                    // this id by using two pointer methord
public class QuestionFive {
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
        
        int i = 2, j = 5;

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
