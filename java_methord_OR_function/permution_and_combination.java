// import java.util.Scanner;

// public class permution_and_combination {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int r = sc.nextInt();

//         long nfact = 1; //bigger value of int is stroed in long
//         long rfact = 1;
//         long nrfact = 1;

//         for(int i = 1; i<=n; i++){ //this is a loop to pritn "n" factorial 
//             nfact *= i;
//         }
//         for(int i = 1; i<=r; i++){ //this is a loop to pritn "r" factorial 
//             rfact *= i;
//         }
//         for(int i = 1; i<=n-r; i++){ //this is a loop to pritn "n-r" factorial 
//             nrfact *= i;
//         }

//         long ncr = nfact / (rfact*nrfact);
//         System.out.println("nCr = " + ncr);


//         sc.close();
//     }
// }
// This is the long way without fucntion and this is oe of the best way 

 import java.util.Scanner;

public class permution_and_combination { 
    public static int fact(int x ){
        int facti = 1 
        ;
        for(int i = 1; i<= x ; i++){
            facti *= i;
        }
        return facti;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/fact(r)*fact(n-r);
        int npr = fact(n)/fact(n-r);
        
        System.out.println(ncr);
        System.out.println(npr);

        sc.close();
    }
}
