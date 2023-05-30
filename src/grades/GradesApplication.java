package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Creating Student objects and adding them to the map
        Student student1 = new Student("Max Verstappen");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(92);
        students.put("Versatile33", student1);

        Student student2 = new Student("Lewis Hamilton");
        student2.addGrade(75);
        student2.addGrade(80);
        student2.addGrade(88);
        students.put("GoingHam44", student2);

        Student student3 = new Student("Michael Schumacher");
        student3.addGrade(95);
        student3.addGrade(87);
        student3.addGrade(91);
        students.put("Schu_in47", student3);

        Student student4 = new Student("Ayrton Senna");
        student4.addGrade(80);
        student4.addGrade(88);
        student4.addGrade(92);
        students.put("SennaSenpai27", student4);

        System.out.println("Welcome to the Grades Application!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();
        System.out.println();

        // CLI logic
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.print("What student would you like to see more information on? ");
            String usernameInput = scanner.nextLine();

            Student student = students.get(usernameInput);
            if (student == null) {
                System.out.println("Sorry, no student found with the GitHub username of \"" + usernameInput + "\".");
            } else {
                System.out.println("Name: " + student.getName());
                System.out.println("GitHub Username: " + usernameInput);
                System.out.println("Current Average: " + student.getGradeAverage());
            }

            System.out.print("Would you like to see another student? (y/n) ");
            answer = scanner.nextLine();
            System.out.println();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
