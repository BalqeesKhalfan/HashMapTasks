import java.util.HashMap;
import java.util.Map;

class StudentSize {
    public Integer studentId;
    public String studentName;
}
public class HashMapSize {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        Map<Integer, StudentSize> studentMap = new HashMap<>();

        // Add student entries to the HashMap
        addStudentsToMap(studentMap);
        System.out.println("HashMap Values : " );
        for (StudentSize student : studentMap.values()) {
            System.out.println("Student ID: " + student.studentId + ", Name: " + student.studentName);
        }

        // Find the size of the HashMap
        Integer size = studentMap.size();

        // Print the size of the HashMap
        System.out.println("Size of the HashMap: " + size);
    }

    public static void addStudentsToMap(Map<Integer, StudentSize> map) {
        StudentSize student1 = new StudentSize();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentSize student2 = new StudentSize();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentSize student3 = new StudentSize();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentSize student4 = new StudentSize();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentSize student5 = new StudentSize();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }
}
