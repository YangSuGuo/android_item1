package com.example.ysg_android_item1;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import com.example.ysg_android_item1.Database.User_Database;

public class MyappDB extends Application {
    private static Context context;
    private static User_Database db;

    public static Context getContext() {
        return context;
    }

    public static User_Database getDb() {
        return db;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        db = Room.databaseBuilder(context, User_Database.class, "item1")
                .build();
    }
}
