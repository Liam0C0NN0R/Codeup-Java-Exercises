package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")) {
            attendance.put(date, value);
        } else {
            System.out.println("Invalid attendance value. Please enter 'A' for Absent or 'P' for Present.");
        }
    }

    public double getAttendancePercentage() {
        int totalDays = attendance.size();
        int absences = 0;
        for (String value : attendance.values()) {
            if (value.equalsIgnoreCase("A")) {
                absences++;
            }
        }
        return (double) (totalDays - absences) / totalDays * 100;
    }

    public List<String> getAbsentDates() {
        List<String> absentDates = new ArrayList<>();
        for (Map.Entry<String, String> entry : attendance.entrySet()) {
            String date = entry.getKey();
            String value = entry.getValue();
            if (value.equalsIgnoreCase("A")) {
                absentDates.add(date);
            }
        }
        return absentDates;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }
}
