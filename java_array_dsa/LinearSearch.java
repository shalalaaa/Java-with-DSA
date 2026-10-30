import java.util.*;
public class LinearSearch {
    public static void ArrayInput(int[] arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int target = sc.nextInt();
     int[] arr = new int[n];
    
     ArrayInput(arr);

    }
}
