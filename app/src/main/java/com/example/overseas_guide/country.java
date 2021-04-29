package com.example.overseas_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class country extends AppCompatActivity implements View.OnClickListener{
    private CardView AUSTRALIA,USA,CANADA,GERMANY,FRANCE,NZ,SWEDEN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        //defining cards
        AUSTRALIA=(CardView) findViewById(R.id.australia);
        USA=(CardView) findViewById(R.id.unitedstates);
        CANADA=(CardView) findViewById(R.id.canada);
        GERMANY =(CardView) findViewById(R.id.germany);
        FRANCE =(CardView) findViewById(R.id.france);
        NZ =(CardView) findViewById(R.id.nz);
        SWEDEN =(CardView) findViewById(R.id.sweden);
        //add click listener to the cards
        AUSTRALIA.setOnClickListener(this);
        USA.setOnClickListener(this);
        CANADA.setOnClickListener(this);
        GERMANY.setOnClickListener(this);
        FRANCE.setOnClickListener(this);
        NZ.setOnClickListener(this);
        SWEDEN.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.australia: i = new Intent(this, Australia.class); startActivity(i);
                break;
            case R.id.unitedstates: i = new Intent(this, usa.class); startActivity(i);
                break;
            case R.id.canada: i = new Intent(this, Canada.class); startActivity(i);
                break;
            case R.id.germany: i = new Intent(this, Germany.class); startActivity(i);
                break;
            case R.id.france: i = new Intent(this, France.class); startActivity(i);
                break;
            case R.id.nz: i = new Intent(this, NewZealand.class); startActivity(i);
                break;
            case R.id.sweden: i = new Intent(this, Sweden.class); startActivity(i);
                break;
            default:
                break;

        }
    }
}