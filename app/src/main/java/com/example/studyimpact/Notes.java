package com.example.studyimpact;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Notes extends AppCompatActivity {

    LinearLayout maths, economic, geography, history, indian, science, reasoning, english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        maths = findViewById(R.id.maths);
        economic = findViewById(R.id.economic);
        geography = findViewById(R.id.geography);
        history = findViewById(R.id.history);
        indian = findViewById(R.id.indian);
        science = findViewById(R.id.science);
        reasoning = findViewById(R.id.reasoning);
        english = findViewById(R.id.english);

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait Math Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, Maths.class);
                startActivity(intent);
            }
        });

        economic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait Economic Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, Economic.class);
                startActivity(intent);
            }
        });

        geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait Geography Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, Geography.class);
                startActivity(intent);
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait Science Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, Science.class);
                startActivity(intent);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait History Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, History.class);
                startActivity(intent);
            }
        });

        indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait Indian Constitution Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, Indian.class);
                startActivity(intent);
            }
        });

        reasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait Reasoning Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, Reasoning.class);
                startActivity(intent);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Notes.this, "Please wait English Note's is loading", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Notes.this, English.class);
                startActivity(intent);
            }
        });

    }
}
