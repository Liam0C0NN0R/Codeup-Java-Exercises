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
    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

//TODO The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
//TODO The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
public int getInt(int min, int max) {
    int input;
    do {
        input = scanner.nextInt();
    } while (!(input >= min && input <= max));
    return input;
}

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }

    public int getInt() {
        return scanner.nextInt();
    }
    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            input = scanner.nextDouble();
        } while (!(input >= min && input <= max));
        return input;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}

