package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Australia extends AppCompatActivity {

    private Button uni1;
    private Button uni2;
    private Button uni3;
    private Button uni4;
    private Button uni5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        uni1 = findViewById(R.id.uni1);
        uni2 = findViewById(R.id.uni2);
        uni3 = findViewById(R.id.uni3);
        uni4 = findViewById(R.id.uni4);
        uni5 = findViewById(R.id.uni5);

        uni1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Australia.this, university1.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        uni2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Australia.this,university2.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        uni3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Australia.this,university3.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        uni4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Australia.this,university4.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        uni5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Australia.this,university5.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}