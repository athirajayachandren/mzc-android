package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7;
Button b1,b2;
String getname,getanum,getmob,getmail,getuname,getpass,getcpass;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.anum);
        e3=(EditText)findViewById(R.id.mob);
        e4=(EditText)findViewById(R.id.email);
        e5=(EditText)findViewById(R.id.usn);
        e6=(EditText)findViewById(R.id.pass);
        e7=(EditText)findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.areg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=e1.getText().toString();
                getanum=e2.getText().toString();
                getmob=e3.getText().toString();
                getmail=e4.getText().toString();
                getuname=e5.getText().toString();
                getpass=e6.getText().toString();
                getcpass=e7.getText().toString();

                if(getpass.equals(getcpass))
                {
                    Toast.makeText(getApplicationContext(),getpass,Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"password &conform password does not match",Toast.LENGTH_LONG).show();
                }


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(j);
            }
        });
    }
}
