package com.example.bmi;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pie_chart_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> visitiors = new ArrayList<>();
        visitiors.add(new PieEntry(2789, "Gibraltar"));
        visitiors.add(new PieEntry(2710, "Czech"));
        visitiors.add(new PieEntry(1739, "USA"));
        visitiors.add(new PieEntry(1704, "Poland"));
        visitiors.add(new PieEntry(1653, "Spain"));
        visitiors.add(new PieEntry(1528, "France"));
        visitiors.add(new PieEntry(982, "Germany"));
        visitiors.add(new PieEntry(920, "Greece"));
        visitiors.add(new PieEntry(732, "Russia"));

        PieDataSet pieDataSet = new PieDataSet(visitiors, "Covid infections per 1 million");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);


        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("COVID");
        pieChart.animate();
    }
}