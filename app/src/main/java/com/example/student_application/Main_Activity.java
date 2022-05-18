package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void button(View view) {
        TextView textView = findViewById(R.id.textView8);
        textView.setText("hi");

    }

    public void sinout(View view) {
        Intent intent = new Intent(this,Sin_in_Activity.class);
        startActivity(intent);
    }

    public void ser(View view) {
        Intent intent = new Intent(this , Servise_Activity.class);
        startActivity(intent);
    }
}