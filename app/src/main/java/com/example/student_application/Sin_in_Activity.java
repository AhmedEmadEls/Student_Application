package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sin_in_Activity extends AppCompatActivity {

    SharedPreferences sharedPref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_in);


        TextView usarname , password;

        usarname =findViewById(R.id.edit_usar);
        password= findViewById(R.id.editTextTextPassword);
        Button sinButton = findViewById(R.id.button);

        sharedPref = getSharedPreferences("MyUserPrefs" , Context.MODE_PRIVATE);


        SharedPreferences sp = getApplicationContext().getSharedPreferences("MyUserPrefs" , Context.MODE_PRIVATE);
        String s =sp.getString("unit","null");

            sinButton.setOnClickListener(new View.OnClickListener() {
                SharedPreferences.Editor editor = sharedPref.edit();

                @Override
                public void onClick(View view) {
                    if (usarname.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                        Intent intent = new Intent(Sin_in_Activity.this, Main_Activity.class);
                        editor.putString("usarname", "true");
                        startActivity(intent);
                    } else {
                        Toast.makeText(Sin_in_Activity.this, "Sin Failed !!!", Toast.LENGTH_LONG).show();
                        editor.putString("unit", "false");
                    }
                }
            });

    }
}