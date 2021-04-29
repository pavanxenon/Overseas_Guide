package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sat extends AppCompatActivity {

    private Button MATERIALS4;
    private Button TEST4;
    private Button ABOUT4;
    private Button CENTRE4;
    private Button SYLLABUS4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sat);

        MATERIALS4 = findViewById(R.id.materials4);
        TEST4 = findViewById(R.id.testfee4);
        ABOUT4 = findViewById(R.id.about4);
        CENTRE4 = findViewById(R.id.testcentre4);
        SYLLABUS4 = findViewById(R.id.syllabus4);

        MATERIALS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sat.this,materials4.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        TEST4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sat.this,testfee4.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        ABOUT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sat.this,about4.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        CENTRE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sat.this,testcentre4.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        SYLLABUS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sat.this,syllabus4.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}