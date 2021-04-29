package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Germany extends AppCompatActivity {

    private Button g1;
    private Button g2;
    private Button g3;
    private Button g4;
    private Button g5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany);

        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);

        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Germany.this, germany1.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Germany.this,germany2.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Germany.this,germany3.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Germany.this,germany4.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Germany.this,germany5.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}