import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// A class to represent a Student with student ID and name
class Students {
    public Integer studentId;
    public String studentName;
}

public class RetrieveValueFromHashMap {

    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        Map<Integer, Students> studentMap = new HashMap<>();

        // Add student entries to the HashMap
         addStudentsToMap(studentMap);
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student ID
        System.out.print("Enter the student ID to retrieve: ");
        Integer studentIdToRetrieve = scanner.nextInt();
        // Retrieve a student's name using their student ID as the key
        String studentName = retrieveStudentName(studentMap, studentIdToRetrieve);


        // Print the retrieved student's name
        System.out.println("Retrieved Student's Name: " + studentName);
    }
    // Function to add student entries to the HashMap
    public static void addStudentsToMap(Map<Integer, Students> map) {
        Students student1 = new Students();
        student1.studentId = 1030;
        student1.studentName = "Asma";
        map.put(1030, student1);

        Students student2 = new Students();
        student2.studentId = 1031;
        student2.studentName = "Ahmed";
        map.put(1031, student2);

        Students student3 = new Students();
        student3.studentId = 1032;
        student3.studentName = "Balqees";
        map.put(1032, student3);

        Students student4 = new Students();
        student4.studentId = 1033;
        student4.studentName = "Ali";
        map.put(1033, student4);

        Students student5 = new Students();
        student5.studentId = 1034;
        student5.studentName = "Hamed";
        map.put(1034, student5);
    }
    public static String retrieveStudentName(Map<Integer, Students> map, Integer studentId){
        Students student = map.get(studentId);
        if (student != null) {
            return student.studentName;
        } else {
            return "Student not found";
        }
    }


}
