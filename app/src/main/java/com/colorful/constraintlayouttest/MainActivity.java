package com.colorful.constraintlayouttest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_login = (Button) findViewById(R.id.login);
        Button bt_regist = (Button) findViewById(R.id.regist);
        EditText et_zhanghao  = (EditText) findViewById(R.id.et_zhanghao);
        EditText et_password  = (EditText) findViewById(R.id.et_password);
        final String zhanghao  = et_zhanghao.getText().toString().trim();
        final String password  = et_password.getText().toString().trim();
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(zhanghao.equals("a")&&password.equals("a")){
                    Toast.makeText(getApplicationContext(),"登录成功",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
