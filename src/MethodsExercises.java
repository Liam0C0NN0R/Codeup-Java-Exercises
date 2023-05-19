import java.util.Scanner;
public class MethodsExercises {
//    TODO Basic Arithmetic: Create four separate methods. Each will perform an arithmetic operation:
//     Addition
//     Subtraction
//     Multiplication
//     Division
//     Each function needs to take two parameters/arguments so that the operation can be performed.
//     Add a modulus method that finds the modulus of two numbers.
//
// public static int addition(int a, int b) {
//            return a + b;
//        }
//
//        public static int subtraction(int a, int b) {
//            return a - b;
//        }
//
////        public static int multiplication(int a, int b) {
////            return a * b;
////        }
//
//        public static double division(int a, int b) {
//            if (b == 0) {
//                throw new ArithmeticException("Division by zero is not allowed.");
//            }
//            return (double) a / b;
//        }
//
//        public static int modulus(int a, int b) {
//            return a % b;
//        }
//
//        public static void main(String[] args) {
//            int operand1 = 10;
//            int operand2 = 4;
//
//            int sum = addition(operand1, operand2);
//            int difference = subtraction(operand1, operand2);
//            int product = multiplication(operand1, operand2);
//            double quotient = division(operand1, operand2);
//            int remainder = modulus(operand1, operand2);
//
//            System.out.println("Operand 1: " + operand1);
//            System.out.println("Operand 2: " + operand2);
//            System.out.println("Sum: " + sum);
//            System.out.println("Difference: " + difference);
//            System.out.println("Product: " + product);
//            System.out.println("Quotient: " + quotient);
//            System.out.println("Remainder: " + remainder);
//        }
//    TODO Bonus: Create your multiplication method without the * operator (Hint: a loop might be helpful).

////    public static int multiplication(int a, int b) {
////        if (a == 0 || b == 0) {
////            return 0;
////        }
////
////        int result = 0;
////        int absB = Math.abs(b);
////
////        for (int i = 0; i < absB; i++) {
////            result += a;
////        }
////
////        return b < 0 ? -result : result;
////    }
////
////    public static void mainInt(String[] args) {
////        int operand1 = 10;
////        int operand2 = 4;
////
////        int product = multiplication(operand1, operand2);
////
////        System.out.println("Operand 1: " + operand1);
////        System.out.println("Operand 2: " + operand2);
////        System.out.println("Product: " + product);
////    }
//    TODO Do the above with recursion.
//    public static int multiplication(int a, int b) {
//        if (b == 0) {
//            return 0;
//        } else if (b < 0) {
//            return -a + multiplication(a, b + 1);
//        } else {
//            return a + multiplication(a, b - 1);
//        }
//    }
//
//    public static void mainInts(String[] args) {
//        int operand1 = 10;
//        int operand2 = 4;
//
//        int product = multiplication(operand1, operand2);
//
//        System.out.println("Operand 1: " + operand1);
//        System.out.println("Operand 2: " + operand2);
//        System.out.println("Product: " + product);
//    }
//    TODO Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

//public static int getInteger(int min, int max) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter a number between " + min + " and " + max + ": ");
//    int userInput = scanner.nextInt();
//
//    if (userInput < min || userInput > max) {
//        System.out.println("Invalid input! Please try again.");
//        return getInteger(min, max);
//    }
//
//    return userInput;
//}
//
//    public static void main(String[] args) {
//        int userInput = getInteger(1, 10);
//        System.out.println("User input: " + userInput);
//    }
//    TODO Calculate the factorial of a number.
//     Prompt the user to enter an integer from 1 to 10.
//     Display the factorial of the number entered by the user.
//     Ask if the user wants to continue.
//     Use a for loop to calculate the factorial.
//     Assume that the user will enter an integer, but verify it’s between 1 and 10.
//     Use the long type to store the factorial.
//     Continue only if the user agrees to.
//     A factorial is a number multiplied by each of the numbers before it.
//     Factorials are denoted by the exclamation point (n!).
//public static long calculateFactorial(int number) {
//    long factorial = 1;
//
//    for (int i = 1; i <= number; i++) {
//        factorial *= i;
//    }
//
//    return factorial;
//}
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String choice;
//
//        do {
//            // Prompt the user to enter an integer from 1 to 10
//            int number;
//            do {
//                System.out.print("Enter an integer from 1 to 10: ");
//                number = scanner.nextInt();
//            } while (number < 1 || number > 10);
//
//            // Calculate the factorial of the number
//            long factorial = calculateFactorial(number);
//
//            // Display the factorial
//            System.out.println(number + "! = " + factorial);
//
//            // Ask if the user wants to continue
//            System.out.print("Do you want to continue? (yes/no): ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("yes"));
//
//        scanner.close();
//    }
//    TODO Bonus: Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//public static long calculateFactorial(int number) {
//    long factorial = 1;
//
//    for (int i = 1; i <= number; i++) {
//        factorial *= i;
//    }
//
//    return factorial;
//}
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String choice;
//
//        int highestAccurateInteger = 1;
//        while (true) {
//            long factorial = calculateFactorial(highestAccurateInteger + 1);
//            if (factorial < 0) {
//                break;
//            }
//            highestAccurateInteger++;
//        }
//
//        do {
//            // Prompt the user to enter an integer
//            int number;
//            do {
//                System.out.print("Enter an integer from 1 to " + highestAccurateInteger + ": ");
//                number = scanner.nextInt();
//            } while (number < 1 || number > highestAccurateInteger);
//
//            // Calculate the factorial of the number
//            long factorial = calculateFactorial(number);
//
//            // Display the factorial
//            System.out.println(number + "! = " + factorial);
//
//            // Ask if the user wants to continue
//            System.out.print("Do you want to continue? (yes/no): ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("yes"));
//
//        scanner.close();
//    }
//    TODO Use recursion to implement the factorial:
//public static long calculateFactorial(int number) {
//    if (number == 0 || number == 1) {
//        return 1;
//    } else {
//        return number * calculateFactorial(number - 1);
//    }
//}
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String choice;
//
//        int highestAccurateInteger = 1;
//        while (true) {
//            long factorial = calculateFactorial(highestAccurateInteger + 1);
//            if (factorial < 0) {
//                break;
//            }
//            highestAccurateInteger++;
//        }
//
//        do {
//            // Prompt the user to enter an integer
//            int number;
//            do {
//                System.out.print("Enter an integer from 1 to " + highestAccurateInteger + ": ");
//                number = scanner.nextInt();
//            } while (number < 1 || number > highestAccurateInteger);
//
//            // Calculate the factorial of the number
//            long factorial = calculateFactorial(number);
//
//            // Display the factorial
//            System.out.println(number + "! = " + factorial);
//
//            // Ask if the user wants to continue
//            System.out.print("Do you want to continue? (yes/no): ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("yes"));
//
//        scanner.close();
//    }
//    TODO Create an application that simulates dice rolling.
//     Ask the user to enter the number of sides for a pair of dice
//     Prompt the user to roll the dice
//     "Roll" two n-sided dice, display the results of each,
//     and then ask the user if he/she wants to roll the dice again.
//     Use static methods to implement the method(s) that generate the random numbers.
//     Use the .random method of the java.lang.Math class to generate random numbers.
public static int rollDice(int sides) {
    return (int) (Math.random() * sides) + 1;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            // Ask the user to enter the number of sides for a pair of dice
            System.out.print("Enter the number of sides for the dice: ");
            int sides = scanner.nextInt();

            // Roll the dice
            int dice1 = rollDice(sides);
            int dice2 = rollDice(sides);

            // Display the results
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            // Ask the user if they want to roll the dice again
            System.out.print("Roll the dice again? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}

