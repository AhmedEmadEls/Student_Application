package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Shat_Activity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null){
            startActivity(new Intent(this,Room_Chat_Activity1.class));
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shat);
        mAuth = FirebaseAuth.getInstance();
    }
    FirebaseAuth mAuth;

    public void ba(View view) {
        Intent intent = new Intent(this,Main_Activity.class);
        startActivity(intent);
    }






}