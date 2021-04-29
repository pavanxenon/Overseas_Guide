package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewZealand extends AppCompatActivity {

    private Button nz1;
    private Button nz2;
    private Button nz3;
    private Button nz4;
    private Button nz5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_zealand);

        nz1 = findViewById(R.id.nz1);
        nz2 = findViewById(R.id.nz2);
        nz3 = findViewById(R.id.nz3);
        nz4 = findViewById(R.id.nz4);
        nz5 = findViewById(R.id.nz5);

        nz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(NewZealand.this, newzealand1.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        nz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(NewZealand.this,newzealand2.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        nz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(NewZealand.this,newzealand3.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        nz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(NewZealand.this,newzealand4.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        nz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(NewZealand.this,newzealand5.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}