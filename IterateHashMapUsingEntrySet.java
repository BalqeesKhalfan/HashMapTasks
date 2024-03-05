import java.util.HashMap;
import java.util.Map;

// A class to represent a Student with student ID and name
class StudentData {
    public Integer studentId;
    public String studentName;
}


public class IterateHashMapUsingEntrySet {

    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        Map<Integer, StudentData> studentMap = new HashMap<>();

        // Add student entries to the HashMap
        addStudentsToMap(studentMap);

        // Iterate over the entries of the HashMap using entrySet() method
        System.out.println("Key-Value pairs of the HashMap:");
        for (Map.Entry<Integer, StudentData> entry : studentMap.entrySet()) {
            Integer key = entry.getKey();
            StudentData student = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + student.studentName);
        }
    }

    // Function to add student entries to the HashMap
    public static void addStudentsToMap(Map<Integer, StudentData> map) {
        StudentData student1 = new StudentData();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentData student2 = new StudentData();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentData student3 = new StudentData();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentData student4 = new StudentData();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentData student5 = new StudentData();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }
}
