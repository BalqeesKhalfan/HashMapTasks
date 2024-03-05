import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// A class to represent a Student with student ID and name
class StudentExistValue {
    public Integer studentId;
    public String studentName;
}
public class CheckValueInHashMap {
    public  static void main(String[] args){
        Map<Integer, StudentExistValue> studentMap = new HashMap<>();
        // Add student entries to the HashMap
        addStudentsToMap(studentMap);

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the name of student want to check if it exists or not
        System.out.print("Enter the student name to check: ");
        String studentNameToCheck = scanner.nextLine();
        // Check if the entered student name exists in the HashMap
        boolean exists = isStudentNamePresent(studentMap, studentNameToCheck);

        System.out.println("Is student name '" + studentNameToCheck + "' present in the HashMap? " + exists);

    }
    public static boolean isStudentNamePresent(Map<Integer, StudentExistValue> map, String studentName) {
        for (StudentExistValue student : map.values()) {
            if (student.studentName.equals(studentName)) {
                return true;
            }
        }
        return false;
    }
    public static void addStudentsToMap(Map<Integer, StudentExistValue> map) {
        StudentExistValue student1 = new StudentExistValue();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentExistValue student2 = new StudentExistValue();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentExistValue student3 = new StudentExistValue();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentExistValue student4 = new StudentExistValue();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentExistValue student5 = new StudentExistValue();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }

}
