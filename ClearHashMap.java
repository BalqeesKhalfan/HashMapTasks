import java.util.HashMap;
import java.util.Map;

class StudentClear {
    public Integer studentId;
    public String studentName;
}

public class ClearHashMap {
    public static void  main(String[] args){
        // Create a HashMap to store student IDs and names
        Map<Integer,StudentClear> studentMap = new HashMap<>();
        addStudentsToMap(studentMap);

        System.out.println("HashMap before clearing: " );
        for (StudentClear student : studentMap.values()) {
            System.out.println("Student ID: " + student.studentId + ", Name: " + student.studentName);
        }

        studentMap.clear();

        // Check if the HashMap is empty
        if (studentMap.isEmpty()) {
            System.out.println("HashMap cleared successfully.");
        } else {
            System.out.println("Failed to clear the HashMap.");
        }
    }
    public static void addStudentsToMap(Map<Integer, StudentClear> map) {
        StudentClear student1 = new StudentClear();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentClear student2 = new StudentClear();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentClear student3 = new StudentClear();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentClear student4 = new StudentClear();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentClear student5 = new StudentClear();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }

}
