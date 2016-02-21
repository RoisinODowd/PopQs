package com.example.roisodowd.practice2;

/**
 * Created by forrestwang on 2/21/16.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println(intent.getAction());

    }
}
