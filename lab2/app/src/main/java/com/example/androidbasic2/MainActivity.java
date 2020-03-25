package com.example.androidbasic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lay button theo id

        Button btn1 = (Button) this.findViewById(R.id.go_button1);
        Button btn2= (Button) this.findViewById(R.id.go_button2);
        Button btn3=(Button) this.findViewById(R.id.go_button3);
        Button btn4=(Button) this.findViewById(R.id.go_button4);
        Button btn5=(Button) this.findViewById(R.id.go_button5);

        //set dat su kien click vao button1.
        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                //tao mot intend

                //mang noi dung gui toi Example1Activity

                Intent myintend= new Intent(MainActivity.this,Example1Activity.class);

                //cac tham so gan tren Intent(khong bat buoc)
                myintend.putExtra("text1","this is text");
                myintend.putExtra("text2","this is long text");

                //yeu cau chạy Example1Activity
                MainActivity.this.startActivity(myintend);
            }
        });
        //set dat su kien onclick vao button 2.
        btn2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                //tao mot intent
                Intent intentBtn2=new Intent(MainActivity.this,Example2Activity.class);
                //cac tham so gan tren Intent(ko bat buoc)
                intentBtn2.putExtra("text1","kha dep trai btn2_1");
                intentBtn2.putExtra("text2","kha dep trai btn2_2");
                //yeu cau chay Example2Activity
                MainActivity.this.startActivity(intentBtn2);
            }
        });
        //set dat su kien onClick vao button 3.
        btn3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                //tao intent
                Intent intentbtn3=new Intent(MainActivity.this,Example3Activity.class);
                //cac tham so gan tren Intent
                intentbtn3.putExtra("text1","kha dep vai~ ĐÁI");
                //yeu cau chay Example3Activity
                MainActivity.this.startActivity(intentbtn3);
            }
        });
        //set dat su kien onClick vao button 4
        btn4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                //tao intent
                Intent intBtn4=new Intent(MainActivity.this,Example4Activity.class);
                //tham so
                intBtn4.putExtra("text1","kha kha kha");
                //yeu cau chay
                MainActivity.this.startActivity(intBtn4);
            }
        });
        btn5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                //tao intent
                Intent intBtn5=new Intent(MainActivity.this,Example5Activity.class);
                //gang gia tri
                intBtn5.putExtra("tet3","kha dep trai");
                //yeu cau
                MainActivity.this.startActivity(intBtn5);
            }
        });




    }

    }
