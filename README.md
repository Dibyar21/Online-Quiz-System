# 📝 Online Quiz System

A console-based **Online Quiz System** developed using **Java** and **Object-Oriented Programming (OOP)** concepts.

This application allows students to register, attempt multiple-choice questions, and receive an automatically calculated result including **score, percentage, grade, correct/wrong answer count, and pass/fail status**.

---

## 📌 Project Overview

The **Online Quiz System** is a Java-based console application designed to simulate a simple online examination system.

The project demonstrates the practical implementation of Java programming concepts such as:

- Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Abstraction
- Constructors
- Arrays
- Exception Handling
- Input Validation
- Conditional Statements
- Loops
- Modular Programming

The quiz currently contains **30 multiple-choice questions** covering different areas of Computer Science and programming.

---

## ✨ Features

- 👨‍🎓 Student Registration
- 📝 Multiple-Choice Questions
- 📚 30-Question Question Bank
- 🔢 Dynamic Question Numbering
- ✅ Automatic Answer Verification
- 📊 Automatic Score Calculation
- 📈 Percentage Calculation
- 🏆 Grade Calculation
- ✔️ Pass/Fail Evaluation
- ❌ Correct and Wrong Answer Count
- ⚠️ Input Validation
- 🛡️ Exception Handling
- 🔄 Menu-Driven Application
- 💻 Simple and User-Friendly Console Interface
- 🧩 Modular OOP-Based Class Structure

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| **Java** | Core programming language |
| **OOP** | Application architecture |
| **Arrays** | Storing questions and options |
| **Scanner** | Taking user input |
| **Exception Handling** | Handling invalid data |
| **Git** | Version control |
| **GitHub** | Source code hosting |

---

## 📂 Project Structure

```text
Online-Quiz-System/
│
├── .gitignore
├── Final.java
├── Question.java
├── Quiz.java
├── QuizResult.java
├── Student.java
└── README.md
```

---

## 📄 File Description
### File	Description
- Final.java -  Main class containing the application menu, student registration, and quiz setup
Student.java -  Stores and manages student information
Question.java -  Represents quiz questions, options, and correct answers
Quiz.java -  Controls quiz execution and answer validation
QuizResult.java -  Calculates and displays the final quiz result
.gitignore -  Specifies files that should not be tracked by Git
README.md  -  Contains project documentation

## 🧠 OOP Concepts Used
### Encapsulation

The project uses private fields to protect the internal data of classes.

private String name;
private String registrationNumber;

Getter methods are used to access the required information.

### Abstraction

Different responsibilities are separated into different classes:

Class	Responsibility
Student	Student information
Question	Question and answer information
Quiz	Quiz execution and answer validation
QuizResult	Result calculation and display
Final	Application control and menu

This separation helps keep the application organized and easier to maintain.

### Constructors

Constructors are used to initialize objects with the required information.

Student student = new Student(name, registrationNumber);
Modular Design

The application is divided into multiple classes, making the code easier to:

Understand
Maintain
Debug
Modify
Extend

## 📊 Grading System
Percentage	Grade	Result
90% - 100%  O  PASS
80% - 89%   E  PASS
60% - 79%  	A  PASS
40% - 59%  	B  PASS
Below 40%  	F  FAIL

The percentage, grade, and pass/fail status are calculated automatically based on the user's performance.

## 🚀 How to Run
Prerequisites

Make sure Java JDK is installed on your system.

Check the Java version:

java --version

Check the Java compiler:

javac --version

Clone the Repository
git clone https://github.com/Dibyar21/Online-Quiz-System.git

Navigate to the Project
cd Online-Quiz-System

Compile the Project
javac -d . *.java

Run the Application
java myPackage.Final

## 🖥️ Sample Workflow
============================================
          WELCOME TO ONLINE QUIZ
============================================

-------------- MAIN MENU --------------
1. Start Quiz
2. Exit
---------------------------------------
Enter your choice: 1

============================================
           STUDENT REGISTRATION
============================================

Enter your name: Dibyar
Enter your registration number: CSE001

The application then displays the quiz questions and options.

Question 1 of 30
--------------------------------------------
What is the capital of India?

1. Mumbai
2. New Delhi
3. Odisha
4. Goa

Enter your answer (1-4):
📈 Sample Result
============================================
              QUIZ RESULT
============================================

Student Name       : Dibyar
Registration No.   : CSE001

--------------------------------------------

Total Questions    : 30
Correct Answers    : 24
Wrong Answers      : 6
Percentage         : 80.00%
Grade              : E

--------------------------------------------

Result             : PASS
Congratulations! You performed well.

============================================

## 🔮 Future Enhancements

The project can be further improved with:

🔀 Randomized Questions
🔀 Randomized Answer Options
⏱️ Quiz Timer
🔁 Retry Quiz Option
📚 Multiple Quiz Categories
💾 Save Results to a File
🏆 Leaderboard
📊 Performance History
🗄️ Database Integration
🔐 User Authentication
🖥️ Graphical User Interface
🌐 Web-Based Version
👨‍💼 Admin Panel for Question Management
🎯 Learning Objective

This project was developed to gain practical experience in Java programming and Object-Oriented Programming.

It demonstrates how classes, objects, encapsulation, abstraction, constructors, arrays, exception handling, input validation, and modular programming can be combined to build a functional console-based application.

## 👨‍💻 Author

Dibyaranjan Jena

## GitHub:
https://github.com/Dibyar21

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐.

## 📄 License

This project is created for educational and learning purposes.
