package com.rachad.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextPhone, editTextURL;
    Button buttonCall, buttonOpenURL, buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //centre the appbar title



        buttonCall = findViewById(R.id.buttonCall);
        buttonOpenURL = findViewById(R.id.buttonOpenURL);
        editTextPhone = findViewById(R.id.editTextPhoneNumber);
        editTextURL = findViewById(R.id.editTextURL);
        buttonNext = findViewById(R.id.buttonNext);

        buttonCall.setOnClickListener(v -> {
            // call phone number
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(android.net.Uri.parse("tel:" + editTextPhone.getText().toString()));
            startActivity(intent);
        });
        buttonOpenURL.setOnClickListener(v -> {
            // open google
            try {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(android.net.Uri.parse(editTextURL.getText().toString()));
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this, "url is not correct", Toast.LENGTH_SHORT).show();
            }
        });
        buttonNext.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, MainActivity2.class)));

    }
}