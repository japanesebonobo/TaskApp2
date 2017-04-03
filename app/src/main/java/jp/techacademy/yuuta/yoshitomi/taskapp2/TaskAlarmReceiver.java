package jp.techacademy.yuuta.yoshitomi.taskapp2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by yoshitomi on 2017/04/03.
 */

public class TaskAlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TaskApp", "onReceive");
    }
}
