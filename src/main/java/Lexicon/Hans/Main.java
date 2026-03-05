package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int select;
        System.out.println("\nWelcome to The Converter!");


        while (true) {

            System.out.println("\nChoose a unit to convert from the list.");
            System.out.println("1 Temperature: Celsius to Fahrenheit.");
            System.out.println("2 Data Storage: MB to GB.");
            System.out.println("3 Hours to minutes.");
            System.out.print("Choose option: ");
            select = scanner.nextInt();


        }
    }
}
