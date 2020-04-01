package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btncong,btntru,btnnhan,btnchia;
    EditText editsoa,editsob;
    TextView txtkq;
    View.OnClickListener  myclick=new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            switch (arg0.getId()){
                case R.id.btnCong:{
                    String soa=editsoa.getText()+"";
                    String sob=editsob.getText()+"";
                    int a=Integer.parseInt(soa);
                    int b=Integer.parseInt(sob);
                    txtkq.setText(a+"+"+b+"= "+(a+b));
                    break;
                }
                case R.id.btnTru:{
                    String soa=editsoa.getText()+"";
                    String sob=editsob.getText()+"";
                    int a=Integer.parseInt(soa);
                    int b=Integer.parseInt(sob);
                    txtkq.setText(a+"-"+b+"= "+(a-b));
                    break;
                }
                case R.id.btnNhan:{
                    String soa=editsoa.getText()+"";
                    String sob=editsob.getText()+"";
                    int a=Integer.parseInt(soa);
                    int b=Integer.parseInt(sob);
                    txtkq.setText(a+"*"+b+"= "+(a*b));
                    break;
                }
                case R.id.btnChia:{
                    String soa=editsoa.getText()+"";
                    String sob=editsob.getText()+"";
                    int a=Integer.parseInt(soa);
                    int b=Integer.parseInt(sob);
                    txtkq.setText(a+"/"+b+"= "+(a/b));
                    break;
                }
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncong=(Button) this.findViewById(R.id.btnCong);
        btntru=(Button) this.findViewById(R.id.btnTru);
        btnnhan=(Button) this.findViewById(R.id.btnNhan);
        btnchia=(Button) this.findViewById(R.id.btnChia);
        editsoa=(EditText) findViewById(R.id.txtSoA);
        editsob=(EditText) findViewById(R.id.txtSoB);
        txtkq=(TextView) findViewById(R.id.txtKetQua);
        btncong.setOnClickListener(myclick);
        btntru.setOnClickListener(myclick);
        btnnhan.setOnClickListener(myclick);
        btnchia.setOnClickListener(myclick);
    }
}
