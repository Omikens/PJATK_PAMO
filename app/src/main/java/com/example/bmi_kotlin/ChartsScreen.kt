package com.example.bmi_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChartsScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.charts_screen)
        setSupportActionBar(findViewById(R.id.toolbar))
        val buttonBar = findViewById<Button>(R.id.button2)
        buttonBar!!.setOnClickListener { openBarChart() }
        val buttonPie = findViewById<Button>(R.id.button3)
        buttonPie!!.setOnClickListener { openPieChart() }
    }

    fun openBarChart() {
        val intent = Intent(this, BarChartScreen::class.java)
        startActivity(intent)
    }

    fun openPieChart() {
        val intent = Intent(this, PieChartScreen::class.java)
        startActivity(intent)
    }
}