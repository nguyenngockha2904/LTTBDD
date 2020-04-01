package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Button btnBack=(Button) this.findViewById(R.id.btnBackMain);
        btnBack.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0){
                finish();
            }
        });
    }
}
