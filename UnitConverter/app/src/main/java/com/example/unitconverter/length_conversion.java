package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class length_conversion extends AppCompatActivity {

    EditText input,result;
    Button mm,cm,km;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_conversion);

        input = findViewById(R.id.input);
        result=findViewById(R.id.result);
        mm=findViewById(R.id.mm);
        cm=findViewById(R.id.cm);
        km=findViewById(R.id.km);

        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input.getText().toString());
                    float valueInMM = value*1000;
                    String str = Float.toString(valueInMM);
                    result.setText(str);
                }
                else{
                    result.setText("No Input Entered");
                }
            }
        });

        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input.getText().toString());
                    float valueInCM = value*100;
                    String str = Float.toString(valueInCM);
                    result.setText(str);
                }
                else{
                    result.setText("No Input Entered");
                }
            }
        });

        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input.getText().toString());
                    float valueInKM = value/1000;
                    String str = Float.toString(valueInKM);
                    result.setText(str);
                }
                else{
                    result.setText("No Input Entered");
                }
            }
        });

    }
}