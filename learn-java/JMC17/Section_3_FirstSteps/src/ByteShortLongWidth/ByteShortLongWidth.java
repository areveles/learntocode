package ByteShortLongWidth;

public class ByteShortLongWidth {
    public static void main(String[] args) {
        System.out.println("Integer Value Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("An integer has a width of " + Integer.SIZE + " bits");

        System.out.println("Byte Value Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("A byte has a width of " + Byte.SIZE + " bits");

        System.out.println("Short Value Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("A short has a width of " + Short.SIZE + " bits");
        
        System.out.println("Long Value Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("A long has a width of " + Long.SIZE + " bits");
    }
}