package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener  {

    EditText no1;
    EditText no2;
    Button bt0, bt1 ,bt2 ,bt3 ,bt4;
    TextView tot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        no1=(EditText)findViewById(R.id.editText1);
        no2=(EditText)findViewById(R.id.editText2);
        tot=(TextView)findViewById(R.id.textView);
        bt0=(Button)findViewById(R.id.home1);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });


    }
    public void openNewActivity(){
        Intent intent= new Intent(this, Home.class );
        startActivity(intent);
    }
    public void onClick(View v) {


            if (v.getId() == R.id.button1) {
                tot.setText(String.valueOf(Integer.parseInt(no1.getText().toString()) + Integer.parseInt(no2.getText().toString())));
            }
            if (v.getId() == R.id.button2) {
                tot.setText(String.valueOf(Integer.parseInt(no1.getText().toString()) - Integer.parseInt(no2.getText().toString())));
            }
            if (v.getId() == R.id.button3) {
                tot.setText(String.valueOf(Integer.parseInt(no1.getText().toString()) * Integer.parseInt(no2.getText().toString())));
            }
            if (v.getId() == R.id.button4) {
                tot.setText(String.valueOf(Float.parseFloat(no1.getText().toString()) / Float.parseFloat(no2.getText().toString())));
            }
        }
    }
