package com.example.bmi_kotlin

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlin.collections.ArrayList

class PieChartScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pie_chart_screen)
        val pieChart = findViewById<PieChart>(R.id.pieChart)

        val visitiors: MutableList<PieEntry> = ArrayList()
        visitiors.add(PieEntry(2789f, "Gibraltar"))
        visitiors.add(PieEntry(2710f, "Czech"))
        visitiors.add(PieEntry(1739f, "USA"))
        visitiors.add(PieEntry(1704f, "Poland"))
        visitiors.add(PieEntry(1653f, "Spain"))
        visitiors.add(PieEntry(1528f, "France"))
        visitiors.add(PieEntry(982f, "Germany"))
        visitiors.add(PieEntry(920f, "Greece"))
        visitiors.add(PieEntry(732f, "Russia"))

        val pieDataSet = PieDataSet(visitiors, "Covid infections per 1 million")
        pieDataSet.setColors(*ColorTemplate.COLORFUL_COLORS)
        pieDataSet.valueTextColor = Color.BLACK
        pieDataSet.valueTextSize = 16f

        val pieData = PieData(pieDataSet)

        pieChart.data = pieData
        pieChart.description.isEnabled = false
        pieChart.centerText = "COVID"
        pieChart.animate()
    }
}