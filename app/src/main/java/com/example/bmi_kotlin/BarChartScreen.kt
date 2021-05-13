package com.example.bmi_kotlin

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.bmi_kotlin.R
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.*

class BarChartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bar_chart_screen)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val barChart = findViewById<BarChart>(R.id.barChart)
        val covid = ArrayList<BarEntry>()
        //covid.add(BarChartScreen())
        //covid.add(BarEntry(2017.395597, 2))
        //covid.add(BarEntry(2018.1, 404298))
        //covid.add(BarEntry(2019.1, 401481))
        //covid.add(BarEntry(2020.1, 475253))
        val barDataSet = BarDataSet(covid, "Deaths in Poland every year")
        barDataSet.setColors(*ColorTemplate.MATERIAL_COLORS)
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.valueTextSize = 16f
        val barData = BarData(barDataSet)
        barChart.setFitBars(true)
        barChart.data = barData
        barChart.description.text = "Deaths"
        barChart.animateY(2000)
    }
}