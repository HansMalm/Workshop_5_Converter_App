package Lexicon.Hans;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int select;
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    nextLoop = false;
            }

            System.out.println("\nProgram End.");
        }
    }
}
