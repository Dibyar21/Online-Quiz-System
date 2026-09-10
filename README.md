# 📝 Online Quiz System

A console-based **Online Quiz System** developed using **Java** and **Object-Oriented Programming (OOP)** concepts.

This application allows students to register, attempt multiple-choice questions, and receive an automatically calculated result including score, percentage, grade, and pass/fail status.

---

## 📌 Project Overview

The Online Quiz System is a Java-based console application designed to simulate a simple online examination system.

The project demonstrates the practical implementation of Java programming concepts such as:

- Object-Oriented Programming
- Classes and Objects
- Encapsulation
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

- 👨‍🎓 Student registration
- 📝 Multiple-choice questions
- 📚 30-question question bank
- 🔢 Dynamic question numbering
- ✅ Automatic answer verification
- 📊 Automatic score calculation
- 📈 Percentage calculation
- 🏆 Grade calculation
- ✔️ Pass/Fail evaluation
- ❌ Correct and wrong answer count
- ⚠️ Input validation
- 🛡️ Exception handling
- 🔄 Menu-driven application
- 💻 Simple and user-friendly console interface
- 🧩 Modular OOP-based class structure

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Core programming language |
| OOP | Application architecture |
| Arrays | Storing questions and options |
| Scanner | Taking user input |
| Exception Handling | Handling invalid data |
| Git | Version control |
| GitHub | Source code hosting |

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

---

### 📄 File Description

| File | Description |
|------|-------------|
| `Final.java` | Main class containing the application menu, student registration, and quiz setup |
| `Student.java` | Stores and manages student information |
| `Question.java` | Represents quiz questions, options, and correct answers |
| `Quiz.java` | Controls quiz execution and answer validation |
| `QuizResult.java` | Calculates and displays the final quiz result |
| `.gitignore` | Specifies files that should not be tracked by Git |

---

## 🧠 OOP Concepts Used

### Encapsulation

The project uses private fields to protect the internal data of classes.

```java
private String name;
private String registrationNumber;
