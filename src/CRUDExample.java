import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDExample {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student = new Student(id, name, age);
        studentList.add(student);

        System.out.println("Student added successfully!\n");
    }

    private static void viewStudents() {
        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();
    }

    private static void updateStudent() {
        System.out.print("Enter the ID of the student to update: ");
        String idToUpdate = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getId().equals(idToUpdate)) {
                System.out.print("Enter new Student Name: ");
                String newName = scanner.nextLine();
                student.setName(newName);

                System.out.print("Enter new Student Age: ");
                int newAge = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                student.setAge(newAge);

                System.out.println("Student updated successfully!\n");
                return;
            }
        }

        System.out.println("Student not found with ID: " + idToUpdate + "\n");
    }

    private static void deleteStudent() {
        System.out.print("Enter the ID of the student to delete: ");
        String idToDelete = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getId().equals(idToDelete)) {
                studentList.remove(student);
                System.out.println("Student deleted successfully!\n");
                return;
            }
        }

        System.out.println("Student not found with ID: " + idToDelete + "\n");
    }
}
