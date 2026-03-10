package Lexicon.Hans;

//Converter Methods
public class Converters {

    public static int celsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double megaToGiga (double mb) {
        return mb / 1000;
    }

    public static double gigaToMega (double gb) {
        return gb * 1000;
    }

    public static int hoursToMinute (int hours) {
        return hours * 60;
    }

    public static int minuteToHours (int minutes) {
        return minutes / 60;
    }

}
