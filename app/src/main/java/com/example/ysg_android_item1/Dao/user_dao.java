package com.example.ysg_android_item1.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.ysg_android_item1.Entity.user;

import java.util.List;

@Dao
public interface user_dao {
    @Insert
    void enroll(user... users);

    @Query("SELECT * FROM userinfo")
    List<user> getALL();

    @Query("SELECT * FROM userinfo WHERE user = :user AND password = :pass")
    List<user> login(String user, String pass);
}
