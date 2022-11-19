package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume_conversion extends AppCompatActivity {

    EditText input3,result3;
    Button cubic_cm,ml,l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_conversion);

        input3 = findViewById(R.id.input3);
        result3=findViewById(R.id.result3);
        cubic_cm=findViewById(R.id.cubic_cm);
        ml=findViewById(R.id.milliliter);
        l=findViewById(R.id.liter);

        cubic_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input3.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input3.getText().toString());
                    float valueInCubCm = value*1000000;
                    String str = Float.toString(valueInCubCm);
                    result3.setText(str);
                }
                else{
                    result3.setText("No Input Entered");
                }
            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input3.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input3.getText().toString());
                    float valueInMl = value*1000000;
                    String str = Float.toString(valueInMl);
                    result3.setText(str);
                }
                else{
                    result3.setText("No Input Entered");
                }
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input3.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input3.getText().toString());
                    float valueInL = value*1000;
                    String str = Float.toString(valueInL);
                    result3.setText(str);
                }
                else{
                    result3.setText("No Input Entered");
                }
            }
        });

    }
}