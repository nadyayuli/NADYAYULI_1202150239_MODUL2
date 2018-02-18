package com.example.android.eatbossresto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EatbossActivity extends Activity {// mengganntii menjadi activity untuk menghilangkan tampilan Eat boss resto pada bagian splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatboss2);
        Thread thread = new Thread(){

            public  void run() {
                try {
                    sleep(2000);//untuk mengatur waktu bertahan  splash screen dalam 5 detik

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                   startActivity(new Intent(EatbossActivity.this, MainActivity.class)); // membuka activity yang sekarang dan  membuka activity selanjutnya atau yang di tuju
                   finish();

                }

            }
        };
        thread.start();

    }
}
