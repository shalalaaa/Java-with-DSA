
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {9, 4, 5, 3, 2, 6, 8, 7, 1};
        int n = arr.length;
                                //METHORD 1:-
        for (int i = 0; i < n - 1; i++) {

            boolean isSorted = true;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted == true) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
                                //METHOR 2:-
                            
// for(int i= 0; i<n-1; i++){
//     int swap =0;
//     for (int j = 0; j < n - 1 - i; j++) {
//         if(arr[j]> arr[j+1]){
//           int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swaps++;
//         }
//     }  
//     if(swaps==0) breaks ;                          
// }
// print(arr);//this is a fucntion to print the array suppose it 