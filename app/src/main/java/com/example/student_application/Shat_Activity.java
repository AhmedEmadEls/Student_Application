package com.example.student_application;

import static com.example.student_application.card.FirebaseCaeds.MAIN_CHAT_DATABASE;
import static com.example.student_application.card.FirebaseCaeds.mAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FieldValue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Shat_Activity extends AppCompatActivity {
    EditText chat_box;
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null){
            startActivity(new Intent(this,Room_Chat_Activity1.class));
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shat);


        chat_box = findViewById(R.id.Messea);

    }

    public void back (View view) {
        Intent intent = new Intent(this,Main_Activity.class);
        startActivity(intent);
    }



    public void addMessage(View view) {
        chat_box = findViewById(R.id.Messea);
        String message = chat_box.getText().toString();
        FirebaseUser user = mAuth.getCurrentUser();


        if(!TextUtils.isEmpty(message)){

            // Generate messageID using the current date.

            Date today = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-HH:mm:ss");
            String messageTD = format.format(today);

            //Getting username from google account

            String user_image_url = "";
            String name = "Ahmed";
            Uri photoUrl = user.getPhotoUrl();
            String originalUrl = "s96-c/photo.jpg";
            String resizeImageUrl = "s400-c/photo.jpg";
            if (photoUrl != null){
                String photoPath = photoUrl.toString();
                user_image_url = photoPath.replace(originalUrl,resizeImageUrl);
            }

            HashMap<String,Object> massageObj = new HashMap<>();
            massageObj.put("message",message);
            massageObj.put("user_name",user.getDisplayName());
            massageObj.put("timestamp", FieldValue.serverTimestamp());
            massageObj.put("messageID",messageTD);
            massageObj.put("user_image_url",user_image_url);
            massageObj.put("name",name);

            MAIN_CHAT_DATABASE.document(messageTD).set(massageObj).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(Shat_Activity.this, "Message Send", Toast.LENGTH_SHORT).show();
                        chat_box.setText("");
                    }else {
                        Toast.makeText(Shat_Activity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }

    }






}