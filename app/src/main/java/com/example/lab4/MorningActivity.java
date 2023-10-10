package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MorningActivity<id> extends AppCompatActivity {

    private static String CHANEL_ID = "linkbtn";
    private NotificationManagerCompat notificationManagerCompat;

//    private void createNotificationChanel() {
//        notificationManager = getSystemService(NotificationManager.class);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            CharSequence name = CHANEL_ID;
//            String description = "12345";
//            int importance = NotificationManager.IMPORTANCE_DEFAULT;
//            NotificationChannel channel = new NotificationChannel(CHANEL_ID, name, importance);
//            channel.setDescription(description);
//
//            notificationManager.createNotificationChannel(channel);
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANEL_ID,
                    "chanel",
                    NotificationManager.IMPORTANCE_DEFAULT
                    );
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        notificationManagerCompat = NotificationManagerCompat.from(this);

        String from = getIntent().getStringExtra("FROM");
        Toast toast = Toast.makeText(getApplicationContext(), from, Toast.LENGTH_LONG);
        toast.show();
    }

    public void link(View view) {
//        Intent intent = new Intent(Intent.ACTION_VIEW, url.parse("https..."));
//        startActivity(intent);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(MorningActivity.this, CHANEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("11111")
                .setContentText("ahhahahaha")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        notificationManagerCompat.notify(1, builder.build());
    }
}