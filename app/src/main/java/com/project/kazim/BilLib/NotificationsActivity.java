package com.project.kazim.BilLib;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import java.util.Calendar;

/**
 * Created by ahmet on 22.07.2017.
 */

public class NotificationsActivity extends AppCompatActivity
{
    public static  String message;
    public static  int day;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);



        Switch sw1 = (Switch) findViewById(R.id.radioButton1);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

                    Intent notificationIntent = new Intent("android.media.action.DISPLAY_NOTIFICATION");
                    notificationIntent.addCategory("android.intent.category.DEFAULT");

                    PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 100, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                    EditText inputTxt1 = (EditText) findViewById(R.id.edit_time);
                    try {
                        day = Integer.parseInt(inputTxt1.getText().toString());
                        day*=(60*60*24);//seconds in one day
                    }
                    catch (Exception e)
                    {
                        day = 5;//default case
                    }
                    Calendar cal = Calendar.getInstance();
                    cal.add(Calendar.SECOND, day);
                    alarmManager.setExact(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), broadcast);
                    EditText inputTxt2 = (EditText) findViewById(R.id.edit_text);
                    message = inputTxt2.getText().toString();
                }
            }
        });
//        Switch sw2 = (Switch) findViewById(R.id.radioButton2);
//        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @RequiresApi(api = Build.VERSION_CODES.N)
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//
//                    Intent notificationIntent2 = new Intent("android.media.action.DISPLAY_NOTIFICATION");
//                    notificationIntent2.addCategory("android.intent.category.DEFAULT");
//
//                    PendingIntent broadcast2 = PendingIntent.getBroadcast(getApplicationContext(), 100, notificationIntent2, PendingIntent.FLAG_UPDATE_CURRENT);
//
//                    Calendar cal = Calendar.getInstance();
//                    cal.add(Calendar.SECOND, 3);
//                    alarmManager.setExact(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), broadcast2);
//
//                }
//            }
//        });
//        Switch sw3 = (Switch) findViewById(R.id.radioButton3);
//        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @RequiresApi(api = Build.VERSION_CODES.N)
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//
//                    Intent notificationIntent3 = new Intent("android.media.action.DISPLAY_NOTIFICATION");
//                    notificationIntent3.addCategory("android.intent.category.DEFAULT");
//
//                    PendingIntent broadcast3 = PendingIntent.getBroadcast(getApplicationContext(), 100, notificationIntent3, PendingIntent.FLAG_UPDATE_CURRENT);
//
//                    Calendar cal = Calendar.getInstance();
//                    cal.add(Calendar.SECOND, 5);
//                    alarmManager.setExact(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), broadcast3);
//                }
//            }
//        });
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
}
