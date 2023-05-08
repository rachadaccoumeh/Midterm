package com.rachad.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textViewResult;
    EditText editTextNb1, editTextNb2;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    Button buttonBack, buttonClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewResult = findViewById(R.id.textViewResult);
        editTextNb1 = findViewById(R.id.editTextNb1);
        editTextNb2 = findViewById(R.id.editTextNb2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMultiply);
        buttonDiv = findViewById(R.id.buttonDivide);
        buttonBack = findViewById(R.id.buttonBack);
        buttonClose = findViewById(R.id.buttonClose);
        buttonBack.setOnClickListener(v -> {
            finish();
        });
        buttonClose.setOnClickListener(v -> {
            finishAffinity();
        });
        buttonAdd.setOnClickListener(v -> {
            try {
                float nb1 = Float.parseFloat(editTextNb1.getText().toString());
                float nb2 = Float.parseFloat(editTextNb2.getText().toString());
                textViewResult.setText(String.valueOf(nb1 + nb2));
                textViewResult.setVisibility(View.VISIBLE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttonSub.setOnClickListener(v -> {
            try {
                float nb1 = Float.parseFloat(editTextNb1.getText().toString());
                float nb2 = Float.parseFloat(editTextNb2.getText().toString());
                textViewResult.setText(String.valueOf(nb1 - nb2));
                textViewResult.setVisibility(View.VISIBLE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttonMul.setOnClickListener(v -> {
            try {
                float nb1 = Float.parseFloat(editTextNb1.getText().toString());
                float nb2 = Float.parseFloat(editTextNb2.getText().toString());
                textViewResult.setText(String.valueOf(nb1 * nb2));
                textViewResult.setVisibility(View.VISIBLE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        buttonDiv.setOnClickListener(v -> {
            try {
                float nb1 = Float.parseFloat(editTextNb1.getText().toString());
                float nb2 = Float.parseFloat(editTextNb2.getText().toString());
                textViewResult.setText(String.valueOf(nb1 / nb2));
                textViewResult.setVisibility(View.VISIBLE);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this, "division by zero", Toast.LENGTH_SHORT).show();
            }
        });


    }
}