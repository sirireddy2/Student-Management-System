# Student Management System

A simple **Student Management System** developed using Java and MySQL to manage student records efficiently. This project demonstrates Java programming, database connectivity using JDBC, and CRUD operations.

## 📌 Project Overview

The Student Management System is a console-based application that allows users to manage student information through a menu-driven interface. It connects to a MySQL database to store and retrieve student records.

## ✨ Features

- **Add Student** – Add new student details to the database.
- **View All Students** – Display all registered student records.
- **Search Student** – Find a student using their ID.
- **Update Student** – Modify existing student information.
- **Delete Student** – Remove a student record from the database.
- **MySQL Connectivity** – Store and manage student data persistently.

## 🛠️ Technologies Used

- Java
- MySQL
- JDBC (Java Database Connectivity)
- MySQL Connector/J
- Visual Studio Code
- Git and GitHub

## 📂 Project Structure

```text
Student-Management-System/
├── main/
│   └── Main.java
├── entity/
│   └── Student.java
├── service/
│   └── StudentService.java
├── serviceimpl/
│   └── StudentServiceImpl.java
├── run.ps1
├── .gitignore
└── README.md
```

*Note: The exact folder structure may vary depending on the project setup.*

## ⚙️ Prerequisites

Before running the project, make sure you have installed:

- Java JDK
- MySQL Server
- Visual Studio Code
- MySQL Connector/J

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/sirireddy2/Student-Management-System.git
   ```

2. Open the project folder in Visual Studio Code.

3. Start your MySQL Server and create the required database and student table according to the project configuration.

4. Configure the database connection details in the database connection class.

5. Ensure the MySQL Connector/J `.jar` file is available in the project folder.

6. Open the terminal in the project directory and run:

   ```powershell
   .\run.ps1
   ```

7. Use the menu displayed in the terminal to manage student records.

## 🧑‍💻 Application Menu

```text
===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Exit
```

## 🎯 Learning Outcomes

- Understanding Java classes, objects, and packages.
- Implementing CRUD operations.
- Connecting Java applications to MySQL using JDBC.
- Managing student records using database queries.
- Running and maintaining Java projects in VS Code.
- Using Git and GitHub for version control.

## 👩‍💻 Author

Siri Reddy

B.Tech – Computer Science and Engineering (AI & ML)

