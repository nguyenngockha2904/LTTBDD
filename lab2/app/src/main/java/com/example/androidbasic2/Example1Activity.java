package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Example1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);


        Intent intent=getIntent();
        //tham so trong intent truyen sang tu MainActivity
        String value1=intent.getStringExtra("tex1");
        String value2=intent.getStringExtra("tex2");
        //lay ra doi tuong tren giao dien boi id cua no
        final TextView txt1=(TextView)this.findViewById(R.id.txtExample1A_1);
        final TextView txt2=(TextView)this.findViewById(R.id.txtExample1A_2);
        txt1.setText(value1);

        Button btn1=(Button)this.findViewById(R.id.go_activity);
        btn1.setOnLongClickListener(new Button.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v){
                txt2.setText("You long click button");
                return true;

            }
        });

    }
}
