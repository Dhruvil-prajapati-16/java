import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a new HashMap to store student data (enrollment number as key and name as value)
        Map<Integer, String> studentMap = new HashMap<>();

        // Add 5 students' data to the HashMap
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");

        // Retrieve and display a student's name using enrollment number
        int enrolmentNumber = 103; // Example enrolment number
        String studentName = studentMap.get(enrolmentNumber);
        if (studentName != null) {
            System.out.println("Student with enrollment number " + enrolmentNumber + " is: " + studentName);
        } else {
            System.out.println("Student with enrollment number " + enrolmentNumber + " not found.");
        }
    }
}
