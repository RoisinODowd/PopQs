package com.example.roisodowd.practice2;

/**
 * Created by forrestwang on 2/20/16.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class UnlockReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println(intent.getAction());
        if (intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {
            Intent intent1 = new Intent(context, Main2Activity.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        }
    }
}
