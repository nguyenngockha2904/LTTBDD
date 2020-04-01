package com.example.lab7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txta,txtb;
    Button btnKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKq=(Button) this.findViewById(R.id.btnKetQua);
        txta=(EditText)findViewById(R.id.txtSoa);
        txtb=(EditText)findViewById(R.id.txtSob);

        btnKq.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                Bundle bundle=new Bundle();
                int a=Integer.parseInt(txta.getText().toString());
                int b=Integer.parseInt(txtb.getText().toString());
                bundle.putInt("soa",a);
                bundle.putInt("sob",b);
                //dua bundle vào intent
                intent.putExtra("mypackage",bundle);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
