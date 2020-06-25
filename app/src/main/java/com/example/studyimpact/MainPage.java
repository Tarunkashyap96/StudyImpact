package com.example.studyimpact;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;


public class MainPage extends AppCompatActivity {

    LinearLayout Video, Notes, doubt;

    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Video = findViewById(R.id.video);
        Notes = findViewById(R.id.note);
        doubt = findViewById(R.id.doubt);

        Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, Video.class);
                startActivity(intent);
            }
         });

         Notes.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainPage.this, Notes.class);
                 startActivity(intent);
              }
         });

         doubt.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainPage.this, Doubt.class);
                 startActivity(intent);
             }
         });
     }
}
