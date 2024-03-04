import java.util.HashMap;
import java.util.Map;

class StudentRemove {
    public Integer studentId;
    public String studentName;
}
public class RemoveStudentFromHashMap {

    public static void main(String[] args){
        // Create a HashMap to store student IDs and names
        Map<Integer, StudentRemove> studentMap = new HashMap<>();

        // Add student entries to the HashMap
        addStudentsToMap(studentMap);

        // Print the HashMap before removing a student
        System.out.println("HashMap before removing a student:");
        printHashMap(studentMap);

        // Remove a student from the HashMap using their student ID
        Integer studentIdToRemove = 1032; // Change this to the desired student ID
        removeStudent(studentMap, studentIdToRemove);

        // Print the updated HashMap
        System.out.println("\nHashMap after removing the student:");
        printHashMap(studentMap);
    }
    // Function to add student entries to the HashMap
    public static void addStudentsToMap(Map<Integer, StudentRemove> map) {
        StudentRemove student1 = new StudentRemove();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentRemove student2 = new StudentRemove();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentRemove student3 = new StudentRemove();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentRemove student4 = new StudentRemove();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentRemove student5 = new StudentRemove();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }

    // Function to remove a student from the HashMap using their student ID
    public static void removeStudent(Map<Integer, StudentRemove> map, Integer studentId) {
        map.remove(studentId);
    }

    // Function to print the HashMap
    public static void printHashMap(Map<Integer, StudentRemove> map) {
        for (Map.Entry<Integer, StudentRemove> entry : map.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue().studentName);
        }
    }

    }

