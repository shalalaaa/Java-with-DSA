import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;//adding anything to return 0 give same value.
        int product = 1;//multiplying anything to 1 give same value.

        for(int i = 0; i<n; i++){
            arr [i] = sc.nextInt();
        }

            //To add all of the input together by traversing them one by one.
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all the element of array is:-"+ sum);

            //To multiply all of the input together by traversing them one by one.
        for(int i = 0; i<n; i++){
            product *= arr[i];
        }
        System.out.println("Product of all the element of array is:-"+ product);
        sc.close();
    }
}