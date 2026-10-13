package entity;

public class Student {
    private int studentId;
    private String studentName;
    private String department;
    private String email;
    private String phoneNumber;
    private double gpa;

    public Student(int studentId, String studentName, String department,
                   String email, String phoneNumber, double gpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    public Student() {}

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
