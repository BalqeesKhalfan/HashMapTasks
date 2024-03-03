import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public  static void  main(String[] args){

        HashMap<Integer,String> studentMap=new HashMap<>();
        // Add student entries to the HashMap
        studentMap.put(1030, "Asma");
        studentMap.put(1031, "Ahmed");
        studentMap.put(1032, "Balqees");
        studentMap.put(1033, "Ali");
        studentMap.put(1034, "Hamed");
        System.out.println("Student HashMap:");//Print the entire HashMap to verify the entries
        // loop for printing all the hash map have recoded
        for (Map.Entry<Integer, String> record: studentMap.entrySet()) {
            System.out.println("Student ID: " + record.getKey() + ", Name: " + record.getValue());
        }
    }
}
