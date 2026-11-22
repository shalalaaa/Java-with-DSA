
import java.util.*;

public class primeNumber {

    public static void main(String[] args) {

        // Time Complexity is O(n) ---> This is not very efficient

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :- ");
        int n = sc.nextInt();

        int c = 0; 
        // This would update as the factors of number n increase
        // Initially, it is 0

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                c++; 
                // This is to count all the factors of number n

                System.out.println(i);
            }
        }

        System.out.println("No. of factors are :- " + c);

        if (c == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
