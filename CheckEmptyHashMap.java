import java.util.HashMap;
import java.util.Map;

class StudentEmpty {
    public Integer studentId;
    public String studentName;
}
public class CheckEmptyHashMap {
    public static void main(String[]  args){

    // Create a HashMap to store student IDs and names
    Map<Integer, StudentEmpty> studentMap = new HashMap<>();

    // Add student entries to the HashMap
    addStudentsToMap(studentMap);


    // Check if the HashMap is empty
    boolean isEmpty = studentMap.isEmpty();

    // Print whether the HashMap is empty or not
        if (isEmpty) {
        System.out.println("The HashMap is empty.");
    } else {
        System.out.println("The HashMap is not empty.");
    }

        System.out.println("HashMap Values:");
        for (StudentEmpty student : studentMap.values()) {
        System.out.println("Student ID: " + student.studentId + ", Name: " + student.studentName);
    }



}

public static void addStudentsToMap(Map<Integer, StudentEmpty> map) {
    StudentEmpty student1 = new StudentEmpty();
    student1.studentId = 1030;
    student1.studentName = "Asma";
    map.put(1030, student1);

    StudentEmpty student2 = new StudentEmpty();
    student2.studentId = 1031;
    student2.studentName = "Ahmed";
    map.put(1031, student2);

    StudentEmpty student3 = new StudentEmpty();
    student3.studentId = 1032;
    student3.studentName = "Balqees";
    map.put(1032, student3);

    StudentEmpty student4 = new StudentEmpty();
    student4.studentId = 1033;
    student4.studentName = "Ali";
    map.put(1033, student4);

    StudentEmpty student5 = new StudentEmpty();
    student5.studentId = 1034;
    student5.studentName = "Hamed";
    map.put(1034, student5);
}

}
