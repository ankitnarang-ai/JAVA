import java.util.*;
public class count_PositiveNegativeZeros {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers you want to enter : ");
        int countpositive=0;
        int countnegative=0;
        int countzero=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int k = sc.nextInt();


            if (k < 0) {
                countnegative++;
            } else if (k > 0) {
                countpositive++;

            } else {
                countzero++;
            }
        }

            System.out.println("the total number of positive number :"+countpositive);
            System.out.println("the total number of negative :"+countnegative);
            System.out.println("the total number of zero :"+countzero);

    }
}
