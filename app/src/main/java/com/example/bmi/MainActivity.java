package com.example.bmi;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewBMI;
    private TextView textViewPPM;
    private EditText editTextHeight;
    private EditText editTextWeight;
    private EditText editTextAge;
    private Button buttonBMI;
    private Button buttonHome;
    private Button buttonCalories;
    private RadioGroup radioGroup;

    private Button button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textViewBMI = findViewById(R.id.textView);
        textViewPPM = findViewById(R.id.textView3);
        editTextHeight = findViewById(R.id.editTextNumberHeight);
        editTextWeight = findViewById(R.id.editTextNumberWeight);
        editTextAge = findViewById(R.id.editTextNumberAge);
        buttonBMI = findViewById(R.id.buttonBMI);
        buttonHome = findViewById(R.id.buttonHome);
        buttonCalories = findViewById(R.id.buttonCalories);
        radioGroup = findViewById(R.id.radioGroup);
        
        button = findViewById(R.id.button);

        buttonBMI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V){
                try {
                    double height = Integer.parseInt(editTextHeight.getText().toString());
                    double weight = Integer.parseInt(editTextWeight.getText().toString());
                    double bmi = (weight / (height * height)) * 10000;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String bmiFormat = decimalFormat.format(bmi);
                    textViewBMI.setText(bmiFormat);
                    buttonCalories.setVisibility(View.VISIBLE);
                }
                catch(NumberFormatException e) {
                    double height = 0;
                }
            }
        });

        buttonCalories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);
                String selectedRbText = selectedRadioButton.getText().toString();
                double weight = Integer.parseInt(editTextWeight.getText().toString());
                double height = Integer.parseInt(editTextHeight.getText().toString());
                double age = Integer.parseInt(editTextAge.getText().toString());
                if (selectedRbText.equals("Male")) {
                    double PPM = 66.5 + (13.75 * weight) + (5.003 * height) - (6.775 * age);
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String PMMFormat = decimalFormat.format(PPM);
                    textViewPPM.setText(PMMFormat);
                    button.setVisibility(View.VISIBLE);
                }
                if (selectedRbText.equals("Female")) {
                    double PPM = 655.1 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String PMMFormat = decimalFormat.format(PPM);
                    textViewPPM.setText(PMMFormat);
                    button.setVisibility(View.VISIBLE);
                }
            }
        });

        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://stackoverflow.com/";
                double height = Integer.parseInt(editTextHeight.getText().toString());
                double weight = Integer.parseInt(editTextWeight.getText().toString());
                double bmi = (weight/(height*height))*10000;
                if (bmi <= 18){url = "https://blog.nasm.org/recipes-for-gaining-muscle";}
                if (bmi > 18 && bmi < 25){url = "https://www.delicious.com.au/recipes/collections/gallery/60-healthy-dinners-you-can-cook-in-30-minutes/1vo4q819";}
                if (bmi >= 25){url = "https://www.eatingwell.com/recipes/18045/weight-loss-diet/";}
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        }));

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
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