package com.example.ysg_android_item1;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class loginActivity extends AppCompatActivity {
    Map<String, String> Userinfo = new HashMap<>();
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.userName);
        pass = findViewById(R.id.passWord);

        // 状态栏沉浸
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            );
        }

        // 监听点击
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Userinfo.put(user.getText().toString().trim(), pass.getText().toString().trim());

                Toast.makeText(loginActivity.this, "登录", Toast.LENGTH_SHORT).show();
            }

            ;
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Userinfo.put(user.getText().toString().trim(), pass.getText().toString().trim());

                Toast.makeText(loginActivity.this, "登录", Toast.LENGTH_SHORT).show();
            }

            ;
        });
    }
}
