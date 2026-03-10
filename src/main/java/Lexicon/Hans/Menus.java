package Lexicon.Hans;

import java.util.Scanner;

public class Menus {

    static Scanner scanner = new Scanner(System.in);
    static String menuInput;
    static boolean nextLoop = true;
    static int valueInput;

    public static void temperatureMenu() {
        while (nextLoop) {
            System.out.println("""
                    \nChoose From Temperature Menu:
                    C to convert to Celsius.
                    F to convert to Fahrenheit.
                    B Main Menu.
                    Input:
                    """ + " ");
            menuInput = scanner.next();

            switch (menuInput) {
                case "B":
                    nextLoop = false;
                    break;
                case "C":
                    System.out.print("\nInput temp in Fahrenheit: ");
                    valueInput = scanner.nextInt();
                    System.out.println(valueInput + " F = "
                            + Converters.fahrenheitToCelsius(valueInput) + " Celsius.");
                    break;
                case "F":
                    System.out.print("\nInput temp in Celsius: ");
                    valueInput = scanner.nextInt();
                    System.out.println(valueInput + " C = "
                            + Converters.celsiusToFahrenheit(valueInput) + " Fahrenheit.");
                    break;
            }
        }
    }

    public static void dataStorageMenu() {
        while (nextLoop) {
            System.out.println("""
                    \nChoose From DataStorage Menu:
                    M to convert to MB.
                    G to convert to GB.
                    B Main Menu.
                    Input:
                    """ + " ");
            menuInput = scanner.next();

            switch (menuInput) {
                case "B":
                    nextLoop = false;
                    break;
                case "M":
                    System.out.print("\nInput size in Gigabytes: ");
                    valueInput = scanner.nextInt();
                    System.out.println(valueInput + " GB = "
                            + Converters.gigaToMega(valueInput) + " MB.");
                    break;
                case "G":
                    System.out.print("\nInput size in Megabytes: ");
                    valueInput = scanner.nextInt();
                    System.out.println(valueInput + " MB = "
                            + Converters.megaToGiga(valueInput) + " GB.");
                    break;
            }
        }
    }

    public static void timeMenu () {
        while (nextLoop) {
            System.out.print("""
                    \nChoose From Time Menu:
                    H to convert to Hours.
                    M to convert to Minutes.
                    B Main Menu.
                    Input:
                    """ + " ");
            menuInput = scanner.next();

            switch (menuInput) {
                case "B":
                    nextLoop = false;
                    break;
                case "H":
                    System.out.print("\nInput time in minutes: ");
                    valueInput = scanner.nextInt();
                    System.out.println(valueInput + " min = "
                            + Converters.minuteToHours(valueInput) + " hours.");
                    break;
                case "M":
                    System.out.print("\nInput time in hours: ");
                    valueInput = scanner.nextInt();
                    System.out.println(valueInput + " h = "
                            + Converters.hoursToMinute(valueInput) + " minutes.");
                    break;
            }
        }
    }
}
