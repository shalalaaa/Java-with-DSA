import java.util.Scanner;//It follows two conditions:
                         // - Even index (0, 2, 4, 6...): Adds 10 to the element.
                         // - Odd index (1, 3, 5, 7...): Multiplies the element by 2.

public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        inputArray(arr, sc);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }

            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    // This function takes input for the array
    public static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

// NOTE :--->
        // sc is declared inside main(), so it can only be accessed directly
        // within main(). If we want to take input in another method,
        // we must pass the Scanner object as an argument or make it
        // accessible through a class-level variable.
