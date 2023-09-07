package com.example.ysg_android_item1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.ysg_android_item1.Dao.user_dao;

public class loginActivity extends AppCompatActivity {
    user_dao User_Dao = MyappDB.getDb().User_Dao();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
