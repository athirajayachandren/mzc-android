package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculatorActivity extends AppCompatActivity {
EditText a1,a2;
Button b1;
String s1,s2,s3;
int number1,number2,number3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        b1=(Button)findViewById(R.id.butt);
        a1=(EditText)findViewById(R.id.num1);
        a2=(EditText)findViewById(R.id.num2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=a1.getText().toString();
                s2=a2.getText().toString();

                number1=Integer.parseInt(s1);
                number2=Integer.parseInt(s2);
                number3=number1+number2;

                s3=String.valueOf(number3);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();

            }
        });
    }
}
