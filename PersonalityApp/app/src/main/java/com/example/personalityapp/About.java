package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    private Button button;                                     //declare buttonA as a button that will be defined

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);                //set to the current page
        getSupportActionBar().hide(); //hide title bar

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                back();                    //go to next question
            }
        });

    }


    public void back(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}