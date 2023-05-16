//TODO For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, comment out your previous code and continue coding in the main method with the next exercise.
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//TODO WHILE: Create an integer variable i with a value of 5. Create a while loop that runs so long as i is less than or equal to 15 Each loop iteration, output the current value of i, then increment i by one. Your output should look like this: 5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//TODO DO WHILE: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//TODO Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

// TODO Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal: 2 4 16 256 65536

//        long number = 2;
//
//        do {
//            System.out.println(number);
//            number *= number;
//        } while (number < 1_000_000);

//TODO FOR: Refactor the previous two exercises to use a for loop instead.
//TODO Refactor A:

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }
//TODO Refactor B:

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long number = 2; number < 1_000_000; number *= number) {
//            System.out.println(number);
//        }

//TODO Write a program that prints the numbers from 1 to 100. For multiples of three: print “Fizz” instead of the number. For the multiples of five: print “Buzz”. For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        String choice;

//        do {
//            // Prompt the user to enter an integer
//            System.out.print("What number would you like to go up to? ");
//            int number = scanner.nextInt();
//            // Display the table of powers
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= number; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
//            }
//            // Ask if the user wants to continue
//            System.out.print("\nDo you want to continue? (y/n) ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("y"));
//
//        scanner.close();

        do {
            // Prompt the user for a numerical grade
            System.out.print("Enter a numerical grade (0-100): ");
            int numericalGrade = scanner.nextInt();

            // Convert numerical grade to letter grade
            String letterGrade;

            if (numericalGrade >= 98 && numericalGrade <= 100) {
                letterGrade = "A+";
            } else if (numericalGrade >= 93 && numericalGrade <= 97) {
                letterGrade = "A";
            } else if (numericalGrade >= 90 && numericalGrade <= 92) {
                letterGrade = "A-";
            } else if (numericalGrade >= 88 && numericalGrade <= 89) {
                letterGrade = "B+";
            } else if (numericalGrade >= 83 && numericalGrade <= 87) {
                letterGrade = "B";
            } else if (numericalGrade >= 80 && numericalGrade <= 82) {
                letterGrade = "B-";
            } else if (numericalGrade >= 78 && numericalGrade <= 79) {
                letterGrade = "C+";
            } else if (numericalGrade >= 73 && numericalGrade <= 77) {
                letterGrade = "C";
            } else if (numericalGrade >= 70 && numericalGrade <= 72) {
                letterGrade = "C-";
            } else if (numericalGrade >= 68 && numericalGrade <= 69) {
                letterGrade = "D+";
            } else if (numericalGrade >= 63 && numericalGrade <= 67) {
                letterGrade = "D";
            } else if (numericalGrade >= 60 && numericalGrade <= 62) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }
            // Display the corresponding letter grade
            System.out.println("Letter Grade: " + letterGrade);

            // Prompt the user to continue
            System.out.print("Do you want to continue? (y/n) ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        scanner.close();

    }
}
