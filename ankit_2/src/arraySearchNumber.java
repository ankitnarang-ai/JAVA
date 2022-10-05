import java.util.*;
public class arraySearchNumber {
    public static void main(String arg[]){
        int x;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter which number you want to find ");
        x=sc.nextInt();
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("element found at index : "+ i);
                break;
            }

        }




    }
}
