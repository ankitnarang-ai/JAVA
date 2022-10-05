import java.util.*;
public class StringArrayPQ {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int size=sc.nextInt();
        String strarray[]=new String[size];

        for(int i=0;i<size;i++){
            strarray[i]=sc.next();


        }
        for(int i=0;i<size;i++){
            System.out.println(strarray[i]);
        }
    }

}
