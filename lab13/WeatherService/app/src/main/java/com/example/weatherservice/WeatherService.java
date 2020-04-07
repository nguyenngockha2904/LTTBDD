package com.example.weatherservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WeatherService extends Service {
    private static String LOG_TAG = "WeatherService";
    //lưu trữ dữ liệu thời tiết
    private static final Map<String,String> dlThoiTien=new HashMap<String,String>();

    private final IBinder binder = new LocalWeatherBinder();

    public class LocalWeatherBinder extends Binder{
        public WeatherService getService(){
            return WeatherService.this;
        }
    }

    public WeatherService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(LOG_TAG,"onBind");
        return this.binder;
    }
    @Override
    public void onRebind(Intent intent) {
        Log.i(LOG_TAG, "onRebind");
        super.onRebind(intent);
    }
    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(LOG_TAG, "onUnbind");
        return true;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "onDestroy");
    }
    // Trả về thông tin thời tiết ứng với địa điểm của ngày hiện tại.
    public String getWeatherToday(String vitri){
        Date now=new Date();
        DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        String dayString=df.format(now);
        String keyLocAndDay=vitri+"$"+dayString;
        String thoitiet=dlThoiTien.get(keyLocAndDay);
        if(thoitiet!=null){
            return thoitiet;
        }
        String[] kieuthoitiet=new String[]{" Trời mưa "," Nắng nóng"," Trời lạnh"," Ấm áp ","Có tuyết "};
        // Giá trị ngẫu nhiên từ 0 tới 4

        int i=new Random().nextInt(5);
        thoitiet=kieuthoitiet[i];
        dlThoiTien.put(keyLocAndDay,thoitiet);
        return  thoitiet;
    }
}
