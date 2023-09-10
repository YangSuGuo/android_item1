package com.example.ysg_android_item1.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "userinfo")
public class user {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "user")
    @NonNull
    private String user;

    @ColumnInfo(name = "password")
    @NonNull
    private String pass;

    public user(int id, @NonNull String user, @NonNull String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    //get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getUser() {
        return user;
    }
    //set

    public void setUser(@NonNull String user) {
        this.user = user;
    }

    @NonNull
    public String getPass() {
        return pass;
    }

    public void setPass(@NonNull String pass) {
        this.pass = pass;
    }
}
