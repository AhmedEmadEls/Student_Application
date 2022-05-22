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
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText("Ahmed Emad Elshabrawi");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("رابعة نظم ");
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("1801022");

    }

    public void button(View view) {
        Intent  intent = new Intent(this,Day_Activity.class);
        startActivity(intent);
    }

    public void sinout(View view) {
        Intent intent = new Intent(this,Sin_in_Activity.class);
        startActivity(intent);
    }

    public void ser(View view) {
        Intent intent = new Intent(this , Servise_Activity.class);
        startActivity(intent);
    }

    public void qanda(View view) {
        Intent intent = new Intent(this,Test_Activity.class);
        startActivity(intent);
    }


    public void not(View view) {
        Intent intent = new Intent(this,Notification_Activity.class);
        startActivity(intent);
    }
}