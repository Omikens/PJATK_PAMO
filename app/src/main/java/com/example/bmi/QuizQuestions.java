package com.example.bmi;

public class QuizQuestions {

    public String Questions[] = {
            "BMI stands for:",
            "One gram of protein provides:",
            "One gram of fat provides:",
            "One gram of carbohydrates provides:",
            "Is it possible to target fat loss to specific body parts?",
            "Hypertrophy in terms of bodybuilding is:",
            "FBW in gym terminology stands for:",
            "In SPLIT training you:",
    };

    private String Answers[][] = {
            {"Body Mass Index", "Brown Mushroom Incline", "Black Monks Inquisition", "Biggus Miggus Iniggus"},
            {"4 kcal", "2 kcal", "3 kcal", "5 kcal"},
            {"5 kcal", "2 kcal", "10 kcal", "9 kcal"},
            {"1 kcal", "2 kcal", "4 kcal", "5 kcal"},
            {"Yes, no problem with it", "Only when using specific supplements", "No, never", "Yes but it is hard"},
            {"Increase in the volume of an muscle", "Decrease in the volume of an muscle", "Dangerous injury of a muscle", "Addiction to supplements"},
            {"Full biceps workout", "Flat bench workout", "Finish before warm-up", "Full body workout"},
            {"Spend half time on eating, half time on training", "Workout every part of body in the same time", "Train only on half of your capabilities", "Workout different parts of body each day"},
    };

    private String CorrectAnswers[] = {
            "Body Mass Index",
            "4 kcal",
            "9 kcal",
            "4 kcal",
            "No, never",
            "Increase in the volume of an muscle",
            "Full body workout",
            "Workout different parts of body each day",
    };

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
