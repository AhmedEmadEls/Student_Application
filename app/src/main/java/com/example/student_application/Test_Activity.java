package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        TextView textView = findViewById(R.id.textView1);
        ImageView imageView = findViewById(R.id.imageView1);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView1);
        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
            //lottieAnimationView.setSpeed(-1);
            //lottieAnimationView.playAnimation();
            // sar = false;
        }else {
            textView.setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.arrows_down);
            //lottieAnimationView.setSpeed(1);
            //lottieAnimationView.playAnimation();
           // sar = true;
        }
    }
    public void m2(View view) {
        TextView textView = findViewById(R.id.textView2);
        ImageView imageView = findViewById(R.id.imageView2);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView2);
        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
           /* lottieAnimationView.setSpeed(-1);
            lottieAnimationView.playAnimation();
            sar = false;
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

    public void m3(View view) {
        TextView textView = findViewById(R.id.textView3);
        ImageView imageView = findViewById(R.id.imageView3);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView2);
        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
           /* lottieAnimationView.setSpeed(-1);
            lottieAnimationView.playAnimation();
            sar = false;
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

    public void m4(View view) {
        TextView textView = findViewById(R.id.textView4);
        ImageView imageView = findViewById(R.id.imageView4);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView2);
        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
           /* lottieAnimationView.setSpeed(-1);
            lottieAnimationView.playAnimation();
            sar = false;
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

    public void m5(View view) {
        TextView textView = findViewById(R.id.textView5);
        ImageView imageView = findViewById(R.id.imageView5);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView5);
        if (textView.getVisibility() == View.GONE){
            textView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.arrows_up);
            /*
            //lottieAnimationView.setSpeed(-1);
           // lottieAnimationView.playAnimation();
            // sar = false;

             */
            }else {
            textView.setVisibility(View.GONE);
            imageView.setImageResource(R.drawable.arrows_down);
            /*
            //lottieAnimationView.setSpeed(1);
            // lottieAnimationView.playAnimation();
            // sar = true;
             */
        }
    }


    public void m6(View view) {
        TextView textView = findViewById(R.id.textView6);
        ImageView imageView = findViewById(R.id.imageView6);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView6);
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
            // sar = true;

             */
        }
    }

    public void bacq(View view) {
        Intent intent = new Intent(this,Main_Activity.class);
        startActivity(intent);
    }

/*
    public void m7(View view) {
        TextView textView = findViewById(R.id.textView7);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView7);
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

    public void m8(View view) {
        TextView textView = findViewById(R.id.textView8);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView8);
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


    public void m9(View view) {
        TextView textView = findViewById(R.id.textView9);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView9);
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


    public void m10(View view) {
        TextView textView = findViewById(R.id.textView10);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView10);
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

    public void m11(View view) {
        TextView textView = findViewById(R.id.textView11);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView11);
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

    public void m12(View view) {
        TextView textView = findViewById(R.id.textView12);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView12);
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

    public void m13(View view) {
        TextView textView = findViewById(R.id.textView13);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView13);
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

    public void m14(View view) {
        TextView textView = findViewById(R.id.textView14);
        //ImageView imageView = findViewById(R.id.imageView5);
        LottieAnimationView lottieAnimationView = findViewById(R.id.imageView14);
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

 */

}