package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act extends AppCompatActivity {

    private Button MATERIALS5;
    private Button TEST5;
    private Button ABOUT5;
    private Button CENTRE5;
    private Button SYLLABUS5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_c_t);

        MATERIALS5 = findViewById(R.id.materials5);
        TEST5 = findViewById(R.id.testfee5);
        ABOUT5 = findViewById(R.id.about5);
        CENTRE5 = findViewById(R.id.testcentre5);
        SYLLABUS5 = findViewById(R.id.syllabus5);

        MATERIALS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Act.this,materials5.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        TEST5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Act.this,testfee5.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        ABOUT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Act.this,about5.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        CENTRE5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Act.this,testcentre5.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        SYLLABUS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Act.this,syllabus5.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}