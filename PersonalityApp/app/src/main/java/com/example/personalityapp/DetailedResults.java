package com.example.personalityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailedResults extends AppCompatActivity {
    private Button buttonA;
    private TextView result;
    private TextView ei;
    private TextView sn;
    private TextView tf;
    private TextView jp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailedresults);

        //result.setText(MainActivity.profile.toString());

        ei = (TextView) findViewById(R.id.eiText);
        ei.setText(MainActivity.profile.getEIDetails());

        sn = (TextView) findViewById(R.id.snText);
        sn.setText(MainActivity.profile.getSNDetails());

        tf = (TextView) findViewById(R.id.tfText);
        tf.setText(MainActivity.profile.getTFDetails());

        jp = (TextView) findViewById(R.id.jpText);
        jp.setText(MainActivity.profile.getJPDetails());


        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {                        //define what to do on click
                //do something
                goBack();                    //go back
            }
        });

    }

    public void goBack(){
        Intent intent = new Intent(this, Results.class); // change this line when adding more questions
        startActivity(intent);
    }

}