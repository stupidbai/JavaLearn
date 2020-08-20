public class Demo03 {
    public static void main(String[] args) {
        int i =128;
        byte b = (byte) i;//内存溢出

        double c =i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(2<<3);
    }
}
