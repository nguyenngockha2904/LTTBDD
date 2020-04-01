 package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen=(Button) this.findViewById(R.id.btnOpenChild);
        btnOpen.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0){
                doOpenChildActivity();
            }
        });
    }
    public void doOpenChildActivity(){
        Intent intent=new Intent(MainActivity.this,ChildActivity.class);
        MainActivity.this.startActivity(intent);

    }
 }
