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
            System.out.println("1 Temperature: Celsius <-> Fahrenheit.");
            System.out.println("2 Data Storage: MB <-> GB.");
            System.out.println("3 Time :Hours <-> minutes.");
            System.out.println("4 Exit program.");
            System.out.print("Choose option: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    Menues.temperatureMenu();
                    break;
                case 2:
                    Menues.dataStorageMenu();
                    break;
                case 3:
                    Menues.timeMenu();
                    break;
                case 4:
                    nextLoop = false;
                    System.out.println("\nProgram End.");
            }
        }
    }
}
