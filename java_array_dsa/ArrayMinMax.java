
import java.util.*;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vinita = new int[n];

        // Take input
        for (int i = 0; i < vinita.length; i++) {
            vinita[i] = sc.nextInt();
        }

        // Maximum number in the array
        int max = vinita[0]; // Integer.MIN_VALUE can be used instead

        for (int i = 1; i < vinita.length; i++) {
            if (vinita[i] > max) {
                max = vinita[i];
            }
        }

        System.out.println("Maximum number: " + max);

        // Minimum number in the array
        int min = vinita[0];  //Integer.MAX_VALUE.  can take this instead tooo <3

        for (int i = 1; i < vinita.length; i++) {
            if (vinita[i] < min) {
                min = vinita[i];
            }
        }

        System.out.println("Minimum number: " + min);

        sc.close();
    }
}
