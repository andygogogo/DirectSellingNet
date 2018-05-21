package com.hzbank.oa0508;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countdown;
    private TextView toMain;
    private TextView toFirstBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toMain = findViewById(R.id.tv_tomain);
        toFirstBundle = findViewById(R.id.tv_tofirstbundle);
//        countdown = findViewById(R.id.tv_main_countdown);
//        CountDownTimer countDownTimer = new CountDownTimer(6000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                countdown.setText(millisUntilFinished / 1000 + "");
//            }
//
//            @Override
//            public void onFinish() {
//                Intent intent = new Intent();
//                intent.setClassName(MainActivity.this, "com.taobao.weex.activity.WeexActivity");
//                startActivity(intent);
//                finish();
//            }
//        };
//        countDownTimer.start();
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent();
                    intent.setClassName(MainActivity.this, "com.hzbank.dsweex.DSWeexMainActivity");
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        toFirstBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName(MainActivity.this, "com.dslogin.library.DsLoginActivity");
                startActivity(intent);
            }
        });

    }
}
