package myPackage;

public class QuizResult {

    private int totalQuestions;
    private int correctAnswers;
    private int wrongAnswers;
    private double percentage;
    private String grade;
    private boolean passed;

    public QuizResult(int totalQuestions, int correctAnswers) {

        this.totalQuestions = totalQuestions;
        this.correctAnswers = correctAnswers;
        this.wrongAnswers = totalQuestions - correctAnswers;

        calculateResult();
    }

    private void calculateResult() {

        if (totalQuestions == 0) {
            percentage = 0;
            grade = "N/A";
            passed = false;
            return;
        }

        percentage = (correctAnswers * 100.0) / totalQuestions;

        if (percentage >= 90) {
            grade = "O";
            passed = true;
        } else if (percentage >= 80) {
            grade = "E";
            passed = true;
        } else if (percentage >= 60) {
            grade = "A";
            passed = true;
        } else if (percentage >= 40) {
            grade = "B";
            passed = true;
        } else {
            grade = "F";
            passed = false;
        }
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getWrongAnswers() {
        return wrongAnswers;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getGrade() {
        return grade;
    }

    public boolean isPassed() {
        return passed;
    }

    public void displayResult(Student student) {

        System.out.println("\n");
        System.out.println("============================================");
        System.out.println("              QUIZ RESULT");
        System.out.println("============================================");

        System.out.println("Student Name       : " + student.getName());
        System.out.println("Registration No.   : " + student.getRegistrationNumber());

        System.out.println("--------------------------------------------");

        System.out.println("Total Questions    : " + totalQuestions);
        System.out.println("Correct Answers    : " + correctAnswers);
        System.out.println("Wrong Answers      : " + wrongAnswers);
        System.out.printf("Percentage         : %.2f%%\n", percentage);
        System.out.println("Grade              : " + grade);

        System.out.println("--------------------------------------------");

        if (passed) {
            System.out.println("Result             : PASS");
            System.out.println("Congratulations! You performed well.");
        } else {
            System.out.println("Result             : FAIL");
            System.out.println("Better luck next time.");
        }

        System.out.println("============================================");
    }
}
