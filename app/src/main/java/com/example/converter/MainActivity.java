package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /* id's
        convertBtn
        swapBtn
        clearBtn
        backBtn
        input
        inputLabel
        result
        resultLabel
    */

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convert_Button = findViewById(R.id.convertBtn);
        Button swap_Button =  findViewById(R.id.swapBtn);
        Button clear_Button =  findViewById(R.id.clearBtn);
        Button back_Button =  findViewById(R.id.backBtn);
        TextView input_Label = findViewById(R.id.inputLabel);
        TextView result_Label = findViewById(R.id.resultLabel);
        TextView label = findViewById(R.id.label);
        int id = getIntent().getIntExtra("id",0);



        try{
            convert_Button.setOnClickListener(this);
            swap_Button.setOnClickListener(this);
            clear_Button.setOnClickListener(this);
            back_Button.setOnClickListener(this);

            switch(id)
            {
                case 1:
                    label.setText("Temperature");
                    input_Label.setText("(Celsius)");
                    result_Label.setText("(Fahrenheit)");
                    break;
                case 2:
                    label.setText("Distance");
                    input_Label.setText("(Kilometers)");
                    result_Label.setText("(Miles)");
                    break;
                case 3:
                    label.setText("Weight");
                    input_Label.setText("(Kilograms)");
                    result_Label.setText("(Pounds)");
                    break;
            }
        }
        catch (Exception e){

        }
    }




    @Override
    public void onClick(View arg0) {

        TextView input_Label = findViewById(R.id.inputLabel);
        TextView result_Label = findViewById(R.id.resultLabel);
        TextView result = findViewById(R.id.result);
        EditText input = findViewById(R.id.input);
        int id = getIntent().getIntExtra("id",0);

        switch (arg0.getId()) {
            case R.id.convertBtn:
                switch(id)
                {
                    case 1:
                        if(result_Label.getText().equals("(Fahrenheit)")) {
                            try {
                                String in = input.getText().toString().trim();
                                double i = Double.parseDouble(in);
                                double o = (i*9/5) + 32;
                                result.setText(Double.toString(o));

                            }
                            catch (Exception e){
                                toast = Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                        else {

                            try {
                                String in = input.getText().toString().trim();
                                double i = Double.parseDouble(in);
                                double o = (i-32) * 5/9;
                                result.setText(Double.toString(o));

                            }
                            catch (Exception e){
                                toast = Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT);
                                toast.show();
                            }

                        }
                        break;
                    case 2:
                        if(result_Label.getText().equals("(Miles)")) {
                            try {
                                String in = input.getText().toString().trim();
                                double i = Double.parseDouble(in);
                                double o = i*(0.6213711922);
                                result.setText(Double.toString(o));

                            }
                            catch (Exception e){
                                toast = Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                        else {

                            try {
                                String in = input.getText().toString().trim();
                                double i = Double.parseDouble(in);
                                double o = i*1.609344;
                                result.setText(Double.toString(o));

                            }
                            catch (Exception e){
                                toast = Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT);
                                toast.show();
                            }

                        }
                        break;
                    case 3:
                        if(result_Label.getText().equals("(Pounds)")) {

                            try {
                                String in = input.getText().toString().trim();
                                double i = Double.parseDouble(in);
                                double o = i*(2.204622476);
                                result.setText(Double.toString(o));

                            }
                            catch(Exception e){
                                toast = Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                        else {

                            try{
                                String in = input.getText().toString().trim();
                                double i = Double.parseDouble(in);
                                double o = i*0.4535924;
                                result.setText(Double.toString(o));

                            }
                            catch (Exception e){
                                toast = Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT);
                                toast.show();
                            }

                        }
                        break;



                }

                break;

            case R.id.swapBtn:
                if (id == 1) {
                    if(result_Label.getText().equals("(Celsius)")) {
                        result_Label.setText("(Fahrenheit)");
                        input_Label.setText("(Celsius)");
                    }
                    else {
                        result_Label.setText("(Celsius)");
                        input_Label.setText("(Fahrenheit)");
                    }
                }
                else if (id == 2) {
                    if(result_Label.getText().equals("(Kilometers)")) {
                        result_Label.setText("(Miles)");
                        input_Label.setText("(Kilometers)");
                    }
                    else {
                        result_Label.setText("(Kilometers)");
                        input_Label.setText("(Miles)");
                    }
                }
                else if (id == 3)
                {
                    if(result_Label.getText().equals("(Kilograms)")) {
                        result_Label.setText("(Pounds)");
                        input_Label.setText("(Kilograms)");
                    }
                    else {
                        result_Label.setText("(Kilograms)");
                        input_Label.setText("(Pounds)");
                    }
                }

                break;
            case R.id.clearBtn:
                input.setText("");
                result.setText("0");
                break;
            case R.id.backBtn:
//                toast = Toast.makeText(this, "Clicked Red Button!", Toast.LENGTH_SHORT);
//                toast.show();
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
                break;
        }

    }


}






