public class PassingArrayToMethord {
 public static void main(String[] args) {
    int[] x= {30,48,77,65,86};
    System.out.println(x[3]);
    change(x);
    System.out.println(x[3]);
 } 
 public static void change(int[] x){ //in this function int[] x is refrence variable .
    x[3] = 99;
 }  
}

// public class PassingArrayToMethord {
//     public static void main(String[] args) {
//         int[] x = {30, 48, 77, 65, 86};
//         System.out.println(x[3]);

//         change(x);       ● change(x) is a method call.
//                          ● int[] y is the parameter that receives the argument passed to the method.

//         System.out.println(x[3]);
//     }

//     public static void change(int[] y) {
//         y[3] = 99;
//     }
// }