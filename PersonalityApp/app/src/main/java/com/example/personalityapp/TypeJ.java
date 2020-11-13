package com.example.personalityapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TypeJ extends AppCompatActivity {
    private Button buttonA;                                     //declare buttonA as a button that will be defined
    private Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_j);
        getSupportActionBar().hide(); //hide title bar

        //go back
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                if (MainActivity.profile.getTF() == 'T')
                    openT();
                else
                    openF();
            }
        });

        //return to results page
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //do something
                goResults();
            }
        });

    }

    public void openT(){
        Intent intent = new Intent(this, TypeT.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }

    public void openF(){
        Intent intent = new Intent(this, TypeF.class);
        startActivity(intent);
        overridePendingTransition(R.anim.enter_left, R.anim.exit_left);
    }

    public void goResults(){
        Intent intent = new Intent(this, Results.class);
        startActivity(intent);
    }

}