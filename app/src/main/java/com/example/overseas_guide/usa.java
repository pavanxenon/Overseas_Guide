package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usa extends AppCompatActivity {

    private Button u1;
    private Button u2;
    private Button u3;
    private Button u4;
    private Button u5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa);

        u1 = findViewById(R.id.u1);
        u2 = findViewById(R.id.u2);
        u3 = findViewById(R.id.u3);
        u4 = findViewById(R.id.u4);
        u5 = findViewById(R.id.u5);

        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(usa.this, usa1.class);
                startActivity(categoryIntent);
                finish();

            }
        });

        u2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(usa.this,usa2.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        u3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(usa.this,usa3.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        u4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(usa.this,usa4.class);
                startActivity(categoryIntent);
                finish();

            }
        });


        u5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(usa.this,usa5.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}