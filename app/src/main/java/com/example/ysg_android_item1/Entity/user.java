package com.example.ysg_android_item1.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.jetbrains.annotations.NotNull;

@Entity(tableName = "userinfo")
public class user {
    @PrimaryKey(autoGenerate = true)
    private  int id;

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

    @NonNull
    public String getUser() {
        return user;
    }

    @NonNull
    public String getPass() {
        return pass;
    }
    //set

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(@NonNull String user) {
        this.user = user;
    }

    public void setPass(@NonNull String pass) {
        this.pass = pass;
    }
}
