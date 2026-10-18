import java.util.Scanner;
//take an array as input and then print all of them negative and in ascending order
public class QuestionOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vinita = new int[10];

        // Take input
        for (int i = 0; i < vinita.length; i++) {
            vinita[i] = sc.nextInt();
        }

        // Print negative of positive numbers
        for (int i = 0; i < vinita.length; i++) {
            if (vinita[i] > 0) {
                System.out.print(-vinita[i] + " ");
            } else {
                System.out.print(vinita[i] + " ");
            }
        }

        System.out.println();

        // Find maximum number in the array
        int max = vinita[0];

        for (int i = 1; i < vinita.length; i++) {
            if (vinita[i] > max) {
                max = vinita[i];
            }
        }

        System.out.println("Maximum number: " + max);

        sc.close();
    }
}