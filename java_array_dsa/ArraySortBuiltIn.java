import java.util.*;
public class ArraySortBuiltIn {
    public static void main(String[] args) {
     // sort - ascending order
    int[] arr = {4,5,3,8,7,9,10,57,48,38};
    print(arr);
    Arrays.sort(arr);
    print(arr);
   }
   public static void print(int[] arr){     //We have made this methord because we c
    for(int i= 0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
   }
    
}
