package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firstpage extends AppCompatActivity implements View.OnClickListener{
    private CardView fees,exams,country,scholarship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        //defining cards
        fees=(CardView) findViewById(R.id.fees);
        exams=(CardView) findViewById(R.id.exams);
        country=(CardView) findViewById(R.id.country);
        scholarship=(CardView) findViewById(R.id.scholarship);
        //add click listener to the cards
        fees.setOnClickListener(this);
        exams.setOnClickListener(this);
        country.setOnClickListener(this);
        scholarship.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.fees: i = new Intent(this, fees.class); startActivity(i);
                break;
            case R.id.exams: i = new Intent(this, exam.class); startActivity(i);
                break;
            case R.id.country: i = new Intent(this, country.class); startActivity(i);
                break;
            case R.id.scholarship: i = new Intent(this, scholarship.class); startActivity(i);
                break;
            default: break;

        }


    }
}