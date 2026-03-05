package Lexicon.Hans;

public class Converters {

    public static int celsiusToFahrenheit(int celsius) {
        return (celsius*9/5) + 32;
    }

    public static double megaToGiga (double mb) {
        return mb / 1000;
    }

    public static int hoursToMinute (int hours) {
        return hours * 60;
    }

}
