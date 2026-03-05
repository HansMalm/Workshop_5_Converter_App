package Lexicon.Hans;

import java.util.Scanner;

public class Converters {

    public static int celsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 9 / 5;
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

    public static int minuteToHours (int hours) {
        return hours * 60;
    }

}
