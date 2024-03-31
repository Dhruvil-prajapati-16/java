import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String enrollment;
    private String name;
    private String dob;
    private String phoneNumber;
    private String present1No;
    private String present2No;
    private String address;
    private String studentClass;
    private String department;
    private String batch;
    private int currentTerm;
    private int backlog;
    private double lastSemesterAvgScore;
    private double totalSemesterAvgScore;

    // Constructor
    public Student(String enrollment, String name, String dob, String phoneNumber, String present1No, String present2No,
                   String address, String studentClass, String department, String batch, int currentTerm, int backlog,
                   double lastSemesterAvgScore, double totalSemesterAvgScore) {
        this.enrollment = enrollment;
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.present1No = present1No;
        this.present2No = present2No;
        this.address = address;
        this.studentClass = studentClass;
        this.department = department;
        this.batch = batch;
        this.currentTerm = currentTerm;
        this.backlog = backlog;
        this.lastSemesterAvgScore = lastSemesterAvgScore;
        this.totalSemesterAvgScore = totalSemesterAvgScore;
    }

    // Getter for enrollment
    public String getEnrollment() {
        return enrollment;
    }

    // Getters and setters for other fields
    // Implement as needed

    // Override toString() method to display student details
    @Override
    public String toString() {
        return String.format("Enrollment: %s\nName: %s\nDOB: %s\nPhone Number: %s\nPresent 1 No: %s\nPresent 2 No: %s\nAddress: %s\nClass: %s\nDepartment: %s\nBatch: %s\nCurrent Term: %d\nBacklog: %d\nLast Semester Avg Score: %.2f\nTotal Semester Avg Score: %.2f\n",
                enrollment, name, dob, phoneNumber, present1No, present2No, address, studentClass, department, batch,
                currentTerm, backlog, lastSemesterAvgScore, totalSemesterAvgScore);
    }
}

public class StudentRecords {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "student_records.ser";

    public static void main(String[] args) {
        loadRecords(); // Load previous records if available
        int choice;
        do {
            System.out.println("1. Register Student");
            System.out.println("2. Modify Student Record");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Display All Students");
            System.out.println("6. Fetch Specific Student Details in Excel");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    // Implement modify student record
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    // Implement delete student record
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    // Implement fetch specific student details in Excel
                    break;
                case 7:
                    saveRecords(); // Save records before exiting
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
    }

    private static void registerStudent() {
        System.out.println("Enter Student Details:");
        System.out.print("Enrollment: ");
        String enrollment = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("DOB: ");
        String dob = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Present 1 No: ");
        String present1No = scanner.nextLine();
        System.out.print("Present 2 No: ");
        String present2No = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Class: ");
        String studentClass = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Batch: ");
        String batch = scanner.nextLine();
        System.out.print("Current Term: ");
        int currentTerm = scanner.nextInt();
        System.out.print("Backlog: ");
        int backlog = scanner.nextInt();
        System.out.print("Last Semester Avg Score: ");
        double lastSemesterAvgScore = scanner.nextDouble();
        System.out.print("Total Semester Avg Score: ");
        double totalSemesterAvgScore = scanner.nextDouble();

        Student student = new Student(enrollment, name, dob, phoneNumber, present1No, present2No, address,
                studentClass, department, batch, currentTerm, backlog, lastSemesterAvgScore, totalSemesterAvgScore);
        students.add(student);
        System.out.println("Student registered successfully!");
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudent() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out.print("Enter enrollment number to search: ");
        String enrollment = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getEnrollment().equalsIgnoreCase(enrollment)) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with enrollment number " + enrollment + " not found.");
        }
    }

    private static void saveRecords() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(students);
            out.close();
            System.out.println("Student records saved successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving student records: " + e.getMessage());
        }
    }

    private static void loadRecords() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            students = (List<Student>) in.readObject();
            in.close();
            System.out.println("Student records loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous records found.");
        }
    }
}
