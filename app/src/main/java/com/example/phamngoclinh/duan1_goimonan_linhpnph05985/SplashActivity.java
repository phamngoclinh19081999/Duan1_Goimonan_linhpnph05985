package com.example.phamngoclinh.duan1_goimonan_linhpnph05985;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);

                }catch (Exception e){

                }finally {
                    Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(intent);

                }
            }
        });
        thread.start();
    }
}
