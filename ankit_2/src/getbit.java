public class getbit {
    public static void main(String arg[]){
        int number=5;
        int position=2;
        int bitmask = 1<<position;
        if((bitmask & number )==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is one");
        }

    }
}
