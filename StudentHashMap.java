import java.util.HashMap;
import java.util.Map;

// A class to represent a Student with student ID and name
class Student {
    public Integer studentId;
    public String studentName;
}

public class StudentHashMap {

    public static void main(String[] args) {

        HashMap<Integer, Student> studentMap = new HashMap<>();
        // Add student entries to the HashMap

        Student student1 = new Student();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        studentMap.put(1030, student1);

        Student student2 = new Student();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        studentMap.put(1031, student2);

        Student student3 = new Student();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        studentMap.put(1032, student3);

        Student student4 = new Student();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        studentMap.put(1033, student4);

        Student student5 = new Student();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        studentMap.put(1034, student5);

        System.out.println("Student HashMap:");//Print the entire HashMap to verify the entries
        // loop for printing all the hash map have recorded
        for (Map.Entry<Integer, Student> record : studentMap.entrySet()) {
            Student student = record.getValue();
            System.out.println("Student ID: " + student.studentId + ", Name: " + student.studentName);
        }

    }
}
