package com.example.bmi;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView3;
    private Button button;
    private EditText editTextHeight;
    private EditText editText2;
    private EditText editText3;

    private Button button2;
    private Button calories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        editTextHeight = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        editText3 = findViewById(R.id.editTextNumber3);
        button = findViewById(R.id.button);

        calories = findViewById(R.id.Calories);

        calories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight = Integer.parseInt(editText2.getText().toString());
                double height = Integer.parseInt(editTextHeight.getText().toString());
                double age = Integer.parseInt(editText3.getText().toString());
                double PPM = 66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age);

                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String PMMFormat = decimalFormat.format(PPM);
                textView3.setText(PMMFormat);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V){
                double height = Integer.parseInt(editTextHeight.getText().toString());
                double weight = Integer.parseInt(editText2.getText().toString());
                double bmi = (weight/(height*height))*10000;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String bmiFormat = decimalFormat.format(bmi);
                textView.setText(bmiFormat);
                calories.setVisibility(View.VISIBLE);
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Dawid Szabłowski s16667", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());
    }

    public void openActivity2() {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}