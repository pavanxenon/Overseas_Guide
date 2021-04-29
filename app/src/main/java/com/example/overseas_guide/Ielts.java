package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ielts extends AppCompatActivity {

    private Button MATERIALS2;
    private Button TEST2;
    private Button ABOUT2;
    private Button CENTRE2;
    private Button SYLLABUS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ielts);

        MATERIALS2 = findViewById(R.id.materials2);
        TEST2 = findViewById(R.id.testfee2);
        ABOUT2 = findViewById(R.id.about2);
        CENTRE2 = findViewById(R.id.testcentre2);
        SYLLABUS2 = findViewById(R.id.syllabus2);

        MATERIALS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Ielts.this,materials2.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        TEST2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Ielts.this,testfee2.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        ABOUT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Ielts.this,about2.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        CENTRE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Ielts.this,testcentre2.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        SYLLABUS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Ielts.this,syllabus2.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}