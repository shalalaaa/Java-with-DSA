//TWO SUM
// We've to find sum of two element in array whoch is same as target
public class array_leetcode{
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        int target = 2;
        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+arr[j]== target){
                    System.out.println(arr[i] +" "+arr[j]); //(arr[] {i, j};)
                }
            }
        }
    }
}
//bad code abd bdly optimise
