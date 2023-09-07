package com.example.ysg_android_item1;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import com.example.ysg_android_item1.Database.user_database;

public class MyappDB extends Application {
    private static Context context;
    private static user_database db;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        db = Room.databaseBuilder(context,user_database.class,"item1")
                .build();
    }
    public static Context getContext(){
        return context;
    }
    public static user_database getDb(){
        return db;
    }
}
