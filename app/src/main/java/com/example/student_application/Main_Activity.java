package com.example.student_application;

import static com.example.student_application.card.FirebaseCaeds.mAuth;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseUser;

public class Main_Activity extends AppCompatActivity {

    protected void onStart() {

        super.onStart();
    }

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

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    int i ;

    public void button(View view) {
        Intent  intent = new Intent(this,Day_Activity.class);
        i = 0;
        intent.putExtra("posi",i);
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

    public void chat(View view) {
        Intent intent = new Intent(this,Shat_Activity.class);
        startActivity(intent);
    }

    public void secshin(View view) {
        Intent intent = new Intent(this,Day_Activity.class);
        i = 1;
        intent.putExtra("posi",i);
        startActivity(intent);
    }

    public void notavilobol(View view) {
        Intent intent = new Intent(this,NoteActivity1.class);
        startActivity(intent);
    }
}