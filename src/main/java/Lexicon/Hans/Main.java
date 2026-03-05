package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int select, input;
        boolean nextLoop = true;
        System.out.println("\nWelcome to The Converter!");

        while (nextLoop) {

            System.out.println("\nChoose a unit to convert from the list.");
            System.out.println("1 Temperature: Celsius to Fahrenheit.");
            System.out.println("2 Data Storage: MB to GB.");
            System.out.println("3 Hours to minutes.");
            System.out.println("4 Exit program.");
            System.out.print("Choose option: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Input temperature: ");
                    input = scanner.nextInt();
                    System.out.println(input + " Celsius = " + Converters.celsiusToFahrenheit(input) + " Fahrenheit.");

                    break;
                case 2:
                    System.out.print("Input megabytes: ");
                    input = scanner.nextInt();
                    System.out.println(input + " megabyte = " + Converters.megaToGiga(input) + " gigabyte.");
                    break;
                case 3:
                    System.out.print("Input hours: ");
                    input = scanner.nextInt();
                    System.out.println(input + " hours = " + Converters.hoursToMinute(input) + " minutes.");
                    break;
                case 4:
                    nextLoop = false;
                    System.out.println("\nProgram End.");
            }
        }
    }
}
