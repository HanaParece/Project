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
        getSupportActionBar().hide(); //hide title bar

        MainActivity.profile.calculateMBTI();

        result = (TextView) findViewById(R.id.result);
        result.setText(MainActivity.profile.toString());



        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                if (MainActivity.profile.getEI() == 'E')
                    openE();
                else
                    openI();
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                MainActivity.profile.clearMBTI();
                startOver();                    //go back to title page
            }
        });

    }

    public void openE(){
        Intent intent = new Intent(this, TypeE.class); // change this line when adding more questions
        startActivity(intent);
    }

    public void openI(){
        Intent intent1 = new Intent(this, TypeI.class); // change this line when adding more questions
        startActivity(intent1);
    }

    public void startOver(){
        Intent intent2 = new Intent(this, MainActivity.class); // change this line when adding more questions
        startActivity(intent2);
    }

}