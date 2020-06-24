package com.myapps.ayoobelajarfiqih;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

public class Data_Nabi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah__nabi);
        showData();
    }
    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Nabi dari Activity sebelumnya
        String Nama = getIntent().getExtras().getString("MyName");
        final Intent i;
        final TextView judul;
        final WebView view;
        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (Nama){

            case "Nabi Adam as":
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_adam));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_adam), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Idris as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_idris));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_idris), "text/html; charset=utf-8", "utf-8");

                break;

            case "Nabi Nuh as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_nuh));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_nuh), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Hud as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_hud));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_hud), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Shaleh as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_saleh));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_saleh), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Ibrahim as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_ibrahim));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_ibrahim), "text/html; charset=utf-8", "utf-8");
                break;
            case "Nabi Luth as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_luth));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_luth), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Ismail as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);


                judul.setText(getResources().getString(R.string.jd_ismail));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_ismail), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Ishaq as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_ishaq));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_ishaq), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Yaqub as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_yaqub));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_yaqub), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Yusuf as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_yusuf));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_yusuf), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Syuaib as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_syuaib));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_syuaib), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Ayyub as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_ayyub));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_ayyub), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Zulkifli as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_zulkifli));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_zulkifli), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Musa dan Harun as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_musa));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_musa_harun), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Daud as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_daud));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_daud), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Sulaiman as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_sulaiman));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_sulaiman), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Ilyas as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_ilyas));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_ilyas), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Ilyasa as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_ilyasa));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_ilyasa), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Yunus as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_yunus));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_yunus), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Zakariya as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_zakariya));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_zakariya), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Yahya as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_yahya));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_yahya), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Isa as":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_isa));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_isa), "text/html; charset=utf-8", "utf-8");
                break;

            case "Nabi Muhammad saw":
                setContentView(R.layout.activity_kisah__nabi);
                judul = (TextView) findViewById(R.id.judul_nabi);
                view = new android.webkit.WebView(this);

                judul.setText(getResources().getString(R.string.jd_muhammad));
                view.setVerticalScrollBarEnabled(false);
                ((android.widget.LinearLayout)findViewById(R.id.konten_kisah)).addView(view);
                view.loadData(getString(R.string.kisah_nabi_muhammad), "text/html; charset=utf-8", "utf-8");
                break;
        }
    }
    @Override
    public void onBackPressed() {
       Data_Nabi.this.finish();

    }

}

