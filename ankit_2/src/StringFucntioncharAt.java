//import java.util.*;
//public class StringFucntioncharAt {
//    public static void main(String arg[]){
//
//    Scanner sc=new Scanner(System.in);
//    String myname = sc.nextLine();
//    for(int i=0; i<myname.length();i++){
//        System.out.println(myname(i));  it is wrong myname(i)
//    }
//    }
//
//}

import java.util.*;
public class StringFucntioncharAt {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String myname = sc.nextLine();
        for(int i=0; i<myname.length();i++){
            System.out.println(myname.charAt(i));
        }
    }

}

