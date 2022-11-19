package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val = findViewById(R.id.input);
        val.setShowSoftInputOnFocus(false);
        val.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.enter_value).equals(val.getText().toString())){
                    val.setText("");
                }
            }
        });
    }

    private void Update(String str)
    {
        String oldStr = val.getText().toString();
        int CursorPosition = val.getSelectionEnd();
        String left = oldStr.substring(0,CursorPosition);
        String right = oldStr.substring(CursorPosition);

        if(getString(R.string.enter_value).equals(val.getText().toString()))
        {
            val.setText(str);
            val.setSelection(CursorPosition + 1);
        }
        else {
            val.setText(String.format("%s%s%s", left, str, right));
            val.setSelection(CursorPosition + 1);
        }
    }

    public void zero(View v)
    {
        Update("0");
    }
    public void one(View v)
    {
        Update("1");
    }
    public void two(View v)
    {
        Update("2");
    }
    public void three(View v)
    {
        Update("3");
    }
    public void four(View v)
    {
        Update("4");
    }
    public void five(View v)
    {
        Update("5");
    }
    public void six(View v)
    {
        Update("6");
    }
    public void seven(View v)
    {
        Update("7");
    }
    public void eight(View v)
    {
        Update("8");
    }
    public void nine(View v)
    {
        Update("9");
    }
    public void bracket(View v)
    {
        int CursorPosition = val.getSelectionStart();
        int openPar = 0;
        int closedPar = 0;
        int textLen = val.getText().length();

        for(int i=0;i<CursorPosition;i++)
        {
            if(val.getText().toString().substring(i,i+1).equals("("))
            {
                openPar +=1;
            }
            if(val.getText().toString().substring(i,i+1).equals(")"))
            {
                closedPar +=1;
            }
        }
        if(openPar==closedPar || val.getText().toString().substring(textLen-1,textLen).equals("(")){
            Update("(");

        }
        else if(openPar > closedPar && !val.getText().toString().substring(textLen-1,textLen).equals("(")){
            Update(")");

        }
        val.setSelection(CursorPosition+1);
    }
    public void divide(View v)
    {
        Update("/");
    }
    public void multiply(View v)
    {
        Update("*");
    }
    public void minus(View v)
    {
        Update("-");
    }
    public void plus(View v)
    {
        Update("+");
    }
    public void power(View v)
    {
        Update("^");
    }
    public void point(View v)
    {
        Update(".");
    }
    public void clear(View v)
    {
        val.setText("");
    }
    public void back(View v)
    {
        int CursorPosition = val.getSelectionStart();
        int textLen = val.getText().length();
        if(CursorPosition!=0 && textLen !=0)
        {
            SpannableStringBuilder selection = (SpannableStringBuilder) val.getText();
            selection.replace(CursorPosition-1,CursorPosition,"");
            val.setText(selection);
            val.setSelection(CursorPosition-1);
        }
    }
    public void equal(View v)
    {
        String expression = val.getText().toString();
        expression = expression.replaceAll("÷","/");
        expression = expression.replaceAll("×","*");

        Expression exp = new Expression(expression);
        String result = String.valueOf(exp.calculate());
        val.setText(result);
        val.setSelection(result.length());
    }
}