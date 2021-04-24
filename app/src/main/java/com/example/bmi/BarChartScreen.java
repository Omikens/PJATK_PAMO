package com.example.bmi;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_chart_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        com.github.mikephil.charting.charts.BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> covid = new ArrayList<>();
        covid.add(new BarEntry( 2016, 0));
        covid.add(new BarEntry( 2017, 395597));
        covid.add(new BarEntry( 2018, 404298));
        covid.add(new BarEntry(2019, 401481));
        covid.add(new BarEntry(2020, 475253));

        BarDataSet barDataSet = new BarDataSet(covid, "Deaths in Poland every year");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Deaths");
        barChart.animateY(2000);
    }
}