public class update_bit {
    public static void main(String arg[]) {


        int number = 5;
        int position = 2;
        int operation=0;
        int bitmask = 1 << position;
        int newbitmask=~bitmask;
        if(operation==1){
            System.out.println(bitmask | number);
        }
        else {
            System.out.println(newbitmask & number);
        }
    }
}

