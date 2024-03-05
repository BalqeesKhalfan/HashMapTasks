import java.util.HashMap;
import java.util.Map;

public class CompareHashMaps {

    public static void main(String[] args) {
        // Create the first HashMap
        Map<Integer, String> studentMapOne= new HashMap<>();
        // Add entries to the first HashMap
        studentMapOne.put(1, "Ali");
        studentMapOne.put(2, "Ahmed");
        studentMapOne.put(3, "Hamed");

        // Create the second HashMap
        Map<Integer, String> studentMapTwo = new HashMap<>();
        // Add entries to the second HashMap
        studentMapTwo.put(1, "Ali");
        studentMapTwo.put(2, "Ahmed");
        studentMapTwo.put(3, "Hamed");

        // Check if the two HashMaps are equal
        boolean isEqual = studentMapOne.equals(studentMapTwo);

        // Print the result
        System.out.println("Are the two HashMaps equal? " + isEqual);
    }
}
