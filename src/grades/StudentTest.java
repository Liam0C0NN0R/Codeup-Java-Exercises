package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(92);

        System.out.println("Student 1: " + student1.getName());
        System.out.println("Average Grade: " + student1.getGradeAverage());

        Student student2 = new Student("Jane Smith");
        student2.addGrade(75);
        student2.addGrade(80);
        student2.addGrade(88);

        System.out.println("Student 2: " + student2.getName());
        System.out.println("Average Grade: " + student2.getGradeAverage());
    }
}



