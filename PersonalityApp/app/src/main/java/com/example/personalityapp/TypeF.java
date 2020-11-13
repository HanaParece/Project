package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TypeF extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;
    private Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_f);
        getSupportActionBar().hide(); //hide title bar

        //go back
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                if (MainActivity.profile.getSN() == 'S')
                    openS();
                else
                    openN();
            }
        });

        //next
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainActivity.profile.getJP() == 'J')
                    openJ();
                else
                    openP();
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

    public void openS(){
        Intent intent = new Intent(this, TypeS.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }

    public void openN(){
        Intent intent = new Intent(this, TypeN.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }

    public void goResults(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }

    public void openJ(){
        Intent intent = new Intent(this, TypeJ.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

    public void openP(){
        Intent intent = new Intent(this, TypeP.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }
}