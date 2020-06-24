package com.myapps.ayoobelajarfiqih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        TextView judul = (TextView) findViewById(R.id.judul_tentang);


        judul.setText(getResources().getString(R.string.jd_tentang));
    }


    public void bt_kembali(View view) {
        finish();
    }
}
