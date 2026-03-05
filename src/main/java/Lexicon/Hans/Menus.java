package Lexicon.Hans;

import java.util.Scanner;

public class Menus {

    public static void temperatureMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose:\nC to convert to Celsius.\nF to convert to Fahrenheit.\nB Main Menu.\nInput: ");


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
