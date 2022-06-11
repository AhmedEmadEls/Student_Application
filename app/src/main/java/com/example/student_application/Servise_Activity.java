package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.net.URL;

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
        String url = "https://forms.gle/4TTP93wTmr63GRCf6";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void acadimic(View view) {
        String url = "http://comm.nilehi.edu.eg/static/index.html";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}