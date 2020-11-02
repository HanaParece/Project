package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TypeE extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_e);



        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                goBack();                    //show detailed results
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.profile.getSN() == 'S') {
                    openS();
                } else {
                    openN();
                }
            }
        });

    }

    public void goBack(){
        Intent intent = new Intent(this, Results.class); // change this line when adding more questions
        startActivity(intent);

    }

    public void openS(){
        Intent intent = new Intent(this, TypeS.class); // change this line when adding more questions
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

    public void openN(){
        Intent intent = new Intent(this, TypeN.class); // change this line when adding more questions
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

}