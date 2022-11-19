package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class area_conversion extends AppCompatActivity {
    EditText input2,result2;
    Button sq_mm,sq_cm,sq_km,hectare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_conversion);

        input2 = findViewById(R.id.input2);
        result2=findViewById(R.id.result2);
        sq_mm=findViewById(R.id.sq_mm);
        sq_cm=findViewById(R.id.sq_cm);
        sq_km=findViewById(R.id.sq_km);
        hectare = findViewById(R.id.hectare);

        sq_mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input2.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input2.getText().toString());
                    float valueInMM_SQ = value*1000000;
                    String str = Float.toString(valueInMM_SQ);
                    result2.setText(str);
                }
                else{
                    result2.setText("No Input Entered");
                }
            }
        });

        sq_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input2.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input2.getText().toString());
                    float valueInCM_SQ = value*10000;
                    String str = Float.toString(valueInCM_SQ);
                    result2.setText(str);
                }
                else{
                    result2.setText("No Input Entered");
                }
            }
        });

        sq_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input2.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input2.getText().toString());
                    float valueInKM_SQ = value/1000000;
                    String str = Float.toString(valueInKM_SQ);
                    result2.setText(str);
                }
                else{
                    result2.setText("No Input Entered");
                }
            }
        });

        hectare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input2.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input2.getText().toString());
                    float valueInHec = value/10000;
                    String str = Float.toString(valueInHec);
                    result2.setText(str);
                }
                else{
                    result2.setText("No Input Entered");
                }
            }
        });
    }
}