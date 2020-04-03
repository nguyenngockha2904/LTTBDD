package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Khởi tạo dữ liệu cho mảng arr (còn gọi là data source)

        final String arr[] ={"Nhí","Kha","Tuấn Bể","Tuấn Ba Lỗ"};

        //2 lấy đối tương listview dựa vào id

        ListView lvPerson=(ListView) this.findViewById(R.id.lvperson);

        //3 gáng datasource vào array adapter

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);

        //4 dua apdater vào listview

        lvPerson.setAdapter(arrayAdapter);

        final TextView textView=(TextView) this.findViewById(R.id.txtselection);

        //5 thiết lập sự kiện cho listview ,khi chọn phần tử nào thì nó sẽ hiển thị lên textView

        lvPerson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText("positon : "+position +" value :"+arr[position]);

            }
        });

    }
}
