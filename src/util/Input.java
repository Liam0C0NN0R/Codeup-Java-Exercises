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
            input = getInt(prompt);
        } while (!(input >= min && input <= max));
        return input;
    }

    public int getInt() {
        return getInt("Enter any integer: ");
    }

    public int getInt(String prompt) {
        int result;
        while (true) {
            try {
                System.out.println(prompt);
                String input = getString();
                result = Integer.valueOf(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Please try again.");
            }
        }
        return result;
    }

    public double getDouble(double min, double max) {
        return getDouble(min, max, "Enter a number between " + min + " and " + max);
    }

    public double getDouble(double min, double max, String prompt) {
        double input;
        do {
            input = getDouble(prompt);
        } while (!(input >= min && input <= max));
        return input;
    }

    public double getDouble() {
        return getDouble("Enter any decimal number: ");
    }

    public double getDouble(String prompt) {
        double result;
        while (true) {
            try {
                System.out.println(prompt);
                String input = getString();
                result = Double.valueOf(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid decimal number. Please try again.");
            }
        }
        return result;
    }

        public int getBinary() {
            return getBinary("Enter a binary number: ");
        }

        public int getBinary(String prompt) {
            int result;
            while (true) {
                try {
                    System.out.println(prompt);
                    String input = getString();
                    result = Integer.valueOf(input, 2);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid binary number. Please try again.");
                }
            }
            return result;
        }

        public int getHex() {
            return getHex("Enter a hexadecimal number: ");
        }

        public int getHex(String prompt) {
            int result;
            while (true) {
                try {
                    System.out.println(prompt);
                    String input = getString();
                    result = Integer.valueOf(input, 16);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid hexadecimal number. Please try again.");
                }
            }
            return result;
    }
}
