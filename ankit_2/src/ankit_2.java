import java.util.*;

// practice question 1. avg of three number

public class ankit_2{
    public static int avgofthree(int a, int b , int c){
        return((a+b+c)/3);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((avgofthree(a,b,c)));
    }
}
