package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class speed_conversion extends AppCompatActivity {
    EditText input4,result4;
    Button mph,km_s,km_h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_conversion);

        input4 = findViewById(R.id.input4);
        result4=findViewById(R.id.result4);
        mph=findViewById(R.id.mph);
        km_s=findViewById(R.id.km_s);
        km_h=findViewById(R.id.km_h);

        mph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input4.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input4.getText().toString());
                    float valueInMph = (float) (value*2.23693);
                    String str = Float.toString(valueInMph);
                    result4.setText(str);
                }
                else{
                    result4.setText("No Input Entered");
                }
            }
        });

        km_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input4.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input4.getText().toString());
                    float valueInkm_s = value/1000;
                    String str = Float.toString(valueInkm_s);
                    result4.setText(str);
                }
                else{
                    result4.setText("No Input Entered");
                }
            }
        });

        km_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input4.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input4.getText().toString());
                    float valueInKM_h = (float) (value*3.6);
                    String str = Float.toString(valueInKM_h);
                    result4.setText(str);
                }
                else{
                    result4.setText("No Input Entered");
                }
            }
        });
    }
}