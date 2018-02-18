package com.example.android.eatbossresto;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup rgPilihMenu;
    RadioButton rbDineIn;
    RadioButton rbTakeAway;
    Button btPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "NADYA YULI PRATAMA_1202150239", Toast.LENGTH_SHORT).show();

        rgPilihMenu = findViewById(R.id.rgPilihMenu);
        rbDineIn = findViewById(R.id.rbDineIn);
        rbTakeAway = findViewById(R.id.rbTakeAway);
        btPesan = findViewById(R.id.buttonPesan);

        btPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int a = rgPilihMenu.getCheckedRadioButtonId();
                switch (a){
                    case R.id.rbDineIn:
                        Toast.makeText(getBaseContext(), "Dine In", Toast.LENGTH_LONG).show();

                        Intent DineIn = new Intent(MainActivity.this, DineInActivity.class);
                        startActivity(DineIn);
                        break;


                    case R.id.rbTakeAway:
                        Toast.makeText(getBaseContext(), "Take Away", Toast.LENGTH_LONG).show();

                        Intent TakeAway = new Intent(MainActivity.this, TakeAwayActivity.class);
                        startActivity(TakeAway);
                        break;

                }

        }});
    }}
    


