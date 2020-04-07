package com.example.playsongservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playSong(View v){
        Intent intent=new Intent(MainActivity.this,PlaySongService.class);
        MainActivity.this.startService(intent);
    }
    public void stopSong(View v){
        Intent intent=new Intent(MainActivity.this,PlaySongService.class);
        this.stopService(intent);
    }
}
