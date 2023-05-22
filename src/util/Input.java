package util;
//TODO Create an input validation class: Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner. When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
// String getString()
// boolean yesNo()
// int getInt(int min, int max)
// int getInt()
// double getDouble(double min, double max)
// double getDouble()
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }
//TODO The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
//TODO The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
    public int getInt(int min, int max) {
        while (true) {
            System.out.println("Enter a number between " + min + " and " + max);
            int input = scanner.nextInt();
            if (input >= min && input <= max) {
                return input;
            }
            System.out.println("Invalid input. Please try again.");
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        while (true) {
            System.out.println("Enter a number between " + min + " and " + max);
            double input = scanner.nextDouble();
            if (input >= min && input <= max) {
                return input;
            }
            System.out.println("Invalid input. Please try again.");
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}

