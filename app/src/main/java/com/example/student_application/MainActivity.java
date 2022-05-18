package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    int aa = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void button1(View view) {
        GifImageView gifImageView = findViewById(R.id.gifImageView2);
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button2);
        if (aa == 0){
            gifImageView.setImageResource(R.drawable.lern);
            textView.setText(R.string.next1_De);
            imageView.setImageResource(R.drawable.a2);
            button.setText(R.string.next);
            aa++;

        }else if (aa == 1){
            gifImageView.setImageResource(R.drawable.chat2);
            textView.setText(R.string.next2_De);
            imageView.setImageResource(R.drawable.a3);
            button.setText(R.string.next);
            aa++;
        }else {
            Intent intent = new Intent(this,Main_Activity.class);
            startActivity(intent);
        }
    }

}