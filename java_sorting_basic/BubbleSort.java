
public class BubbleSort {//This is oprtimised version of the above code adn this is not the best code this is better code .
    public static void main(String[] args) {

        int[] arr = {9, 4, 5, 3, 2, 6, 8, 7, 1};
        int n = arr.length;
                //METHORD 1:-(this is a better optimised code but its really big that doesn't mean it take a lot space )
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
            //METHOR 2:-(this use int variable that take nore space than bool variable in the above code)
                            
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
