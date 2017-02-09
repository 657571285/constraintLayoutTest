package com.colorful.constraintlayouttest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_zhanghao;
    private EditText et_password;
    private String a = "a";
    private String b = "b";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_login = (Button) findViewById(R.id.login);
        Button bt_regist = (Button) findViewById(R.id.regist);
        et_zhanghao  = (EditText) findViewById(R.id.et_zhanghao);
        et_password  = (EditText) findViewById(R.id.et_password);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String zhanghao  = et_zhanghao.getText().toString().trim();
                String password  = et_password.getText().toString().trim();
                if(TextUtils.isEmpty(zhanghao)&&TextUtils.isEmpty(password)){
                    Toast.makeText(MainActivity.this,"账号密码不能为空",Toast.LENGTH_SHORT).show();
                }
                if(zhanghao.equals(a)&&password.equals(b)){
                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
