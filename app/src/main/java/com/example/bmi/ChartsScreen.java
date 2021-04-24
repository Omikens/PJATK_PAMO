package com.example.bmi;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ChartsScreen extends AppCompatActivity {

    private Button buttonBar;
    private Button buttonPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charts_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonBar = (Button) findViewById(R.id.button2);
        buttonBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBarChart();
            }
        });

        buttonPie = (Button) findViewById(R.id.button3);
        buttonPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPieChart();
            }
        });
    }

    public void openBarChart() {
        Intent intent = new Intent(this, BarChartScreen.class);
        startActivity(intent);
    }

    public void openPieChart() {
        Intent intent = new Intent(this, PieChartScreen.class);
        startActivity(intent);
    }
}