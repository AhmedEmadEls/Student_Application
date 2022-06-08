package com.example.student_application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import pl.droidsonroids.gif.GifImageButton;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    int aa = 0 ;
    ImageView gif ;
    int start = 1 ;
    int wastart ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void button1(View view) {
        GifImageView gifImageView;
        gif = findViewById(R.id.gifImageView2);
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button2);
        if (aa == 0){
            gif.setImageResource(R.drawable.lern);
            textView.setText(R.string.next1_De);
            imageView.setImageResource(R.drawable.a2);
            button.setText(R.string.next);
            aa++;

        }else if (aa == 1){
            gif.setImageResource(R.drawable.chat2);
            textView.setText(R.string.next2_De);
            imageView.setImageResource(R.drawable.a3);
            button.setText(R.string.next);
            aa++;
        }else {
            Intent intent = new Intent(MainActivity.this,Sin_in_Activity.class);
            startActivity(intent);
        }
    }

}