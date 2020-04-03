package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goGoogle(View view){
        String url="https://www.google.com/";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
    public void sendEmail(View view){
        String[] EXTRA_EMAIL=new String[]{"khanguyen1000@gmail.com"};
        // Tiêu đề email.
        String EXTRA_SUBJECT="Hi, how are you!";
        // Nội dung email.
        String EXTRA_TEXT ="This is my test email";
        Intent intentemail=new Intent(Intent.ACTION_SEND,Uri.parse("mailto:"));
        intentemail.putExtra(Intent.EXTRA_EMAIL,EXTRA_EMAIL);
        intentemail.putExtra(Intent.EXTRA_SUBJECT,EXTRA_SUBJECT);
        intentemail.putExtra(Intent.EXTRA_TEXT,EXTRA_TEXT);
        intentemail.setType("text/plain");
        startActivity(Intent.createChooser(intentemail, "Choose an email client from..."));

    }
}
