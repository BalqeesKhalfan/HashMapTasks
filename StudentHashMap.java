import java.util.HashMap;
import java.util.Map;

// A class to represent a Student with student ID and name
class Student {
    private int studentId;
    private String studentName;

    // Constructor to initialize student ID and name
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getter method for student ID
    public int getStudentId() {
        return studentId;
    }

    // Getter method for student name
    public String getStudentName() {
        return studentName;
    }
}

public class StudentHashMap {

    public  static void  main(String[] args){

        HashMap<Integer,Student> studentMap=new HashMap<>();
        // Add student entries to the HashMap

        studentMap.put(1030,new Student(1030, "Asma"));
        studentMap.put(1031, new Student(1031,"Ahmed"));
        studentMap.put(1032, new Student(1032,"Balqees"));
        studentMap.put(1033, new Student(1033,"Ali"));
        studentMap.put(1034, new Student(1034,"Hamed"));

        System.out.println("Student HashMap:");//Print the entire HashMap to verify the entries
        // loop for printing all the hash map have recoded
        for (Map.Entry<Integer, Student> record: studentMap.entrySet()) {
            Student student = record.getValue();
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getStudentName());
        }

    }
}
