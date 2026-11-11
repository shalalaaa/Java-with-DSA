
import java.util.*;

public class ArraysList_Reverse {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(21);
        arr.add(31);
        arr.add(41);
        arr.add(51);
        arr.add(61);
        arr.add(71);
        arr.add(81);
        arr.add(91);

        // Two pointer approach
        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {

            // Swapping elements
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }

        // Printing reversed ArrayList
        System.out.println(arr);
    }
}
