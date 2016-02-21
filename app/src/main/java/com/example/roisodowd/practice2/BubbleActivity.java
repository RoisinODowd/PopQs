package com.example.roisodowd.practice2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by forrestwang on 2/21/16.
 */
public class BubbleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, QuestionBubble.class));
    }
}
