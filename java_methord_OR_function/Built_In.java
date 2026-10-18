import java.util.Scanner;

public class Built_In {
    public static void main(String[] args) {
        //they all are built in maths methord or function in java 
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(81));
        System.out.println(Math.floor(4.8));// this is use ot write the round down of a number 
        System.out.println(Math.ceil(6.7));// thisis use to write round up of the number
        System.out.println(Math.min(4,4.01));
        System.out.println(Math.max(8.9,9));
        System.out.println(Math.pow(5,2));// this is the log Math.pow(base, exponent)

//     }
// }
// import java.util.Scanner;

// public class Built_In {
//     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Any three number:-"); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println("biggest no. between all of them is :-" + Math.max(Math.max(a, b), Math.max(c, d)));
        sc.close();
    }
}
