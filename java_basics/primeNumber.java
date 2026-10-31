import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int c = 0; // Counts the factors of n

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++; // Increment when i is a factor of n
            }
        }

        if (n >= 2 && c == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}