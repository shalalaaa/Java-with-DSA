import java.util.*;  //this is one of the conditional statement, that is use for more than two conditions.
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("equal");
        }else if (a>b){
            System.out.println("a is greater than b" );
        }else{
            System.out.println("b is greater than a" );
        }
        sc.close();
    }
}
