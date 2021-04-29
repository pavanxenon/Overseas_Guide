package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gre extends AppCompatActivity {
    private Button MATERIALS;
    private Button TEST;
    private Button ABOUT;
    private Button CENTRE;
    private Button SYLLABUS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gre);

        MATERIALS = findViewById(R.id.materials);
        TEST = findViewById(R.id.testfee);
        ABOUT = findViewById(R.id.about);
        CENTRE = findViewById(R.id.testcentre);
        SYLLABUS = findViewById(R.id.syllabus);

        MATERIALS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Gre.this,material.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        TEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Gre.this,testfee.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        ABOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Gre.this,about.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        CENTRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Gre.this,testcentre.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        SYLLABUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Gre.this,syllabus.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}