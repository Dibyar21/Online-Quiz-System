package myPackage;

import java.util.Scanner;

public class Quiz {

    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {

        if (questions == null || questions.length == 0) {
            throw new IllegalArgumentException(
                "Quiz must contain at least one question."
            );
        }

        this.questions = questions;
        this.score = 0;
    }

    public void start(Student student) {

        Scanner sc = new Scanner(System.in);

        score = 0;

        System.out.println("\n============================================");
        System.out.println("              ONLINE QUIZ SYSTEM");
        System.out.println("============================================");

        System.out.println("Welcome, " + student.getName() + "!");
        System.out.println("Registration No. : "
                + student.getRegistrationNumber());

        System.out.println("--------------------------------------------");
        System.out.println("Total Questions  : " + questions.length);
        System.out.println("============================================");

        for (int i = 0; i < questions.length; i++) {

            Question question = questions[i];

            System.out.println("\nQuestion " + (i + 1) + " of "
                    + questions.length);

            System.out.println("--------------------------------------------");
            System.out.println(question.getQuestionText());

            String[] options = question.getOptions();

            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            int answer = getValidAnswer(sc, options.length);

            if (answer - 1 == question.getCorrectAnswerIndex()) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer!");
            }
        }

        QuizResult result = new QuizResult(
                questions.length,
                score
        );

        result.displayResult(student);

        System.out.println("\nThank you for participating!");
    }

    private int getValidAnswer(Scanner sc, int numberOfOptions) {

        while (true) {

            System.out.print("\nEnter your answer (1-"
                    + numberOfOptions + "): ");

            if (sc.hasNextInt()) {

                int answer = sc.nextInt();

                if (answer >= 1 && answer <= numberOfOptions) {
                    return answer;
                }

                System.out.println(
                    "Invalid option! Please enter a number between "
                    + "1 and " + numberOfOptions + "."
                );

            } else {

                System.out.println(
                    "Invalid input! Please enter a number."
                );

                sc.next();
            }
        }
    }
}
