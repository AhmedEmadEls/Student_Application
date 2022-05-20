package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Test_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void m1(View view) {
        TextView textView = findViewById(R.id.textView7);
        ImageView imageView = findViewById(R.id.imageView2);

        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
        }else {
            textView.setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.arrows_down);
        }

    }
}