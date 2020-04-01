package com.example.lab7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_input_data extends AppCompatActivity {
    Button btnSave1,btnSave2;
    EditText editNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);
        btnSave1=(Button) findViewById(R.id.btnSave1);
        btnSave2=(Button) findViewById(R.id.btnSave2);
        btnSave1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                sendToMain(MainActivity.result_code_save1);

            }
        });
        editNumber=(EditText) findViewById(R.id.editNumber);
        btnSave2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                sendToMain(MainActivity.result_code_save2);
            }
        });
    }
    /**
     * hàm xử lý gửi kết quả về mainactivity
     * khi hàm này được gọi thì lập tức onActivityResult

     * ở MainActivity sẽ sảy ra đem theo ResultCode và Intent
     * @param result
     */
    public void sendToMain(int result){
        Intent intent=getIntent();
        int value=Integer.parseInt(editNumber.getText()+"");
        intent.putExtra("data",value);
        setResult(result,intent);
        finish();

    }
}
