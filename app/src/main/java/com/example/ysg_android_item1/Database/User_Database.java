package com.example.ysg_android_item1.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.ysg_android_item1.Dao.User_Dao;
import com.example.ysg_android_item1.Entity.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class User_Database extends RoomDatabase {
    public abstract User_Dao user_dao();
}
