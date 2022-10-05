import java.util.*;
public class TwoDarrayFindX {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of row");
        int row = sc.nextInt();
        System.out.println("enter  no. of column");
        int col = sc.nextInt();
        System.out.println("enter element you want to search");
        int x=sc.nextInt();
        int[][] array2 = new int[row][col];
        System.out.println("enter 2d array element");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col ; j++) {

                array2[i][j]= sc.nextInt();


            }

        }


        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                if(array2[i][j]==x){
                    System.out.println("element found at position :"+ i +" "+j);
                    break;
                }
            }

        }


    }

}
