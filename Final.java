package myPackage;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        System.out.println("\n============================================");
        System.out.println("          WELCOME TO ONLINE QUIZ");
        System.out.println("============================================");

        while (running) {

            displayMenu();

            int choice = getMenuChoice(sc);

            switch (choice) {

                case 1:
                    startQuiz(sc);
                    break;

                case 2:
                    running = false;
                    System.out.println("\nThank you for using Online Quiz System!");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println(
                        "\nInvalid choice! Please select 1 or 2."
                    );
            }
        }

        sc.close();
    }

    private static void displayMenu() {

        System.out.println("\n-------------- MAIN MENU --------------");
        System.out.println("1. Start Quiz");
        System.out.println("2. Exit");
        System.out.println("---------------------------------------");
    }

    private static int getMenuChoice(Scanner sc) {

        while (true) {

            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {

                return sc.nextInt();

            } else {

                System.out.println(
                    "Invalid input! Please enter a number."
                );

                sc.next();
            }
        }
    }

    private static void startQuiz(Scanner sc) {

        sc.nextLine();

        System.out.println("\n============================================");
        System.out.println("           STUDENT REGISTRATION");
        System.out.println("============================================");

        String name;

        while (true) {

            System.out.print("Enter your name: ");
            name = sc.nextLine().trim();

            if (!name.isEmpty()) {
                break;
            }

            System.out.println(
                "Name cannot be empty. Please try again."
            );
        }

        String registrationNumber;

        while (true) {

            System.out.print("Enter your registration number: ");
            registrationNumber = sc.nextLine().trim();

            if (!registrationNumber.isEmpty()) {
                break;
            }

            System.out.println(
                "Registration number cannot be empty. Please try again."
            );
        }

        Student student;

        try {

            student = new Student(name, registrationNumber);

        } catch (IllegalArgumentException e) {

            System.out.println(
                "\nError creating student: " + e.getMessage()
            );

            return;
        }

        Question[] questions = createQuestions();

        try {

            Quiz quiz = new Quiz(questions);
            quiz.start(student);

        } catch (IllegalArgumentException e) {

            System.out.println(
                "\nUnable to start quiz: " + e.getMessage()
            );
        }
    }

    private static Question[] createQuestions() {

        return new Question[] {

            new Question(
                "What is the capital of India?",
                new String[] {
                    "Mumbai",
                    "New Delhi",
                    "Odisha",
                    "Goa"
                },
                1
            ),

            new Question(
                "Java was developed by _____?",
                new String[] {
                    "Charles Babbage",
                    "Steve Jobs",
                    "James Gosling",
                    "Satya Nadella"
                },
                2
            ),

            new Question(
                "What is the largest continent on Earth?",
                new String[] {
                    "Africa",
                    "Asia",
                    "Australia",
                    "North America"
                },
                1
            ),

            new Question(
                "Which component is used to convert a Java program to bytecode?",
                new String[] {
                    "JDK",
                    "Interpreter",
                    "JVM",
                    "Compiler"
                },
                3
            ),

            new Question(
                "Java is a platform-independent language.",
                new String[] {
                    "True",
                    "False"
                },
                0
            ),

            new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[] {
                    "implements",
                    "extends",
                    "inherits",
                    "super"
                },
                1
            ),

            new Question(
                "Which of these is not a primitive data type in Java?",
                new String[] {
                    "int",
                    "float",
                    "String",
                    "char"
                },
                2
            ),

            new Question(
                "Which method is the entry point of a Java program?",
                new String[] {
                    "start()",
                    "run()",
                    "main()",
                    "execute()"
                },
                2
            ),

            new Question(
                "Which keyword is used to create an object in Java?",
                new String[] {
                    "class",
                    "object",
                    "new",
                    "create"
                },
                2
            ),

            new Question(
                "Which collection does not allow duplicate elements?",
                new String[] {
                    "List",
                    "ArrayList",
                    "Set",
                    "Queue"
                },
                2
            ),

            new Question(
                "Which keyword is used to handle exceptions?",
                new String[] {
                    "try",
                    "check",
                    "error",
                    "exception"
                },
                0
            ),

            new Question(
                "Which concept allows a class to have multiple methods with the same name?",
                new String[] {
                    "Inheritance",
                    "Encapsulation",
                    "Method Overloading",
                    "Abstraction"
                },
                2
            ),

            new Question(
                "Which keyword prevents a variable from being modified?",
                new String[] {
                    "static",
                    "final",
                    "constant",
                    "private"
                },
                1
            ),

            new Question(
                "Which data structure follows LIFO principle?",
                new String[] {
                    "Queue",
                    "Stack",
                    "Array",
                    "Linked List"
                },
                1
            ),

            new Question(
                "Which data structure follows FIFO principle?",
                new String[] {
                    "Stack",
                    "Tree",
                    "Queue",
                    "Graph"
                },
                2
            ),

            new Question(
                "Which algorithm is commonly used for finding the shortest path?",
                new String[] {
                    "Bubble Sort",
                    "Dijkstra's Algorithm",
                    "Binary Search",
                    "Merge Sort"
                },
                1
            ),

            new Question(
                "What is the time complexity of binary search?",
                new String[] {
                    "O(n)",
                    "O(n²)",
                    "O(log n)",
                    "O(1)"
                },
                2
            ),

            new Question(
                "Which sorting algorithm uses the divide-and-conquer technique?",
                new String[] {
                    "Bubble Sort",
                    "Selection Sort",
                    "Merge Sort",
                    "Linear Search"
                },
                2
            ),

            new Question(
                "Which data structure is used in Breadth First Search?",
                new String[] {
                    "Stack",
                    "Queue",
                    "Array",
                    "Heap"
                },
                1
            ),

            new Question(
                "Which data structure is commonly used in Depth First Search?",
                new String[] {
                    "Queue",
                    "Stack",
                    "HashMap",
                    "Heap"
                },
                1
            ),

            new Question(
                "What does CPU stand for?",
                new String[] {
                    "Central Processing Unit",
                    "Computer Processing Unit",
                    "Central Program Unit",
                    "Control Processing Unit"
                },
                0
            ),

            new Question(
                "Which language is primarily used for styling web pages?",
                new String[] {
                    "HTML",
                    "Python",
                    "CSS",
                    "Java"
                },
                2
            ),

            new Question(
                "Which language is used to add interactivity to web pages?",
                new String[] {
                    "HTML",
                    "CSS",
                    "JavaScript",
                    "SQL"
                },
                2
            ),

            new Question(
                "What does SQL stand for?",
                new String[] {
                    "Structured Query Language",
                    "Simple Query Language",
                    "System Query Language",
                    "Sequential Query Language"
                },
                0
            ),

            new Question(
                "Which of the following is a version control system?",
                new String[] {
                    "Git",
                    "Java",
                    "MySQL",
                    "React"
                },
                0
            ),

            new Question(
                "Which platform is widely used for hosting Git repositories?",
                new String[] {
                    "GitHub",
                    "Google",
                    "Wikipedia",
                    "Stack Overflow"
                },
                0
            ),
            new Question(
            "Which keyword is used to define a class in Java?",
                new String[] {
                    "define",
                    "class",
                    "struct",
                    "object"
                },
                1
            ),

            new Question(
                "Which of the following is an example of an operating system?",
                new String[] {
                    "Oracle",
                    "Windows",
                    "Python",
                    "MySQL"
                },
                1
            ),

            new Question(
                "Which data structure stores data in key-value pairs?",
                new String[] {
                    "Array",
                    "Stack",
                    "HashMap",
                    "Queue"
                },
                2
            ),

            new Question(
                "What does HTML stand for?",
                new String[] {
                    "Hyper Text Markup Language",
                    "High Text Machine Language",
                    "Hyperlink Text Management Language",
                    "Home Tool Markup Language"
                },
                0
            )
        };
    }
}
