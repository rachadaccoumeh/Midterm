package com.rachad.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewResult = findViewById(R.id.textViewResult);
        int nb1 = getIntent().getIntExtra("nb1", 0);
        int nb2 = getIntent().getIntExtra("nb2", 0);
        int result = nb1 + nb2;
        textViewResult.setText(String.valueOf(result));


    }
}