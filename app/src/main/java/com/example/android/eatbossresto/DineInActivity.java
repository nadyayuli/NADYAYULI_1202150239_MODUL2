package com.example.android.eatbossresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DineInActivity extends AppCompatActivity {

   Button btPesan;
   EditText nama;
   Spinner macammeja;
   String HasilMeja;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        macammeja = (Spinner) findViewById(R.id.spinner);
    }

    public void b (View view){
        Toast.makeText(this, "macammeja:"+HasilMeja, Toast.LENGTH_SHORT).show();
        Intent y = new Intent(getApplicationContext(),DaftarMenuActivity.class);
        startActivity(y);
    }

}
