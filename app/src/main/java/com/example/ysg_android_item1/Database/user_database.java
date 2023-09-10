package com.example.ysg_android_item1.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.ysg_android_item1.Dao.user_dao;
import com.example.ysg_android_item1.Entity.user;

@Database(entities = {user.class}, version = 1, exportSchema = false)
public abstract class user_database extends RoomDatabase {
    public abstract user_dao User_Dao();
}
