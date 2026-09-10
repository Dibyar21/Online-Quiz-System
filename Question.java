package myPackage;

public class Question {

    private String questionText;
    private String[] options;
    private int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {

        if (questionText == null || questionText.trim().isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be empty.");
        }

        if (options == null || options.length < 2) {
            throw new IllegalArgumentException("A question must have at least 2 options.");
        }

        if (correctAnswerIndex < 0 || correctAnswerIndex >= options.length) {
            throw new IllegalArgumentException("Invalid correct answer index.");
        }

        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
