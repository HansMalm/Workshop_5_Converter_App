package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int select;
        boolean mainLoop = true;
        System.out.println("\nWelcome to The Converter!");

        while (mainLoop) {

            System.out.println("\nChoose a unit to convert from the list.");
            System.out.println("1 Temperature: Celsius <-> Fahrenheit.");
            System.out.println("2 Data Storage: MB <-> GB.");
            System.out.println("3 Time :Hours <-> minutes.");
            System.out.println("4 Exit program.");
            System.out.print("Choose option: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    Menus.temperatureMenu();
                    break;
                case 2:
                    Menus.dataStorageMenu();
                    break;
                case 3:
                    Menus.timeMenu();
                    break;
                case 4:
                    mainLoop = false;
                    System.out.println("\nProgram End.");
            }
        }
    }
}
