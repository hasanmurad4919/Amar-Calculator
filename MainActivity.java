package com.example.amarcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button addButton;
    Button subButton;
    Button mulButton;
    Button divButton;
    TextView resultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);

        addButton=findViewById(R.id.button1);
        subButton=findViewById(R.id.button2);
        divButton=findViewById(R.id.button4);
        mulButton=findViewById(R.id.button3);
        resultText=findViewById(R.id.resultText);

    }
    public void addition(View v){

        String et1Text=et1.getText().toString(); //getting String from et1
       float et1Number=Float.parseFloat(et1Text); //converting et1 text to float

        String et2Text=et2.getText().toString();//same as et1
       float et2Number=Float.parseFloat(et2Text);// same as et1number

        float result=et1Number+et2Number;
        if(result-(int)result==0){
            resultText.setText((""+(int)result));
        }
        else {

            resultText.setText(("" + result));
        }
    }
    public void subtraction(View v){
        String et1Text=et1.getText().toString(); //getting String from et1
        float et1Number=Float.parseFloat(et1Text); //converting et1 text to float

        String et2Text=et2.getText().toString();//same as et1
        float et2Number=Float.parseFloat(et2Text);// same as et1number

        float result=et1Number-et2Number;



        if(result-(int)result==0){
            resultText.setText((""+(int)result));
        }
        else {

            resultText.setText(("" + result));
        }
    }
    public void multiplication(View v){
        String et1Text=et1.getText().toString(); //getting String from et1
        float et1Number=Float.parseFloat(et1Text); //converting et1 text to float

        String et2Text=et2.getText().toString();//same as et1
        float et2Number=Float.parseFloat(et2Text);// same as et1number

        float result=et1Number*et2Number;


        if(result-(int)result==0){
            resultText.setText((""+(int)result));
        }
        else {

            resultText.setText(("" + result));
        }
    }
    public void division(View v){
        String et1Text=et1.getText().toString(); //getting String from et1
        float et1Number=Float.parseFloat(et1Text); //converting et1 text to float

        String et2Text=et2.getText().toString();//same as et1
        float et2Number=Float.parseFloat(et2Text);// same as et1number
        float result=et1Number/et2Number;

        if(result-(int)result==0){
            resultText.setText((""+(int)result));
        }
        else {

            resultText.setText(("" + result));
        }
    }

}