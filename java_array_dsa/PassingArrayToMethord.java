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
