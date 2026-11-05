public class ForEachLoop { //use to traverse data structure and can not modify element of like for loop does
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        for(int ele : arr){
            System.out.print(ele+" ");
        }


        System.out.println();//this would not work because for each loop only help in treversing not modifying..
        for(int ele : arr){
            ele *= 2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
//automatically step through every single element in an array or collection from start to finish