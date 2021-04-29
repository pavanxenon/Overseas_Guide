package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sweden extends AppCompatActivity {

    private Button swe1;
    private Button swe2;
    private Button swe3;
    private Button swe4;
    private Button swe5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweden);

        swe1 = findViewById(R.id.swe1);
        swe2 = findViewById(R.id.swe2);
        swe3 = findViewById(R.id.swe3);
        swe4 = findViewById(R.id.swe4);
        swe5 = findViewById(R.id.swe5);

        swe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sweden.this, sweden1.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        swe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sweden.this,sweden2.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        swe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sweden.this,sweden3.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        swe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sweden.this,sweden4.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        swe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Sweden.this,sweden5.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}