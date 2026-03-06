package Lexicon.Hans;

import java.util.Scanner;

public class Menus {

    static Scanner scanner = new Scanner(System.in);
    static String input;
    static boolean nextLoop = true;

    private static boolean exitMenu() {
        return true;
    }

    public static void temperatureMenu() {
        //Scanner scanner = new Scanner(System.in);
        //String input;
        //boolean nextLoop = true;

        while (nextLoop) {
            System.out.println("Choose:\nC to convert to Celsius.\nF to convert to Fahrenheit.\nB Main Menu.\nInput: ");
            input = scanner.next();
            if (input.equals("B") || input.equals("b")) {
                nextLoop = false;
            } else if (input.equals("C") || input.equals("c")) {
                System.out.println("Input temperature: ");
                int temperature = scanner.nextInt();
                System.out.println(temperature + " Fahrenheit = "
                        + Converters.fahrenheitToCelsius(temperature) + " Celsius.");
            }
        }
    }

    public static void dataStorageMenu() {
        while (true) {
            System.out.println("Input K to convert to KB.\n G to convert to GB.\nB Main Menu.\nInput: ");
        }
    }

    public static void timeMenu () {
        while (true) {
            System.out.println("Input H to convert to Hours.\n M to convert to Minutes.\nB Main Menu.\nInput: ");
        }
    }
}
