package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void length(View v)
    {
        Intent intent = new Intent(this,length_conversion.class);
        startActivity(intent);
    }

    public void weight(View v)
    {
        Intent intent = new Intent(this,weight_conversion.class);
        startActivity(intent);
    }

    public void area(View v)
    {
        Intent intent = new Intent(this,area_conversion.class);
        startActivity(intent);
    }

    public void volume(View v)
    {
        Intent intent = new Intent(this,volume_conversion.class);
        startActivity(intent);
    }

    public void speed(View v)
    {
        Intent intent = new Intent(this,speed_conversion.class);
        startActivity(intent);
    }

    public void temprature(View v)
    {
        Intent intent = new Intent(this,temperature_conversion.class);
        startActivity(intent);
    }
}