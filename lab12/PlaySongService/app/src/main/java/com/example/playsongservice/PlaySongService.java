package com.example.playsongservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class PlaySongService extends Service {
    private MediaPlayer mediaPlayer;
    public PlaySongService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate(){
        super.onCreate();
        //tao đối tượng media player chơi nhạc
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.mysong);
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startid){
        // Chơi nhạc.
        mediaPlayer.start();
        return START_STICKY;
    }
    // Hủy bỏ dịch vụ.
    @Override
    public void onDestroy(){
        // Giải phóng nguồn dữ nguồn phát nhạc.
        mediaPlayer.release();
        super.onDestroy();
    }

}
