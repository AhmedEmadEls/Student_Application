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


    TextView textView1 ,textView2 , textView3 , textView4 , textView5, textView6 , textView7 , textView8 , textView9
            , textView10 , textView11 , textView12 , textView13;
    ImageView imageView1 , imageView2 , imageView3 , imageView4 , imageView5 , imageView6 , imageView7 ,imageView8
            ,imageView9 ,imageView10 ,imageView11 ,imageView12 ,imageView13;


    public void m1(View view) {

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);


        if (textView1.getVisibility() == View.GONE){

            textView1.setVisibility(View.VISIBLE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_up);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);


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
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView2.getVisibility() == View.GONE){

            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.VISIBLE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_up);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);
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
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView3.getVisibility() == View.GONE){

            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_up);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

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
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView4.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.VISIBLE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_up);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

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
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView5);
        if (textView5.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.VISIBLE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_up);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

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
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        //LottieAnimationView lottieAnimationView = findViewById(R.id.imageView6);
        if (textView6.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.VISIBLE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_up);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

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
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView7.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.VISIBLE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_up);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

        }else {
            textView7.setVisibility(View.GONE);
            imageView7.setImageResource(R.drawable.arrows_down);

        }
    }

    public void m8(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView8.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.VISIBLE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_up);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

        }else {
            textView8.setVisibility(View.GONE);
            imageView8.setImageResource(R.drawable.arrows_down);

        }
    }


    public void m9(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView9.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.VISIBLE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_up);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

        }else {
            textView9.setVisibility(View.GONE);
            imageView9.setImageResource(R.drawable.arrows_down);

        }
    }


    public void m10(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView7.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.VISIBLE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_up);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

        }else {
            textView10.setVisibility(View.GONE);
            imageView10.setImageResource(R.drawable.arrows_down);

        }
    }

    public void m11(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView7.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.VISIBLE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_up);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_down);

        }else {
            textView11.setVisibility(View.GONE);
            imageView11.setImageResource(R.drawable.arrows_down);

        }
    }

    public void m12(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView7.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.VISIBLE);
            textView13.setVisibility(View.GONE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_up);
            imageView13.setImageResource(R.drawable.arrows_down);

        }else {
            textView12.setVisibility(View.GONE);
            imageView12.setImageResource(R.drawable.arrows_down);

        }
    }

    public void m13(View view) {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);

        if (textView7.getVisibility() == View.GONE){
            textView1.setVisibility(View.GONE);
            textView2.setVisibility(View.GONE);
            textView3.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
            textView5.setVisibility(View.GONE);
            textView6.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
            textView8.setVisibility(View.GONE);
            textView9.setVisibility(View.GONE);
            textView10.setVisibility(View.GONE);
            textView11.setVisibility(View.GONE);
            textView12.setVisibility(View.GONE);
            textView13.setVisibility(View.VISIBLE);

            imageView1.setImageResource(R.drawable.arrows_down);
            imageView2.setImageResource(R.drawable.arrows_down);
            imageView3.setImageResource(R.drawable.arrows_down);
            imageView4.setImageResource(R.drawable.arrows_down);
            imageView5.setImageResource(R.drawable.arrows_down);
            imageView6.setImageResource(R.drawable.arrows_down);
            imageView7.setImageResource(R.drawable.arrows_down);
            imageView8.setImageResource(R.drawable.arrows_down);
            imageView9.setImageResource(R.drawable.arrows_down);
            imageView10.setImageResource(R.drawable.arrows_down);
            imageView11.setImageResource(R.drawable.arrows_down);
            imageView12.setImageResource(R.drawable.arrows_down);
            imageView13.setImageResource(R.drawable.arrows_up);

        }else {
            textView13.setVisibility(View.GONE);
            imageView13.setImageResource(R.drawable.arrows_down);

        }
    }





}