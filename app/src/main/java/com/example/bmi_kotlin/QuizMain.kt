package com.example.bmi_kotlin

import android.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.bmi_kotlin.QuizQuestions
import java.util.*

class QuizMain : AppCompatActivity() {

    var answer1: Button = findViewById<Button>(com.example.bmi_kotlin.R.id.answer1)
    var answer2: Button = findViewById<Button>(com.example.bmi_kotlin.R.id.answer2)
    var answer3: Button = findViewById<Button>(com.example.bmi_kotlin.R.id.answer3)
    var answer4: Button = findViewById<Button>(com.example.bmi_kotlin.R.id.answer4)
    var score: TextView = findViewById<TextView>(com.example.bmi_kotlin.R.id.score)
    var question: TextView = findViewById<TextView>(com.example.bmi_kotlin.R.id.question)

    private val Questions = QuizQuestions()
    var Answer: String? = "answer"
    private var Score = 0
    val QuestionLength: Int = Questions.Questions.size
    var r: Random? = null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.bmi_kotlin.R.layout.quiz_main)
        setSupportActionBar(findViewById(com.example.bmi_kotlin.R.id.toolbar))


        r = Random()
        answer1 = findViewById<View>(com.example.bmi_kotlin.R.id.answer1) as Button
        answer2 = findViewById<View>(com.example.bmi_kotlin.R.id.answer2) as Button
        answer3 = findViewById<View>(com.example.bmi_kotlin.R.id.answer3) as Button
        answer4 = findViewById<View>(com.example.bmi_kotlin.R.id.answer4) as Button
        score = findViewById<View>(com.example.bmi_kotlin.R.id.score) as TextView
        question = findViewById<View>(com.example.bmi_kotlin.R.id.question) as TextView
        score.text = "Score: $Score"
        updateQuestion(r!!.nextInt(QuestionLength))
        answer1!!.setOnClickListener {
            if (answer1!!.text.toString() === Answer) {
                Score++
                score!!.text = "Score: $Score"
                updateQuestion(r!!.nextInt(QuestionLength))
            } else {
                gameOver()
            }
        }
        answer2!!.setOnClickListener {
            if (answer2!!.text.toString() === Answer) {
                Score++
                score!!.text = "Score: $Score"
                updateQuestion(r!!.nextInt(QuestionLength))
            } else {
                gameOver()
            }
        }
        answer3!!.setOnClickListener {
            if (answer3!!.text.toString() === Answer) {
                Score++
                score!!.text = "Score: $Score"
                updateQuestion(r!!.nextInt(QuestionLength))
            } else {
                gameOver()
            }
        }
        answer4!!.setOnClickListener {
            if (answer4!!.text.toString() === Answer) {
                Score++
                score!!.text = "Score: $Score"
                updateQuestion(r!!.nextInt(QuestionLength))
            } else {
                gameOver()
            }
        }
    }

    private fun updateQuestion(num: Int) {
        question!!.text = Questions.getQuestion(num)
        answer1!!.text = Questions.getAnswer1(num)
        answer2!!.text = Questions.getAnswer2(num)
        answer3!!.text = Questions.getAnswer3(num)
        answer4!!.text = Questions.getAnswer4(num)
        Answer = Questions.getCorrectAnswer(num)
    }

    private fun gameOver() {
        val alertDialogBuilder = AlertDialog.Builder(this@QuizMain)
        alertDialogBuilder
            .setMessage("GAME OVER! Your score is: $Score")
            .setCancelable(false)
            .setPositiveButton(
                "New game"
            ) { dialog, which -> startActivity(Intent(applicationContext, QuizMain::class.java)) }
            .setNegativeButton(
                "Exit"
            ) { dialog, which -> finish() }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}