package com.example.bmi_kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class QuizMain : AppCompatActivity() {

    var answer1: Button? = null; var answer2: Button? = null
    var answer3: Button? = null; var answer4: Button? = null
    //var score: TextView? = null
    var question:TextView? = null

    private val Questions = QuizQuestions()

    private var Answer: String? = null
    private var Score: Int = 0
    private val QuestionLength: Int = Questions.Questions.size

    var r: Int? = null
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.bmi_kotlin.R.layout.quiz_main)
        setSupportActionBar(findViewById(com.example.bmi_kotlin.R.id.toolbar))



        answer1 = findViewById(R.id.answer1)
        answer2 = findViewById(com.example.bmi_kotlin.R.id.answer2)
        answer3 = findViewById(com.example.bmi_kotlin.R.id.answer3)
        answer4 = findViewById(com.example.bmi_kotlin.R.id.answer4)

        val score: TextView = findViewById(com.example.bmi_kotlin.R.id.score)
        question = findViewById(com.example.bmi_kotlin.R.id.question)

        score.text = ("Score: $Score")

        updateQuestion((0..QuestionLength).random())
        answer1?.setOnClickListener {
            if(answer1?.text.toString() == Answer){
                Score++
                score.text = ("Score: " + Score)
                updateQuestion((0..QuestionLength).random())
            }
            else {
                gameOver()
                //Navigation.findNavController(view).navigate(R.id.action_covidQuizFragment_to_startingFragment)
            }
        }

        answer2?.setOnClickListener {
            if(answer2?.text.toString() == Answer){
                Score++
                score.text = ("Score: " + Score)
                updateQuestion((0..QuestionLength).random())
            }
            else {
                gameOver()
                //Navigation.findNavController(view).navigate(R.id.action_covidQuizFragment_to_startingFragment)
            }
        }

        answer3?.setOnClickListener {
            if(answer3?.text.toString() == Answer){
                Score++
                score.text = ("Score: " + Score)
                updateQuestion((0..QuestionLength).random())
            }
            else {
                gameOver()
                //Navigation.findNavController(view).navigate(R.id.action_covidQuizFragment_to_startingFragment)
            }
        }

        answer4?.setOnClickListener {
            if(answer4?.text.toString() == Answer){
                Score++
                score.text = ("Score: " + Score)
                updateQuestion((0..QuestionLength).random())
            }
            else {
                gameOver()
                //Navigation.findNavController(view).navigate(R.id.action_covidQuizFragment_to_startingFragment)
            }
        }

        //return view;
    }

    private fun updateQuestion(num: Int) {
        question?.text = Questions.getQuestion(num)
        answer1?.text = Questions.getAnswer1(num)
        answer2?.text = Questions.getAnswer2(num)
        answer3?.text = Questions.getAnswer3(num)
        answer4?.text = Questions.getAnswer4(num)

        Answer = Questions.getCorrectAnswer(num)
    }


    private fun gameOver() {

        /*
        Context context = requireActivity().getApplicationContext();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder
                .setMessage("GAME OVER! Your score is: " + Score)
                .setCancelable(false)
                .setPositiveButton("New game",
                        (dialog, which) -> startActivity(new Intent(requireActivity().getApplicationContext(), CovidQuizFragment.class)))
                .setNegativeButton("Exit",
                        (dialog, which) -> getActivity().finish());
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        */


        //val context: Context = requireActivity().applicationContext;
        //val toast: Toast = Toast.makeText(context,"Game Over!",Toast.LENGTH_SHORT);
        //toast.show();
    }
}