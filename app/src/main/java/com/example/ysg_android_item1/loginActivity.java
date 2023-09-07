package com.example.ysg_android_item1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
   /* public void saved(View view) {
        //获取输入的用户名和密码
        String name = userName.getText().toString().trim();
        String psw = passWord.getText().toString().trim();
        if (name.equals("") || name == "") {
            Toast.makeText(MainActivity.this, "请输入用户名", Toast.LENGTH_SHORT).show();
        } else if (psw.equals("") || psw == "") {
            Toast.makeText(MainActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
        } else{
            //调用SPSaveUserInfo类是的saveUserInfo()方法保存用户名和密码
            boolean isSaveSuccess = SPSaveUserInfo.saveUserInfo(this,name,psw);
            //判断是否保存成功
            if (isSaveSuccess){
                Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "保存失败", Toast.LENGTH_SHORT).show();
            }
        }
        //保存后清空用户名或密码
        userName.setText("");
        passWord.setText("");
    }*/
}
