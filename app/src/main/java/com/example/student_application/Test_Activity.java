package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Test_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }

    public void m1(View view) {
        TextView textView = findViewById(R.id.textView7);
        ImageView imageView = findViewById(R.id.imageView2);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView2);



        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            //imageView.setImageResource(R.drawable.arrows_up);
            lottieAnimationView.setSpeed(-1);
            lottieAnimationView.playAnimation();
           // sar = false;

        }else {
            textView.setVisibility(View.GONE);
            //imageView.setImageResource(R.drawable.arrows_down);

            lottieAnimationView.setSpeed(1);
            lottieAnimationView.playAnimation();
           // sar = true;

        }

    }

    public void m2(View view) {
        TextView textView = findViewById(R.id.textView11);
        ImageView imageView = findViewById(R.id.imageView3);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView2);


        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
           /* lottieAnimationView.setSpeed(-1);
            lottieAnimationView.playAnimation();
            // sar = false;

            */

        }else {
            textView.setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.arrows_down);
/*
lottieAnimationView.setSpeed(1);
            lottieAnimationView.playAnimation();
 */



        }

    }
}