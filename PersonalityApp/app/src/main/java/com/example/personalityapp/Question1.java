package com.example.personalityapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Question1 extends AppCompatActivity {
    private Button buttonA;                                                         //declare buttonA as a button that will be defined
    private Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);                                 //set to the current page
        getSupportActionBar().hide(); //hide title bar

        buttonA = (Button) findViewById(R.id.buttonA);                               //declare button
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                                        //define what to do on click
                MainActivity.profile.setResponse(1, 'A');               //Increment respective value
                openQuestion2();                                                    //go to next question
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);                               //declare button
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                                        //define what to do on click
                MainActivity.profile.setResponse(1, 'B');                //Increment respective value
                openQuestion2();                                                      //go to next question
            }
        });
    }

    public void openQuestion2(){                                                      //defines what happens when the code hits openQuestion2(); 
        Intent intent = new Intent(this, Question2.class);
        //startActivity(intent);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);                             //will be used for page transition
        startActivityForResult(intent, 0);
        overridePendingTransition(0,0);
    }
}