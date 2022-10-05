import java.util.*;
public class x_Power_n___8 {
    public static double xpowern(int x, int n){
        double result=(Math.pow(x,n));
        return result;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int x=sc.nextInt();
        System.out.println("enter exponent or power");
        int n=sc.nextInt();
        System.out.println(xpowern(x,n));
    }

}
