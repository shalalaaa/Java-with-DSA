
import java.util.*;

public class Arrays_List {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);

        System.out.println(arr.get(2));//this is analogus of arr[2] which mean to get the element from certain index

        arr.set(3, 100);//this is analogus of arr[3] = 50 which mean to changet the elemetn of 3rd index to 50

        // First way: Direct printing
        System.out.println(arr);

        // Second way: Normal for loop
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // Third way: Enhanced for loop
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();
        arr.add(78);
        System.out.println(arr);  //[10, 20, 30, 100, 50, 60, 70, 80, 90, 78]
        arr.add(2, 120);
        System.out.println(arr);  //[10, 20, 120, 30, 100, 50, 60, 70, 80, 90, 78]

        arr.remove(3);
        System.out.println(arr);  //[10, 20, 120, 100, 50, 60, 70, 80, 90, 78]
    }
}
