package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return getString("Enter a string: ");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return yesNo("Do you agree? (yes/no): ");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        return input.matches("(?i)^y(?:es)?$");
    }

    public int getInt(int min, int max) {
        return getInt(min, max, "Enter a number between " + min + " and " + max);
    }

    public int getInt(int min, int max, String prompt) {
        int input;
        do {
            System.out.println(prompt);
            input = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over
        } while (!(input >= min && input <= max));
        return input;
    }

    public int getInt() {
        return getInt("Enter any integer: ");
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int result = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        return result;
    }

    public double getDouble(double min, double max) {
        return getDouble(min, max, "Enter a number between " + min + " and " + max);
    }

    public double getDouble(double min, double max, String prompt) {
        double input;
        do {
            System.out.println(prompt);
            input = scanner.nextDouble();
            scanner.nextLine(); // consume newline left-over
        } while (!(input >= min && input <= max));
        return input;
    }

    public double getDouble() {
        return getDouble("Enter any decimal number: ");
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double result = scanner.nextDouble();
        scanner.nextLine(); // consume newline left-over
        return result;
    }
}
