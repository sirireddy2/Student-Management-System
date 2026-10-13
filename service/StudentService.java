package service;

import entity.Student;
import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    boolean updateStudent(Student student);

    boolean deleteStudent(int id);
}
