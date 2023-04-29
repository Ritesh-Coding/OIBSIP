package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mtocm,cmtom,gtokg,kgtog,result;
    EditText inputfromuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtocm=findViewById(R.id.textView3);
        cmtom=findViewById(R.id.textView10);
        gtokg=findViewById(R.id.textView11);
        kgtog=findViewById(R.id.textView12);
        result=findViewById(R.id.value);
        inputfromuser=findViewById(R.id.input);






        mtocm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = inputfromuser.getText().toString().trim();
                if (TextUtils.isEmpty(temp)) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        int value = Integer.parseInt(temp);
                        result.setText(value + " Meter = " + value * 100.00 + " Centimeter");
                    } catch (NumberFormatException e) {
                        Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        cmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp=inputfromuser.getText().toString();

                if (TextUtils.isEmpty(temp)) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
                else {
                    int value = Integer.parseInt(temp);

                    result.setText(value + " Centimeter = " + value / 100.00 + " meter");
                }
            }
        });
        gtokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=inputfromuser.getText().toString();
                if (TextUtils.isEmpty(temp)) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
                else {
                    int value = Integer.parseInt(temp);

                    result.setText(value + " Gram = " + value / 1000.00 + " Kilogram");
                }
            }
        });
        kgtog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=inputfromuser.getText().toString();
                if (TextUtils.isEmpty(temp)) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                }
                else {
                    int value = Integer.parseInt(temp);

                    result.setText(value + " Kilogram = " + value * 1000.00 + "grams");
                }
            }
        });





    }
}