             //Second maximum ekement in array 
public class QuestionFour {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,2};
        print(arr);
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        //to calculate max
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){max=arr[i];} 
        }
        //to calculate second max
        for(int i=0; i<=arr.length; i++){
            if(arr[i]>max && arr[i]!=max){
                second_max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(second_max);

    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

