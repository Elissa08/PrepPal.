package com.example.prepal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttontosecondpart = findViewById(R.id.buttontosecondpart);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttontosecondpart.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        });
    }
}
