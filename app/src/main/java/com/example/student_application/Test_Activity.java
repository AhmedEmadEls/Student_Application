package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Test_Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }

    TextView textView1 ,textView2 , textView3 , textView4 , textView5, textView6 , textView7  ;
    ImageView imageView1 , imageView2 , imageView3 , imageView4 , imageView5 , imageView6 , imageView7;

    public void m1(View view) {

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

        if (textView1.getVisibility() == View.GONE){

            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_up);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);

        }else {

            textView1.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_down);

        }
    }

    public void m2(View view) {

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

        if (textView2.getVisibility() == View.GONE){

            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_up);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
        }else {
            textView2.setVisibility(View.GONE);
            imageView2.setImageResource(R.drawable.arrows_down);

        }

    }

    public void m3(View view) {

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

        if (textView3.getVisibility() == View.GONE){

            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_up);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);

        }else {

            textView3.setVisibility(View.GONE);
            imageView3.setImageResource(R.drawable.arrows_down);

        }

    }

    public void m4(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);

        if (textView4.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.VISIBLE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_up);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);

        }else {

            textView4.setVisibility(View.GONE);
            imageView4.setImageResource(R.drawable.arrows_down);
        }

    }

    public void m5(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView5);
        if (textView5.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.VISIBLE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_up);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);

            }else {

            textView5.setVisibility(View.GONE);
            imageView5.setImageResource(R.drawable.arrows_down);

        }
    }


    public void m6(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView6);
        if (textView6.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.VISIBLE);
            textView7.setVisibility(View.GONE);
            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_up);
            imageView7.setImageResource(R.drawable.arrows_down);

        }else {
            textView6.setVisibility(View.GONE);
            imageView6.setImageResource(R.drawable.arrows_down);
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


    public void m7(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView7);
        if (textView7.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.VISIBLE);
            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_up);

        }else {
            textView7.setVisibility(View.GONE);
            imageView7.setImageResource(R.drawable.arrows_down);

        }
    }
/*
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