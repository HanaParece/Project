package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question26 extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question26);                //set to the current page
        getSupportActionBar().hide(); //hide title bar

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                MainActivity.profile.setResponse(26, 'A');
                openPart2();                    //go to next question
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                MainActivity.profile.setResponse(26, 'B');
                openPart2();                    //go to next question
            }
        });
    }

    public void openPart2(){
        Intent intent = new Intent(this, Part2.class); // change this line when adding more questions
//        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//        startActivityForResult(intent, 0);
//        overridePendingTransition(0,0);
        startActivity(intent);
    }
}