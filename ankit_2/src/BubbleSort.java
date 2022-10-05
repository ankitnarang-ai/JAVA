import java.util.*;
public class BubbleSort {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an arrar");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

            for (int j = 0; j < n; j++) {
                for(int k = 0; k < n-1-j; k++)
                {
                    if (arr[k] > arr[k+1]) {
                        int temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }


                }
                for(int l=0;l<n;l++){
                    System.out.print(arr[l]);
                }
                System.out.println();
            }



    }
}
