package com.rachad.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextNb1, editTextNb2,editTextPhone, editTextEmail;
    Button buttonAdd, buttonCall, buttonOpenGoogle, buttonSendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNb1 = findViewById(R.id.editTextNb1);
        editTextNb2 = findViewById(R.id.editTextNb2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonCall = findViewById(R.id.buttonCall);
        buttonOpenGoogle = findViewById(R.id.buttonOpenGoogle);
        buttonSendEmail = findViewById(R.id.buttonSendEmail);
        editTextPhone = findViewById(R.id.editTextPhoneNumber);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonAdd.setOnClickListener(v -> {
            // move to another activity
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nb1", Integer.parseInt(editTextNb1.getText().toString()));
            intent.putExtra("nb2", Integer.parseInt(editTextNb2.getText().toString()));
            startActivity(intent);
        });
        buttonCall.setOnClickListener(v -> {
            // call phone number
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(android.net.Uri.parse("tel:" + editTextPhone.getText().toString()));
            startActivity(intent);
        });
        buttonOpenGoogle.setOnClickListener(v -> {
            // open google
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(android.net.Uri.parse("https://www.google.com"));
            startActivity(intent);
        });
        buttonSendEmail.setOnClickListener(v -> {
            // send email
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{editTextEmail.getText().toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
            intent.putExtra(Intent.EXTRA_TEXT, "Email body");
            startActivity(intent);
        });
    }
}