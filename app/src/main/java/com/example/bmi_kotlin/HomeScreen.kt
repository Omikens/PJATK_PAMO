package com.example.bmi_kotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {
    private var buttonStart: Button? = null
    private var buttonNews: Button? = null
    private var buttonQuiz: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)
        setSupportActionBar(findViewById(R.id.toolbar))
        buttonStart = findViewById<View>(R.id.buttonStart) as Button
        buttonStart!!.setOnClickListener { openMainActivity() }
        buttonNews = findViewById<View>(R.id.buttonNews) as Button
        buttonNews!!.setOnClickListener { openNewsScreen() }
        buttonQuiz = findViewById<View>(R.id.buttonQuiz) as Button
        buttonQuiz!!.setOnClickListener { openQuizMain() }
    }

    fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun openNewsScreen() {
        val intent = Intent(this, ChartsScreen::class.java)
        startActivity(intent)
    }

    fun openQuizMain() {
        val intent = Intent(this, QuizMain::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }
}