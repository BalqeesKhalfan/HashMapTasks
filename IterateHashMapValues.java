import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class StudentDetails {
    public Integer studentId;
    public String studentName;
}

public class IterateHashMapValues {
    public  static void main(String[] args){
        Map<Integer, StudentDetails> studentMap = new HashMap<>();
        // Add student entries to the HashMap
        addStudentsToMap(studentMap);
        System.out.println("Values of the HashMap:");
        // Iterate over just the values of the HashMap and print each one

        for(StudentDetails studentDetails:studentMap.values()){
            System.out.println("Student ID : "+studentDetails.studentId+" Student Name: "+studentDetails.studentName);
        }

    }
    public static  void addStudentsToMap(Map<Integer,StudentDetails>map){
        StudentDetails student1 = new StudentDetails();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        StudentDetails student2 = new StudentDetails();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        StudentDetails student3 = new StudentDetails();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        StudentDetails student4 = new StudentDetails();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        StudentDetails student5 = new StudentDetails();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }

}
