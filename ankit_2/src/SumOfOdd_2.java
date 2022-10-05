import java.util.*;
public class SumOfOdd_2{
    public static int oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                continue;

            } else {
                sum = sum + i;


            }


        }
        return sum;



    }


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the sum of odd number is "+ oddsum(n));

    }

}
