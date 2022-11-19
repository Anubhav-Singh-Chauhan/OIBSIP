package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    public Button start,stop,hold;
    public Chronometer chronometer;
    long Holdtime=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        stop = (Button)findViewById(R.id.stop);
        hold = (Button)findViewById(R.id.hold);

        chronometer = (Chronometer) findViewById(R.id.chrmtr);
        chronometer.setFormat("00:%s");

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                Holdtime=0;
                chronometer.setFormat("00:%s");
                chronometer.stop();
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime()+Holdtime);
                chronometer.start();
            }
        });

        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Holdtime = chronometer.getBase() - SystemClock.elapsedRealtime();
                chronometer.stop();
            }
        });


    }





}