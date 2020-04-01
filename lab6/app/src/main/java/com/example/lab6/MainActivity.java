package com.example.lab6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTen,editCMND,editBosung;
    CheckBox chkdocbao,chkdocsach,chkdoccode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTen=(EditText)this.findViewById(R.id.txtHoten);
        editCMND=(EditText)this.findViewById(R.id.txtCMND);
        editBosung=(EditText)this.findViewById(R.id.txtBoSung);
        chkdocbao=(CheckBox) findViewById(R.id.checDocBao);
        chkdoccode=(CheckBox) findViewById(R.id.cheDocCode);
        chkdocsach=(CheckBox) findViewById(R.id.cheDocSach);
        Button btn=(Button) findViewById(R.id.btnGuiThongTin);

        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View arg0){
                doShowInformation();
            }
        });
    }
    public void doShowInformation(){
        String ten=editTen.getText()+"";
        ten=ten.trim();
        if(ten.length()<3){
            editTen.requestFocus();
            editTen.selectAll();
            Toast.makeText(this,"Tên phải >3 kí tự",Toast.LENGTH_LONG).show();
            return;
        }
        //kiểm tra CMND hợp lệ
        String cmnd=editCMND.getText()+"";
        cmnd=cmnd.trim();
        if(cmnd.length()!=9)
        {
            editCMND.requestFocus();
            editCMND.selectAll();
            Toast.makeText(this, "CMND phải đúng 9 ký tự", Toast.LENGTH_LONG).show();
            return;
        }
        //kiem tra bang cap hop le
        String bang="";
        RadioGroup group=(RadioGroup) this.findViewById(R.id.radGBangCap);
        int id=group.getCheckedRadioButtonId();
        if(id==-1){
            Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_SHORT).show();
            return;
        }
        RadioButton rad=(RadioButton) findViewById(id);
        bang=rad.getText()+"";
        //kiem tra so thich
        String sothich="";
        if(chkdocbao.isChecked()){
            sothich+=chkdocbao.getText()+"\n";

        }
        if(chkdoccode.isChecked()){
            sothich+=chkdoccode.getText()+"\n";
        }
        if(chkdocsach.isChecked()){
            sothich+=chkdocsach.getText()+"\n";
        }
        String bosung=editBosung.getText()+"";
        //xuất thông báo thông tin cá nhân bằng alertDialog
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        //tao nội dung
        String msg=ten+"\n";
        msg+= cmnd+"\n";
        msg+=bang+"\n";
        msg+=sothich;
        msg+="—————————–\n";
        msg+="Thông tin bổ sung:\n";
        msg+=bosung+ "\n";
        msg+="—————————–";
        builder.setMessage(msg);//thiet lap noi dung
        builder.create().show();
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
}
