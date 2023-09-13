package com.example.ysg_android_item1.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.ysg_android_item1.Entity.User;

import java.util.List;

@Dao
public interface User_Dao {
    @Insert
    void Insert(User... users);

    @Query("SELECT * FROM userinfo")
    List<User> getALL();

    @Query("SELECT * FROM userinfo WHERE user = :user AND pass = :pass")
    List<User> login(String user, String pass);
}
