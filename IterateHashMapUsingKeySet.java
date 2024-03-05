import java.util.HashMap;
import java.util.Map;

class StudentInfo {
    public Integer studentId;
    public String studentName;
}
public class IterateHashMapUsingKeySet {
    public static void main(String[]args){
    // Create a HashMap to store student IDs and names
    Map<Integer, StudentInfo> studentMap = new HashMap<>();

    // Add student entries to the HashMap
    addStudentsToMap(studentMap);

    // Iterate over the keys of the HashMap using keySet() method
        System.out.println("Key-Value pairs of the HashMap:");
        for (Integer key : studentMap.keySet()) {
        StudentInfo student = studentMap.get(key);
        System.out.println("Key: " + key + ", Value: " + student.studentName);
    }


    }

    public static void addStudentsToMap(Map<Integer, StudentInfo> map) {
        StudentInfo student1 = new StudentInfo();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentInfo student2 = new StudentInfo();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentInfo student3 = new StudentInfo();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentInfo student4 = new StudentInfo();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentInfo student5 = new StudentInfo();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }
}
