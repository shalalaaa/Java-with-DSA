import java.util.*;  

public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println(sum / n);

        sc.close();
    }
}
//
