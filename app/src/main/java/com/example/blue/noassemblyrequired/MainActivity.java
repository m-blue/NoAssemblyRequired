package com.example.blue.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIkeaDresser = (Button)findViewById(R.id.btnIKEADresser);
        Button btnBicycle = (Button)findViewById(R.id.btnBicycle);
        Button btnWoodPatio = (Button)findViewById(R.id.btnWoodPatio);

        btnIkeaDresser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IkeaDresser.class));
            }
        });

        btnBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Bicycle.class));
            }
        });

        btnWoodPatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WoodPatio.class));
            }
        });
    }
}
