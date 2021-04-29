package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exam extends AppCompatActivity {
    private Button GRE;
    private Button IELTS;
    private Button TOEFL;
    private Button SAT;
    private Button ACT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        GRE = findViewById(R.id.GRE);
        IELTS = findViewById(R.id.IELTS);
        TOEFL = findViewById(R.id.TOEFL);
        SAT = findViewById(R.id.SAT);
        ACT = findViewById(R.id.Act);

        ACT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(exam.this, Act.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        SAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(exam.this,Sat.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        TOEFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(exam.this,Toefl.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        IELTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(exam.this,Ielts.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        GRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(exam.this,Gre.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}