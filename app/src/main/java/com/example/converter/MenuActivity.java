package com.example.converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {


    Button temp_Btn,distance_Btn,weight_Btn;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        temp_Btn = (Button)findViewById(R.id.tempBtn);
        distance_Btn = (Button)findViewById(R.id.distanceBtn);
        weight_Btn = (Button) findViewById(R.id.weightBtn);

        temp_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MenuActivity.this, "Selected Temperature!", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("id",1);
                startActivity(intent);
                finish();
            }
        });
        distance_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MenuActivity.this, "Selected Distance!", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("id",2);
                startActivity(intent);
                finish();
            }
        });
        weight_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast = Toast.makeText(MenuActivity.this, "Selected Weight!", Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("id",3);
                startActivity(intent);
                finish();

            }
        });

    }
}
