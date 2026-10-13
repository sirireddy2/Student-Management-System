# 🎓 Student Management System

A Java console application to manage student records using **JDBC**, **DAO pattern**, and **Service Layer** with MySQL database.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Database | MySQL |
| Connectivity | JDBC |
| Pattern | DAO + Service Layer |
| IDE | Eclipse |

---

## 📂 Project Structure

```
StudentManagement/
├── connection/
│   └── DBConnection.java         → MySQL database connection
├── entity/
│   └── Student.java              → Student model class
├── dao/
│   └── StudentDAO.java           → DAO interface
├── service/
│   └── StudentService.java       → Service interface
├── serviceimpl/
│   ├── StudentDAOImpl.java       → JDBC CRUD implementation
│   └── StudentServiceImpl.java   → Service layer implementation
├── main/
│   └── Main.java                 → Main program entry point
└── student_db.sql                → MySQL database setup script
```

---

## ✨ Features

- ➕ Add new student
- 📋 View all students
- 🔍 Search student by ID
- ✏️ Update student details
- 🗑️ Delete student

---

## ⚙️ How to Run

**Step 1 — Setup Database:**
```sql
-- Run this in MySQL Workbench or terminal
source student_db.sql
```

**Step 2 — Update DB credentials in `DBConnection.java`:**
```java
private static final String URL = "jdbc:mysql://localhost:3306/student_db";
private static final String USERNAME = "root";
private static final String PASSWORD = "your_password";  // ← change this
```

**Step 3 — Add MySQL connector JAR** to your project build path

**Step 4 — Run `Main.java`**

---

## 👩‍💻 Developer

Made with ❤️ by [suma-dev-12](https://github.com/suma-dev-12)
