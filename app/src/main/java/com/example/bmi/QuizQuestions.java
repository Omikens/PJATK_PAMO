package com.example.bmi;

public class QuizQuestions {

    public String Questions[] = {
            "Covid is:",
            "somchu is:",
            "Popoga?"
    };

    private String Answers[][] = {
            {"Disease", "Lie", "Conspiracy", "Popoga"},
            {"Honda", "XD", "DDDDjango", "Popoga"},
            {"YES", "YES", "Huge POPOGA", "NO"},
    };

    private String CorrectAnswers[] = {"Disease", "DDDDjango", "Huge POPOGA"};

    public String getQuestion(int a) {
        String question = Questions[a];
        return question;
    }

    public String getAnswer1(int a) {
        String answer = Answers[a][0];
        return answer;
    }

    public String getAnswer2(int a) {
        String answer = Answers[a][1];
        return answer;
    }

    public String getAnswer3(int a) {
        String answer = Answers[a][2];
        return answer;
    }

    public String getAnswer4(int a) {
        String answer = Answers[a][3];
        return answer;
    }

    public String getCorrectAnswer(int a) {
        String correctAnswer = CorrectAnswers[a];
        return correctAnswer;
    }
}
