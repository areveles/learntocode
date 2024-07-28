public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("Primitive Types Challenge");
        byte myByte = 11;
        short myShort = 12;
        int myInt = 13;
        long result = 50_000L + (10 * (myByte + myShort + myInt));

        System.out.println(myByte + "," + myShort + "," + myInt + " * 10 = " + result);

    }
}