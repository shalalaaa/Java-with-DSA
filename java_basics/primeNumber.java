import java.util.*;
public class primeNumber {
public static void main(String[] args) {
    //Time Complexity is 0(n)--->this is not vey efficient 
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter any number :-");
    int n = sc.nextInt();
    int c = 0; //this would update as the factor of no. n increase. initialy it is 0.
    for (int i = 1; i<=n; i++){
        if (i%n==0){
            c++; //This is to count all the factor of number n
        }
    }
    if(c==2){
        System.out.println(n+" is a prime number");
    }else{
        System.out.println(n+" is a not prime number");
    }
    sc.close();
}
}
