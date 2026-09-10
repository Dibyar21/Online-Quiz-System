# 📝 Online Quiz System

A console-based **Online Quiz System** developed using **Java** and **Object-Oriented Programming (OOP)** concepts.

The application allows students to register, attempt multiple-choice questions, and receive an automatically generated result containing their **score, percentage, grade, correct/wrong answers, and pass/fail status**.

---

## 📌 Project Overview

The **Online Quiz System** is a Java-based console application designed to simulate a simple online examination system.

The project demonstrates the practical implementation of core Java programming and OOP concepts, including:

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Constructors
* Arrays
* Methods
* Conditional Statements
* Loops
* Exception Handling
* Input Validation
* Modular Programming

The system currently contains a **30-question multiple-choice question bank** covering different areas of Computer Science and programming.

---

## ✨ Features

* 👨‍🎓 Student Registration
* 📝 Multiple-Choice Questions (MCQs)
* 📚 30-Question Question Bank
* 🔢 Dynamic Question Numbering
* ✅ Automatic Answer Verification
* 📊 Automatic Score Calculation
* 📈 Percentage Calculation
* 🏆 Grade Calculation
* ✔️ Pass/Fail Evaluation
* ✅ Correct Answer Count
* ❌ Wrong Answer Count
* ⚠️ Input Validation
* 🛡️ Exception Handling
* 🔄 Menu-Driven Interface
* 💻 Simple Console-Based User Interface
* 🧩 Modular OOP-Based Class Structure

---

## 🛠️ Technologies Used

| Technology             | Purpose                                 |
| ---------------------- | --------------------------------------- |
| **Java**               | Core programming language               |
| **OOP**                | Application architecture                |
| **Arrays**             | Storing questions, options, and answers |
| **Scanner**            | Taking user input                       |
| **Exception Handling** | Handling invalid input                  |
| **Git**                | Version control                         |
| **GitHub**             | Source code hosting                     |

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

### 📄 File Description

| File              | Description                                                                      |
| ----------------- | -------------------------------------------------------------------------------- |
| `Final.java`      | Main class containing the application menu, student registration, and quiz setup |
| `Student.java`    | Stores and manages student information                                           |
| `Question.java`   | Represents quiz questions, options, and correct answers                          |
| `Quiz.java`       | Controls quiz execution, user responses, and answer validation                   |
| `QuizResult.java` | Calculates score, percentage, grade, and pass/fail status                        |
| `.gitignore`      | Specifies files and folders that should not be tracked by Git                    |
| `README.md`       | Documentation and project information                                            |

---

## 🧠 OOP Concepts Used

### 1. Encapsulation

Private fields are used to protect the internal data of classes, while appropriate methods are used to access or modify the data.

```java
private String name;
private String registrationNumber;
```

---

### 2. Classes and Objects

The application is divided into multiple classes, with each class responsible for a specific part of the system.

For example:

```java
Student student = new Student();
Question question = new Question();
Quiz quiz = new Quiz();
```

---

### 3. Constructors

Constructors are used to initialize objects with the required information.

```java
public Student(String name, String registrationNumber) {
    this.name = name;
    this.registrationNumber = registrationNumber;
}
```

---

### 4. Modular Programming

The system is divided into separate classes such as `Student`, `Question`, `Quiz`, and `QuizResult`.

This makes the application easier to:

* Understand
* Maintain
* Debug
* Modify
* Extend

---

## ⚙️ How the System Works

The application follows a simple quiz workflow:

```text
Start Application
       ↓
Student Registration
       ↓
Display Main Menu
       ↓
Start Quiz
       ↓
Display Questions
       ↓
Take User Answers
       ↓
Validate Answers
       ↓
Calculate Score
       ↓
Calculate Percentage & Grade
       ↓
Display Result
```

---

## ▶️ How to Run

### Prerequisites

Make sure **Java JDK** is installed on your system.

Check the Java version using:

```bash
java -version
```

### Compile the Project

Open the project directory in the terminal and run:

```bash
javac *.java
```

### Run the Application

```bash
java Final
```

---

## 📊 Result Calculation

After completing the quiz, the system automatically calculates:

* Total Questions
* Correct Answers
* Wrong Answers
* Score
* Percentage
* Grade
* Pass/Fail Status

### Example

```text
========================================
           QUIZ RESULT
========================================

Student Name       : Dibya
Registration No.   : 2026001

Total Questions    : 30
Correct Answers    : 24
Wrong Answers      : 6
Score              : 24/30
Percentage         : 80.00%
Grade              : A
Status             : PASS

========================================
```

> **Note:** The displayed grade depends on the grading logic implemented in `QuizResult.java`.

---

## 🛡️ Input Validation & Exception Handling

The application validates user input to prevent invalid entries during registration and quiz execution.

For example, the system can handle situations such as:

* Invalid menu choices
* Invalid question options
* Non-numeric input
* Unexpected user input

Java's **exception handling** mechanism is used to make the application more reliable and prevent unexpected program termination.

---

## 🎯 Learning Objectives

This project was developed to gain practical experience with:

* Java programming
* OOP principles
* Class design
* Object creation
* Data encapsulation
* Arrays and collections of related data
* User input handling
* Exception handling
* Program modularization
* Basic Git and GitHub workflow

---

## 🚀 Future Enhancements

The project can be extended with additional features such as:

* 🗄️ Database integration
* 👥 Multiple student accounts
* 🔐 Login and authentication
* ⏱️ Timer-based quiz
* 🎲 Randomized questions
* 📋 Question categories
* 🏅 Leaderboard
* 📊 Detailed performance reports
* 💾 Storing quiz history
* 🖥️ GUI-based interface using Java Swing or JavaFX
* 🌐 Web-based version of the quiz system

---

## 📌 Project Status

**Status:** ✅ Completed

The current version provides a functional console-based quiz system with student registration, multiple-choice questions, answer validation, automatic result calculation, and exception handling.

---

## 👨‍💻 Author

**Dibyaranjan Jena**

A Java-based academic project demonstrating practical implementation of **Object-Oriented Programming and core Java concepts**.

---

## 📜 License

This project is created for **educational and academic purposes**.
