package com.example.bmi_kotlin

class QuizQuestions {
    var Questions = arrayOf(
        "BMI stands for:",
        "One gram of protein provides:",
        "One gram of fat provides:",
        "One gram of carbohydrates provides:",
        "Is it possible to target fat loss to specific body parts?",
        "Hypertrophy in terms of bodybuilding is:",
        "FBW in gym terminology stands for:",
        "In SPLIT training you:"
    )
    private val Answers = arrayOf(
        arrayOf(
            "Body Mass Index",
            "Brown Mushroom Incline",
            "Black Monks Inquisition",
            "Biggus Miggus Iniggus"
        ),
        arrayOf("4 kcal", "2 kcal", "3 kcal", "5 kcal"),
        arrayOf("5 kcal", "2 kcal", "10 kcal", "9 kcal"),
        arrayOf("1 kcal", "2 kcal", "4 kcal", "5 kcal"),
        arrayOf(
            "Yes, no problem with it",
            "Only when using specific supplements",
            "No, never",
            "Yes but it is hard"
        ),
        arrayOf(
            "Increase in the volume of an muscle",
            "Decrease in the volume of an muscle",
            "Dangerous injury of a muscle",
            "Addiction to supplements"
        ),
        arrayOf(
            "Full biceps workout",
            "Flat bench workout",
            "Finish before warm-up",
            "Full body workout"
        ),
        arrayOf(
            "Spend half time on eating, half time on training",
            "Workout every part of body in the same time",
            "Train only on half of your capabilities",
            "Workout different parts of body each day"
        )
    )
    private val CorrectAnswers = arrayOf(
        "Body Mass Index",
        "4 kcal",
        "9 kcal",
        "4 kcal",
        "No, never",
        "Increase in the volume of an muscle",
        "Full body workout",
        "Workout different parts of body each day"
    )

    fun getQuestion(a: Int): String {
        return Questions[a]
    }

    fun getAnswer1(a: Int): String {
        return Answers[a][0]
    }

    fun getAnswer2(a: Int): String {
        return Answers[a][1]
    }

    fun getAnswer3(a: Int): String {
        return Answers[a][2]
    }

    fun getAnswer4(a: Int): String {
        return Answers[a][3]
    }

    fun getCorrectAnswer(a: Int): String {
        return CorrectAnswers[a]
    }
}