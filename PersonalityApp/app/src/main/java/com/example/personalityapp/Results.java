package com.example.personalityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        result = (TextView) findViewById(R.id.result);
        result.setText(MainActivity.profile.toString());

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                moreInfo();                    //show detailed results
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                MainActivity.profile.clearMBTI();
                startOver();                    //restart
            }
        });

    }

    public void moreInfo(){
        Intent intent = new Intent(this, DetailedResults.class); // change this line when adding more questions
        startActivity(intent);
    }

    public void startOver(){
        Intent intent = new Intent(this, MainActivity.class); // change this line when adding more questions
        startActivity(intent);
    }

}