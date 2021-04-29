package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toefl extends AppCompatActivity {

    private Button MATERIALS3;
    private Button TEST3;
    private Button ABOUT3;
    private Button CENTRE3;
    private Button SYLLABUS3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toefl);

        MATERIALS3 = findViewById(R.id.materials3);
        TEST3 = findViewById(R.id.testfee3);
        ABOUT3 = findViewById(R.id.about3);
        CENTRE3 = findViewById(R.id.testcentre3);
        SYLLABUS3 = findViewById(R.id.syllabus3);

        MATERIALS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Toefl.this,materials3.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        TEST3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Toefl.this,testfee3.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        ABOUT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Toefl.this,about3.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        CENTRE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Toefl.this,testcentre3.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        SYLLABUS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Toefl.this,syllabus3.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}