package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Servise_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servise);
    }

    public void backmi(View view) {
        Intent intent = new Intent(this , Main_Activity.class);
        startActivity(intent);
    }

    public void notnaw(View view) {
        Intent intent = new Intent(this ,NotActivity.class);
        startActivity(intent);

    }
}