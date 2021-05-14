package com.example.bmi_kotlin

import android.R
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.*
import kotlin.collections.ArrayList

class PieChartScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.bmi_kotlin.R.layout.pie_chart_screen)
//
//        covidList = ArrayList()
//        covidList = ArrayList()
//
//        val pieDataSet = PieDataSet(getList(), "NO of covid")
//        val pieData = PieData(getCase(), pieDataSet)
//
//        pieDataSet.setColors(ColorTemplate.JOYFUL_COLORS)
//        pieChart.animatedXY(5000, 5000)
//        pieChart.data = pieData




//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        val pieChart = findViewById<PieChart>(R.id.pieChart)
//        val visitiors = ArrayList<PieEntry>()
//        visitiors.add(PieEntry(2789, "Gibraltar"))
//        visitiors.add(PieEntry(2710, "Czech"))
//        visitiors.add(PieEntry(1739, "USA"))
//        visitiors.add(PieEntry(1704, "Poland"))
//        visitiors.add(PieEntry(1653, "Spain"))
//        visitiors.add(PieEntry(1528, "France"))
//        visitiors.add(PieEntry(982, "Germany"))
//        visitiors.add(PieEntry(920, "Greece"))
//        visitiors.add(PieEntry(732, "Russia"))
//        val pieDataSet = PieDataSet(visitiors, "Covid infections per 1 million")
//        pieDataSet.setColors(*ColorTemplate.COLORFUL_COLORS)
//        pieDataSet.valueTextColor = Color.BLACK
//        pieDataSet.valueTextSize = 16f
//        val pieData = PieData(pieDataSet)
//        pieChart.data = pieData
//        pieChart.description.isEnabled = false
//        pieChart.centerText = "COVID"
//        pieChart.animate()
    }

}