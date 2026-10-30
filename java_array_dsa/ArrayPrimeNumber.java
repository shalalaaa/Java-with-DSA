
public class ArrayPrimeNumber {
    
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");
        
        // Loop through numbers from 2 to 100 (1 is not a prime number)
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        // Check for factors up to the square root of the number for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, so it is not prime
            }
        }
        return true; // No factors found, it is prime
    }
}


