package com.myapps.ayoobelajarfiqih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BermainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bermain);
    }

    public void bt_kuisfiqih(View view) {
        Intent i = new Intent(getApplicationContext(),Quis_Fiqih1.class);
        startActivity(i);
    }

    public void bt_kembali(View view) {finish();
    }

    public void bt_kuisnabi(View view) {
        Intent i = new Intent(getApplicationContext(),Quis_Fiqih2.class);
        startActivity(i);
    }

    public void bt_kuisiman(View view) {
        Intent i = new Intent(getApplicationContext(),Quis_Fiqih3.class);
        startActivity(i);
    }

    public void bt_kuiskenabian(View view) {
        Intent i = new Intent(getApplicationContext(),Quis_Fiqih4.class);
        startActivity(i);
    }
}
