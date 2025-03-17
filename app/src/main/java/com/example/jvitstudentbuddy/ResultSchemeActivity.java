package com.example.jvitstudentbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultSchemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_scheme);
        Button button1 = (Button) findViewById(R.id.scheme1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultSchemeActivity.this, Scheme1Activity.class));
            }
        });
        Button button2 = (Button) findViewById(R.id.scheme2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultSchemeActivity.this, Scheme2Activity.class));
            }
        });
        Button button3 = (Button) findViewById(R.id.scheme3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultSchemeActivity.this, Scheme3Activity.class));
            }
        });
    }
}