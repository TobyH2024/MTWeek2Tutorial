package com.example.week2tut;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button = findViewById(R.id.buttonUIEvent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                intent.putExtra("message", "Hello World!");
                startActivity(intent);
            }
        });

        Button buttonL = findViewById(R.id.LocationBut);
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, LocationServicesActivity.class);
                intent.putExtra("message", "Hello World! test");
                startActivity(intent);

            }
        });

        Button buttonF = findViewById(R.id.buttonMLKit);
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MLKitActivity.class);
                intent.putExtra("message", "Hello World! test3");
                startActivity(intent);

            }
        });

        Button buttonSQL = findViewById(R.id.buttonSQLite);
        buttonSQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, SQLiteActivity.class);
                intent.putExtra("message", "Hello World! test4");
                startActivity(intent);

            }
        });

        Button buttonA = findViewById(R.id.buttonAnimate);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, AnimationActivity.class);
                intent.putExtra("message", "Hello World! test5");
                startActivity(intent);

            }
        });

        Button buttonM = findViewById(R.id.buttonMultimedia);
        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MultimediaActivity.class);
                intent.putExtra("message", "Hello World! test6");
                startActivity(intent);

            }
        });
    }

}