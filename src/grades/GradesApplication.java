package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = createStudents();

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
            System.out.println("Available Options:");
            System.out.println("1. View student information");
            System.out.println("2. View all grades for all students");
            System.out.println("3. View overall class average");
            System.out.println("4. Print CSV report of all students");
            System.out.println("5. Exit");

            System.out.print("Please enter the option number: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.println();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter the GitHub username of the student: ");
                    String usernameInput = scanner.nextLine();

                    Student student = students.get(usernameInput);
                    if (student == null) {
                        System.out.println("Sorry, no student found with the GitHub username of \"" + usernameInput + "\".");
                    } else {
                        System.out.println("Name: " + student.getName());
                        System.out.println("GitHub Username: " + usernameInput);
                        System.out.println("Current Average: " + student.getGradeAverage());
                    }
                }
                case 2 -> {
                    System.out.println("All Grades for All Students:");
                    for (Map.Entry<String, Student> entry : students.entrySet()) {
                        String username = entry.getKey();
                        Student student = entry.getValue();
                        System.out.println("Name: " + student.getName());
                        System.out.println("GitHub Username: " + username);
                        System.out.println("Grades: " + student.getGrades());
                        System.out.println();
                    }
                }
                case 3 -> {
                    double classAverage = calculateClassAverage(students);
                    System.out.println("Overall Class Average: " + classAverage);
                }
                case 4 -> generateCSVReport(students);
                case 5 -> {
                    System.out.println("Goodbye, and have a wonderful day!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }

            System.out.print("Would you like to continue? (y/n) ");
            answer = scanner.nextLine();
            System.out.println();
        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Goodbye, and have a wonderful day!");
    }

    private static HashMap<String, Student> createStudents() {
        HashMap<String, Student> students = new HashMap<>();

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

        return students;
    }

    private static double calculateClassAverage(HashMap<String, Student> students) {
        double sum = 0;
        int count = 0;

        for (Student student : students.values()) {
            sum += student.getGradeAverage();
            count++;
        }

        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    private static void generateCSVReport(HashMap<String, Student> students) {
        System.out.println("CSV Report:");
        System.out.println("name,github_username,average");

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            String username = entry.getKey();
            Student student = entry.getValue();
            String name = student.getName();
            double average = student.getGradeAverage();

            System.out.println(name + "," + username + "," + average);
        }
    }
}
