package serviceimpl;

import connection.DBConnection;
import dao.StudentDAO;
import entity.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private Connection connection;

    public StudentDAOImpl() {
        this.connection = DBConnection.getConnection();
    }

    // Add a new student
    @Override
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (student_name, department, email, phone_number, gpa) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhoneNumber());
            ps.setDouble(5, student.getGpa());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student added successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    // Get all students
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("department"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getDouble("gpa")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println(" Error fetching students: " + e.getMessage());
        }
        return students;
    }

    // Get student by ID
    @Override
    public Student getStudentById(int id) {
        Student student = null;
        String sql = "SELECT * FROM students WHERE student_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                student = new Student(
                        rs.getInt("student_id"),
                        rs.getString("student_name"),
                        rs.getString("department"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getDouble("gpa")
                );
            } else {
                System.out.println(" Student with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println(" Error fetching student: " + e.getMessage());
        }
        return student;
    }

    //  Update student
    @Override
    public boolean updateStudent(Student student) {
        String sql = "UPDATE students SET student_name=?, department=?, email=?, phone_number=?, gpa=? WHERE student_id=?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhoneNumber());
            ps.setDouble(5, student.getGpa());
            ps.setInt(6, student.getStudentId());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println(" Student updated successfully!");
                return true;
            }
        } catch (SQLException e) {
            System.out.println(" Error updating student: " + e.getMessage());
        }
        return false;
    }

    //  Delete student
    @Override
    public boolean deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println(" Student deleted successfully!");
                return true;
            } else {
                System.out.println(" Student with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println(" Error deleting student: " + e.getMessage());
        }
        return false;
    }
}
