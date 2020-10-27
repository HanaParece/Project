package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TypeS extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    private Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_s);

        //go back
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                if (MainActivity.profile.getEI() == 'E')
                    openE();
                else
                    openI();
            }
        });

        //next
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.profile.getTF() == 'T')
                    openT();
                else
                    openF();
            }
        });

        //return to results page
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                goResults();
            }
        });

    }

    public void openE(){
        Intent intent = new Intent(this, TypeE.class);
        startActivity(intent);
    }

    public void openI(){
        Intent intent = new Intent(this, TypeI.class);
        startActivity(intent);
    }

    public void goResults(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }

    public void openT(){
        Intent intent = new Intent(this, TypeT.class);
        startActivity(intent);
    }

    public void openF(){
        Intent intent = new Intent(this, TypeF.class);
        startActivity(intent);
    }

}