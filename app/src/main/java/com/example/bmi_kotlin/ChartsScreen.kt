package com.example.bmi_kotlin

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.bmi_kotlin.BarChartScreen
import com.example.bmi_kotlin.PieChartScreen

class ChartsScreen : AppCompatActivity() {
    private var buttonBar: Button? = null
    private var buttonPie: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.bmi_kotlin.R.layout.charts_screen)
        //val toolbar = findViewById<Toolbar>(findViewById(com.example.bmi_kotlin.R.id.toolbar))
        setSupportActionBar(findViewById<Toolbar>(com.example.bmi_kotlin.R.id.toolbar))
        buttonBar = findViewById<Button>(R.id.button2)
        buttonBar!!.setOnClickListener { openBarChart() }
        buttonPie = findViewById<Button>(R.id.button3)
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