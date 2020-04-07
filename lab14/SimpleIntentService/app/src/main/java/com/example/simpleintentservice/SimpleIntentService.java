package com.example.simpleintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
public class SimpleIntentService extends IntentService {
    public static final String ACTION_1 ="MY_ACTION_1";
    public SimpleIntentService() {
        super("SimpleIntentService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        // Tạo một đối tượng Intent (Một đối tượng phát sóng).
        Intent broadcastIntent = new Intent();
        // Sét tên hành động (Action) của Intent này.
        // Một Intent có thể thực hiện nhiều hành động khác nhau.
        // (Có thể coi là nhiều nhiệm vụ).
        broadcastIntent.setAction(SimpleIntentService.ACTION_1);
        // Vòng lặp 100 lần phát sóng của Intent.
        for (int i = 0; i <= 100; i++) {
            // Sét đặt giá trị cho dữ liệu gửi đi.
            // (Phần trăm của công việc).
            broadcastIntent.putExtra("percel", i);
            // Send broadcast
            // Phát sóng gửi đi.
            sendBroadcast(broadcastIntent);
            // Sleep 100 Milliseconds.
            // Tạm dừng 100 Mili giây.
            SystemClock.sleep(100);
        }
    }
}
