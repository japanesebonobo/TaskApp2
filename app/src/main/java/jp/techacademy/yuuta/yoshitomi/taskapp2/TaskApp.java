package jp.techacademy.yuuta.yoshitomi.taskapp2;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by yoshitomi on 2017/04/02.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
