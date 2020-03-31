package com.example.lab3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tạo toast
        Toast toast=Toast.makeText(MainActivity.this,"hien thi ne`",Toast.LENGTH_LONG);
        toast.show();
        Button btn1=(Button) this.findViewById(R.id.go_btn);
        btn1.setText(" Thoát ");
        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder k=new AlertDialog.Builder(MainActivity.this);
                k.setTitle("tieu de");
                k.setMessage("bạn có chắc muốn thoát khỏi chương trình");
                k.setPositiveButton("Yes",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface diaglog,int which){
                        finish();
                    }
                });
                k.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                k.create().show();
            }
        });

//        AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
//        b.setTitle("chỗ này tiêu đề nè");
//        b.setMessage("Chỗ này thông tin ");
//        b.setPositiveButton("yes",new DialogInterface.OnClickListener(){
//            @Override
//            public void onClick(DialogInterface dialog,int which){
//                finish();
//
//            }
//        });
//        b.setNegativeButton("no", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//            }
//        });
//        b.create().show();
    }
}
