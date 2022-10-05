public class clear_Bit {
    public static void main(String arg[]){
        int number=5;
        int position=2;
        int bitmask=1<<position;
        bitmask= ~(bitmask);
        int new_number=(bitmask & number);
        System.out.println(new_number);

    }
}
