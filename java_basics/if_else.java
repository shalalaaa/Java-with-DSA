// this is conditonal statement that is used for only two conditions at a time.
import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
            
        // if(age<18){
        //      System.out.println("you're minor and not allowed to drive");
        // } else {
        //      System.out.println("you're allowed to drive. Yayyyy!!");
        //     }
        int a = sc.nextInt();
        int b = sc.nextInt();

        if( a==b ){
            System.out.println("equal");
        }else{
            if(a>b){
                System.out.println("a is greater than b");
            }else{
                System.out.println("b is greater than a");// we can use else if in here insed of nested if else.
            }
        }
  sc.close();  
}

}
