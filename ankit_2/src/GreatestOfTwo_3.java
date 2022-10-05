import java.util.*;
public class GreatestOfTwo_3 {
    public static int largeroftwo(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the greatest number is "+ largeroftwo(a,b));
    }
}
