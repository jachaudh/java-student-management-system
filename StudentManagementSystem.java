import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Course> courses = new ArrayList<>();
    private static ArrayList<Grade> grades = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        courses.add(new Course("JAVA101", "Java Programming"));
        courses.add(new Course("DBMS101", "Database Management"));
        courses.add(new Course("NET101", "Computer Networks"));

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Add Grade");
            System.out.println("5. View Grades");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    addGrade();
                    break;
                case 5:
                    viewGrades();
                    break;
                case 6:
                    System.out.println("Exiting system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Program Name: ");
        String program = scanner.nextLine();

        students.add(new Student(id, name, program));
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getStudentId() == id) {
                System.out.println("Student found: " + student);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    private static void addGrade() {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();

        grades.add(new Grade(studentId, courseCode, grade));
        System.out.println("Grade added successfully.");
    }

    private static void viewGrades() {
        if (grades.isEmpty()) {
            System.out.println("No grades found.");
            return;
        }

        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }
}
