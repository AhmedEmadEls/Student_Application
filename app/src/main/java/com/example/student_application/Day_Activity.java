package com.example.student_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class Day_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        Intent intent = getIntent();
        int posi = intent.getIntExtra("posi",0);

        if (posi == 0){
            TextView textView = findViewById(R.id.textView1);
            //textView.setText(R.string.day +"-" + R.string.schedules);
            Toast.makeText(Day_Activity.this , R.string.schedules , Toast.LENGTH_SHORT).show();
            }else if (posi == 1){
            TextView textView = findViewById(R.id.textView1);
            //textView.setText(R.string.day +"-" + R.string.Section_table)
            //;
            Toast.makeText(Day_Activity.this , R.string.Section_table , Toast.LENGTH_SHORT).show();
        }

    }

    public void bada(View view) {
        Intent intent = new Intent(this , Main_Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}