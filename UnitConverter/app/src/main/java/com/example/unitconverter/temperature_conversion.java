package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class temperature_conversion extends AppCompatActivity {

    EditText input5,result5;
    Button K,F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature);

        input5 = findViewById(R.id.input5);
        result5=findViewById(R.id.result5);
        K=findViewById(R.id.kelvin);
        F=findViewById(R.id.fahrenheit);


        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input5.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input5.getText().toString());
                    float valueInK = (float) (value*274.15);
                    String str = Float.toString(valueInK);
                    result5.setText(str);
                }
                else{
                    result5.setText("No Input Entered");
                }
            }
        });

        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = input5.getText().toString();
                if(!val.equals("")){
                    float value = Float.parseFloat(input5.getText().toString());
                    float valueInF = (float) (value*33.8);
                    String str = Float.toString(valueInF);
                    result5.setText(str);
                }
                else{
                    result5.setText("No Input Entered");
                }
            }
        });


    }
}