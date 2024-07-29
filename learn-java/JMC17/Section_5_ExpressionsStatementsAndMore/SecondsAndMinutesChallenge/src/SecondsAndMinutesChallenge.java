public class SecondsAndMinutesChallenge {

    public static void main(String[] args) throws Exception {

        System.out.println(getDurationString(-3945));

        System.out.println(getDurationString(-65, 45));

        System.out.println(getDurationString(65, 145));

        System.out.println(getDurationString(65, 45));

        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return (minutes < 0 || seconds < 0 || seconds > 59)
                ? "Error, must be a positive integer value and seconds must be between 0 and 59"
                : hours + "h " + remainingMinutes + "m " + seconds + "s";

    }
}
