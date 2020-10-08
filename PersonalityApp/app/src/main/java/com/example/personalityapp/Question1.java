package com.example.personalityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question1 extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    private Button egg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);                //set to the current page

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                openQuestion2();                    //go to next question
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                openQuestion2();                    //go to next question
            }
        });

        egg = (Button) findViewById(R.id.egg);
        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                openQuestion2();                    //go to next question, but it's an egg
            }
        });

    }


    public void openQuestion2(){
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }
}