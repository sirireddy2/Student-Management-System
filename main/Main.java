
package main;

import entity.Student;
import java.util.List;
import java.util.Scanner;
import service.StudentService;
import serviceimpl.StudentServiceImpl;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentServiceImpl();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();

                    Student student = new Student(
                            0, name, department, email, phone, gpa
                    );

                    service.addStudent(student);
                    break;

                case 2:
                    System.out.println("\n--- All Students ---");
                    List<Student> students = service.getAllStudents();

                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        students.forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    Student found = service.getStudentById(searchId);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    Student existing = service.getStudentById(updateId);

                    if (existing == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new department: ");
                    String newDepartment = sc.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();

                    System.out.print("Enter new phone number: ");
                    String newPhone = sc.nextLine();

                    System.out.print("Enter new GPA: ");
                    double newGpa = sc.nextDouble();
                    sc.nextLine();

                    Student updated = new Student(
                            updateId, newName, newDepartment,
                            newEmail, newPhone, newGpa
                    );

                    service.updateStudent(updated);
                    break;

                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();

                    Student toDelete = service.getStudentById(deleteId);

                    if (toDelete != null) {
                        service.deleteStudent(deleteId);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.println("Program End. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
