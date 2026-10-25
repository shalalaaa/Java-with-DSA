import java.util.Arrays;   //THIS IS REALLY IMPORTANT

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        // int [] x = arr;    //x is shallow copy of arr.
        // x[0] = 100;
        // System.out.println(arr[0]);  // 100

        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 100;
        System.out.println(arr[0]);  // 10. (No change would happen in array )
        System.out.println(y[0]);   //100 
    }
}