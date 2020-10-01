package com.example.personalityapp;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Question28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question28);
=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question28 extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question28);                //set to the current page

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                openQuestion29();                    //go to next question
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                openQuestion29();                    //go to next question
            }
        });
    }

    //link goes back to first page for now
    public void openQuestion29(){
        Intent intent = new Intent(this, Question29.class); // change this line when adding more questions
        startActivity(intent);
>>>>>>> Bens_Branch
    }
}