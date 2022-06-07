package com.example.student_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Sin_in_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_in);


        TextView usarname , password;

        usarname =findViewById(R.id.edit_usar);
        password= findViewById(R.id.editTextTextPassword);
        Button sinButton = findViewById(R.id.button);

        sinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usarname.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                    Intent intent = new Intent(Sin_in_Activity.this,Main_Activity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Sin_in_Activity.this , "Sin Failed !!!" , Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}