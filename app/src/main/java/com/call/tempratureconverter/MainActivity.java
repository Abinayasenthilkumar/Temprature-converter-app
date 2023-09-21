package com.call.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ctof,ftoc;
    private TextView result;
    private EditText entertemp;
    double result0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctof=findViewById(R.id.ctof);
        ftoc=findViewById(R.id.ftoc);
        result=findViewById(R.id.result);
        entertemp=findViewById(R.id.entertemp);


        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(entertemp.getText().toString());
                result0=(temp * 1.0) +32;
                result.setText(String.valueOf(result0));
            }
        });
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(entertemp.getText().toString());
                result0=(temp - 32) /1.8;
                result.setText(String.valueOf(result0));
            }
        });
    }
}