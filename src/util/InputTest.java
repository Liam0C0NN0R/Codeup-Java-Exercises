package util;
//TODO Create another class named InputTest that has a static main method that uses all the methods from the Input class.

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String stringInput = input.getString("Enter a string: ");
        System.out.println("You entered: " + stringInput);

        boolean booleanInput = input.yesNo("Do you agree? (yes/no): ");
        System.out.println("You agreed: " + booleanInput);

        int intInput = input.getInt("Enter any integer: ");
        System.out.println("You entered: " + intInput);

        int minInt = 1;
        int maxInt = 10;
        int rangeInt = input.getInt(minInt, maxInt, "Enter a number between " + minInt + " and " + maxInt);
        System.out.println("You entered in range: " + rangeInt);

        double doubleInput = input.getDouble("Enter any decimal number: ");
        System.out.println("You entered: " + doubleInput);

        double minDouble = 1.0;
        double maxDouble = 10.0;
        double rangeDouble = input.getDouble(minDouble, maxDouble, "Enter a number between " + minDouble + " and " + maxDouble);
        System.out.println("You entered in range: " + rangeDouble);
    }
}

