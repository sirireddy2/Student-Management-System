-- 🗄️ Create Database
CREATE DATABASE IF NOT EXISTS student_db;
USE student_db;

-- 📋 Create Students Table
CREATE TABLE IF NOT EXISTS students (
    student_id    INT PRIMARY KEY AUTO_INCREMENT,
    student_name  VARCHAR(100) NOT NULL,
    department    VARCHAR(100) NOT NULL,
    email         VARCHAR(100) UNIQUE NOT NULL,
    phone_number  VARCHAR(15),
    gpa           DOUBLE
);

-- 🧪 Sample Data (Optional)
INSERT INTO students (student_name, department, email, phone_number, gpa) VALUES
('Suma', 'Computer Science', 'suma@email.com', '9876543210', 9.2),
('Ravi', 'Electronics', 'ravi@email.com', '9123456780', 8.5),
('Priya', 'Mechanical', 'priya@email.com', '9988776655', 7.8);
