package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class weight_conversion extends AppCompatActivity {

    EditText input1,result1;
    Button mg,gm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_conversion);


        input1 = findViewById(R.id.input1);
        result1 = findViewById(R.id.result1);
        mg = findViewById(R.id.mg);
        gm = findViewById(R.id.gm);

        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input1.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input1.getText().toString());
                    float valueInMG = value*1000000;
                    String str = Float.toString(valueInMG);
                    result1.setText(str);
                }
                else{
                    result1.setText("No Input Entered");
                }
            }
        });

        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input1.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input1.getText().toString());
                    float valueInMG = value*1000;
                    String str = Float.toString(valueInMG);
                    result1.setText(str);
                }
                else{
                    result1.setText("No Input Entered");
                }
            }
        });

    }


}