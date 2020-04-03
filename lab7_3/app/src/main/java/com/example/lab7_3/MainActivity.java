package com.example.lab7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int request_code_input=113;
    public static final int result_code_save1=115;
    public static final int result_code_save2=116;
    Button btnInputData;
    ListView lvData;
    ArrayList<Integer> arrData=new ArrayList<Integer>();
    ArrayAdapter<Integer> adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInputData=(Button)findViewById(R.id.btnopenactivity);
        btnInputData.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0){
                //Mở Activity với REQUEST_CODE_INPUT
                Intent intent=new Intent(MainActivity.this,activity_input_data.class);


                MainActivity.this.startActivityForResult(intent,request_code_input);

            }
        });
        lvData=(ListView) findViewById(R.id.lvdata);
        adapter=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,arrData);
        lvData.setAdapter(adapter);

    }
    /**
     * Xử lý kết quả trả về ở đây
     */
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent intent){
        super.onActivityResult(requestCode,resultCode,intent);
        //Kiểm tra có đúng requestCode =REQUEST_CODE_INPUT hay không
        //Vì ta có thể mở Activity với những RequestCode khác nhau
        if(requestCode==request_code_input){
            //Kiểm trả ResultCode trả về, cái này ở bên InputDataActivity truyền về
            //có nó rồi thì xử lý trở lên thông thường
            switch(resultCode){
                case result_code_save1:{
                    //giá trị từ InputDataActivity
                    int v1=intent.getIntExtra("data",0);
                    arrData.add(v1*v1);
                    adapter.notifyDataSetChanged();
                    break;
                }
                case  result_code_save2:{

                    //giá trị từ InputDataActivity
                    int v2=intent.getIntExtra("data",0);
                    arrData.add(v2);

                    adapter.notifyDataSetChanged();
                    break;
                }
            }
        }
    }
}
