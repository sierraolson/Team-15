public class Main {
    public static void main(String[] args) {
        int num = 512;
        System.out.println("num is " + Integer.toBinaryString(num));
        System.out.println("~num is " + Integer.toBinaryString(~num));
        System.out.println("~num + 1 is " + Integer.toBinaryString(~num + 1));
        System.out.println("num & (~num) is " + Integer.toBinaryString((num & (~num))));
        boolean isPow = (num & ((~num + 1) & ~(0xFFFF << num))) == 0 && num > 0;
        System.out.println(isPow);
        System.out.println(String.format("0x%08X", 145));
        System.out.println(Integer.toBinaryString(145));
    }
}
