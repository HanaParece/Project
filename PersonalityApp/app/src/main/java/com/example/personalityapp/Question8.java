package com.example.personalityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question8 extends AppCompatActivity {
    private Button buttonA;
    private Button buttonB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);                //set to the current page
        getSupportActionBar().hide(); //hide title bar

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                MainActivity.profile.setResponse(8, 'A');
                openQuestion9();                    //go to next question
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                MainActivity.profile.setResponse(8, 'B');
                openQuestion9();                    //go to next question
            }
        });
    }

    public void openQuestion9() {
        Intent intent = new Intent(this, Question9.class);
        //startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0,0);
    }
}