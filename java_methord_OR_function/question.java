import java.util.Scanner;
public class question {
    public static int maximum(int a, int b, int c){
        //return Math.max(a, Math.max(b,c));//this is using buit in fuction
    if (a > b && a > c) {
        return a;
    } else if (b > a && b > c) {
        return b;
    } else {
        return c;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Biggest number between all of them is:-"+ maximum(a, b, c));
        sc.close();

    }
    
}
//we have to use built in function to mak eour work easy 
