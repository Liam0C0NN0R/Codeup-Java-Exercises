import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);

        // Prompt the user to enter 3 words
        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("You entered:");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        scanner.nextLine();

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);


//        // Prompt the user to enter the length of the classroom
//        System.out.print("Enter the length of the classroom: ");
//        String lengthInput = scanner.nextLine();
//        double length = Double.parseDouble(lengthInput);
//
//        // Prompt the user to enter the width of the classroom
//        System.out.print("Enter the width of the classroom: ");
//        String widthInput = scanner.nextLine();
//        double width = Double.parseDouble(widthInput);
//
//        // Calculate the area and perimeter
//        double area = length * width;
//        double perimeter = 2 * (length + width);
//
//        // Display the calculated values
//        System.out.println("The area of the classroom is: " + area);
//        System.out.println("The perimeter of the classroom is: " + perimeter);

        // Prompt the user to enter the length of the classroom
        System.out.print("Enter the length of the classroom: ");
        int length = scanner.nextInt();

        // Prompt the user to enter the width of the classroom
        System.out.print("Enter the width of the classroom: ");
        int width = scanner.nextInt();

        // Prompt the user to enter the height of the classroom
        System.out.print("Enter the height of the classroom: ");
        int height = scanner.nextInt();

        // Calculate the area, perimeter, and volume
        int area = length * width;
        int perimeter = 2 * (length + width);
        int volume = length * width * height;

        // Display the calculated values
        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);
        System.out.println("The volume of the classroom is: " + volume);

        scanner.close();


    }
}

