import java.util.*;
public class CircumferenceOfCircle {
    public static double circumference(int r){
        return(2*3.14*r);
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("The circumference of the circle is " + circumference(r));
    }

}
