package com.myapps.ayoobelajarfiqih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }



    public void bt_belajar(View view) {
        Intent i = new Intent(getApplicationContext(), BelajarActivity.class);
        startActivity(i);
    }

    public void bt_bermain(View view) {
        Intent i = new Intent(getApplicationContext(), BermainActivity.class);
        startActivity(i);
    }

    public void bt_tentang(View view) {
        Intent i =new Intent(getApplicationContext(), TentangActivity.class);
        startActivity(i);
    }
}
