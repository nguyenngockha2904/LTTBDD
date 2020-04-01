package com.example.lab7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {
    TextView txtkq;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //lay intent tu activity nay
        Intent callerIntent=getIntent();
        //lay bundle dưa vào mypackage
        Bundle packagefromCaller=callerIntent.getBundleExtra("mypackage");
        int a=packagefromCaller.getInt("soa");
        int b=packagefromCaller.getInt("sob");
        txtkq=(TextView)this.findViewById(R.id.txtKetQua);
        giaipt(a,b);
        btnBack=(Button) this.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
    public void giaipt(int a,int b){
        String kq="";
        if(a==0 && b==0)
        {
            kq="Vô số nghiệm";
        }
        else if(a==0 && b!=0)
        {
            kq="Vô nghiệm";
        }
        else
        {
            DecimalFormat dcf=new DecimalFormat("0.##");
            kq=dcf.format(-b*1.0/a);
        }
        txtkq.setText(kq);
    }
}

