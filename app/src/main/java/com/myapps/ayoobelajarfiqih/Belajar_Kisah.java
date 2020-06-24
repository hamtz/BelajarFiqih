package com.myapps.ayoobelajarfiqih;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Belajar_Kisah extends AppCompatActivity {
    private String[] nabi = {"Nabi Adam as","Nabi Idris as","Nabi Nuh as","Nabi Hud as","Nabi Shaleh as","Nabi Ibrahim as","Nabi Luth as"
            ,"Nabi Ismail as","Nabi Ishaq as","Nabi Yaqub as","Nabi Yusuf as","Nabi Syuaib as","Nabi Ayyub as","Nabi Zulkifli as"
            ,"Nabi Musa dan Harun as","Nabi Daud as","Nabi Sulaiman as","Nabi Ilyas as","Nabi Ilyasa as","Nabi Yunus as"
            ,"Nabi Zakariya as","Nabi Yahya as","Nabi Isa as","Nabi Muhammad saw"};
    private ArrayList<String> data;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar__kisah);


        ListView listView = (ListView) findViewById(R.id.listview1);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                String getName = data.get(position);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(Belajar_Kisah.this, Data_Nabi.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData(){
        Collections.addAll(data, nabi);
    }

}
