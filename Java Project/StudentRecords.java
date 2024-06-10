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

    // Getters and setters
    public String getEnrollment() {
        return enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPresent1No() {
        return present1No;
    }

    public void setPresent1No(String present1No) {
        this.present1No = present1No;
    }

    public String getPresent2No() {
        return present2No;
    }

    public void setPresent2No(String present2No) {
        this.present2No = present2No;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(int currentTerm) {
        this.currentTerm = currentTerm;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public double getLastSemesterAvgScore() {
        return lastSemesterAvgScore;
    }

    public void setLastSemesterAvgScore(double lastSemesterAvgScore) {
        this.lastSemesterAvgScore = lastSemesterAvgScore;
    }

    public double getTotalSemesterAvgScore() {
        return totalSemesterAvgScore;
    }

    public void setTotalSemesterAvgScore(double totalSemesterAvgScore) {
        this.totalSemesterAvgScore = totalSemesterAvgScore;
    }

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
    private static final String STUDENT_DATA = "student_records.ser";

    public static void main(String[] args) {
        loadRecords(); // Load previous records if available
        int choice;
        do {
            System.out.println("1. Register Student");
            System.out.println("2. Modify Student Record");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    modifyStudentRecord();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudentRecord();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    saveRecords(); // Save records before exiting
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 6);
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
        scanner.nextLine(); 

        Student student = new Student(enrollment, name, dob, phoneNumber, present1No, present2No, address,
                studentClass, department, batch, currentTerm, backlog, lastSemesterAvgScore, totalSemesterAvgScore);
        students.add(student);
        System.out.println("Student registered successfully!");
    }

    private static void modifyStudentRecord() {
        System.out.print("Enter enrollment number of the student to modify: ");
        String enrollment = scanner.nextLine();
        Student student = null;

        for (Student s : students) {
            if (s.getEnrollment().equalsIgnoreCase(enrollment)) {
                student = s;
                break;
            }
        }

        if (student == null) {
            System.out.println("Student with enrollment number " + enrollment + " not found.");
            return;
        }

        System.out.println("Modifying details for student: " + student.getEnrollment());
        System.out.println("Leave a field empty to keep the current value.");

        System.out.print("Name (" + student.getName() + "): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) student.setName(name);

        System.out.print("DOB (" + student.getDob() + "): ");
        String dob = scanner.nextLine();
        if (!dob.isEmpty()) student.setDob(dob);

        System.out.print("Phone Number (" + student.getPhoneNumber() + "): ");
        String phoneNumber = scanner.nextLine();
        if (!phoneNumber.isEmpty()) student.setPhoneNumber(phoneNumber);

        System.out.print("Present 1 No (" + student.getPresent1No() + "): ");
        String present1No = scanner.nextLine();
        if (!present1No.isEmpty()) student.setPresent1No(present1No);

        System.out.print("Present 2 No (" + student.getPresent2No() + "): ");
        String present2No = scanner.nextLine();
        if (!present2No.isEmpty()) student.setPresent2No(present2No);

        System.out.print("Address (" + student.getAddress() + "): ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) student.setAddress(address);

        System.out.print("Class (" + student.getStudentClass() + "): ");
        String studentClass = scanner.nextLine();
        if (!studentClass.isEmpty()) student.setStudentClass(studentClass);

        System.out.print("Department (" + student.getDepartment() + "): ");
        String department = scanner.nextLine();
        if (!department.isEmpty()) student.setDepartment(department);

        System.out.print("Batch (" + student.getBatch() + "): ");
        String batch = scanner.nextLine();
        if (!batch.isEmpty()) student.setBatch(batch);

        System.out.print("Current Term (" + student.getCurrentTerm() + "): ");
        String currentTerm = scanner.nextLine();
        if (!currentTerm.isEmpty()) student.setCurrentTerm(Integer.parseInt(currentTerm));

        System.out.print("Backlog (" + student.getBacklog() + "): ");
        String backlog = scanner.nextLine();
        if (!backlog.isEmpty()) student.setBacklog(Integer.parseInt(backlog));

        System.out.print("Last Semester Avg Score (" + student.getLastSemesterAvgScore() + "): ");
        String lastSemesterAvgScore = scanner.nextLine();
        if (!lastSemesterAvgScore.isEmpty()) student.setLastSemesterAvgScore(Double.parseDouble(lastSemesterAvgScore));

        System.out.print("Total Semester Avg Score (" + student.getTotalSemesterAvgScore() + "): ");
        String totalSemesterAvgScore = scanner.nextLine();
        if (!totalSemesterAvgScore.isEmpty()) student.setTotalSemesterAvgScore(Double.parseDouble(totalSemesterAvgScore));

        System.out.println("Student record updated successfully!");
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
    private static void deleteStudentRecord() {
        if (students.isEmpty()) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out.print("Enter enrollment number of the student to delete: ");
        String enrollment = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getEnrollment().equalsIgnoreCase(enrollment)) {
                students.remove(student);
                System.out.println("Student with enrollment number " + enrollment + " deleted successfully.");
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
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(STUDENT_DATA));
            out.writeObject(students);
            out.close();
            System.out.println("Student records saved successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving student records: " + e.getMessage());
        }
    }
    // @SuppressWarnings("unchecked")
    private static void loadRecords() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(STUDENT_DATA));
            students = (List<Student>) in.readObject();
            in.close();
            System.out.println("Student records loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous records found.");
        }
    }
}
