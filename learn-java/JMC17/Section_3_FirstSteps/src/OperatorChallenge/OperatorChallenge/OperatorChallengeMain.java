package OperatorChallenge;

public class OperatorChallengeMain {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        System.out.println("firstDouble = " + firstDouble);

        double secondDouble = 80.00d;
        System.out.println("secondDouble = " + secondDouble);

        double addDoubles = (firstDouble + secondDouble) * 100.00d;
        System.out.println("addDoubles = " + addDoubles);

        double remainderDoubles = addDoubles % 40.00d;
        System.out.println("remainderDoubles = " + remainderDoubles);

        boolean isZero = remainderDoubles == 0 ? true : false;
        System.out.println("isZero = " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}