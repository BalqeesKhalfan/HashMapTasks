import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class StudentChecker {
    public Integer studentId;
    public String studentName;
}
public class CheckKeyInHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        Map<Integer, StudentChecker> studentMap = new HashMap<>();

        // Add student entries to the HashMap
        addStudentsToMap(studentMap);

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student ID to check
        System.out.print("Enter the student ID to check: ");
        Integer studentIdToCheck = scanner.nextInt();

        // Check if the entered student ID exists in the HashMap
        boolean exists = studentMap.containsKey(studentIdToCheck);

        // Print the result
        System.out.println("Does student ID " + studentIdToCheck + " exist in the HashMap? " + exists);
    }

    // Function to add student entries to the HashMap
    public static void addStudentsToMap(Map<Integer, StudentChecker> map) {
        StudentChecker student1 = new StudentChecker();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentChecker student2 = new StudentChecker();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentChecker student3 = new StudentChecker();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentChecker student4 = new StudentChecker();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentChecker student5 = new StudentChecker();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }
}
