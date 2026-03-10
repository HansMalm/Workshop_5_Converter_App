package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int select;
        boolean mainLoop = true;
        System.out.println("\nWelcome to The Converter!");

        while (mainLoop) {

            System.out.print("""
            \nList of units to convert:
            1 Temperature: Celsius <-> Fahrenheit.
            2 Data Storage: MB <-> GB.
            3 Time :Hours <-> minutes.
            4 Exit program."
            Choose option:""" + " ");
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
