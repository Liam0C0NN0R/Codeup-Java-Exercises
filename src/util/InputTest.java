package util;
//TODO Create another class named InputTest that has a static main method that uses all the methods from the Input class.

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        String stringInput = input.getString();
        System.out.println("You entered: " + stringInput);

        System.out.println("Do you agree? (yes/no): ");
        boolean booleanInput = input.yesNo();
        System.out.println("You agreed: " + booleanInput);

        System.out.println("Enter any integer: ");
        int intInput = input.getInt();
        System.out.println("You entered: " + intInput);

        int minInt = 1;
        int maxInt = 10;
        int rangeInt = input.getInt(minInt, maxInt);
        System.out.println("You entered in range: " + rangeInt);

        System.out.println("Enter any decimal number: ");
        double doubleInput = input.getDouble();
        System.out.println("You entered: " + doubleInput);

        double minDouble = 1.0;
        double maxDouble = 10.0;
        double rangeDouble = input.getDouble(minDouble, maxDouble);
        System.out.println("You entered in range: " + rangeDouble);
    }
}

