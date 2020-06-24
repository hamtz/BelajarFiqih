package com.myapps.ayoobelajarfiqih;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class BelajarActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);


        spinner.setPopupBackgroundResource(R.drawable.spinnercolor);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              public void onClick(View v) {
                                                  // TODO Auto-generated method stub
                                              }

                                              @Override
                                              public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                                                  final Intent i;
                                                  switch (position) {
                                                      case 0:
                                                          break;
                                                      case 1:
                                                          i = new Intent(getApplicationContext(), Belajar_Makanhalal.class);
                                                          startActivity(i);
                                                          break;
                                                      case 2:
                                                          i = new Intent(getApplicationContext(), Belajar_Makanharam.class);
                                                          startActivity(i);
                                                          break;
                                                      case 3:
                                                          i = new Intent(getApplicationContext(), Belajar_Minumhalal.class);
                                                          startActivity(i);
                                                          break;
                                                      case 4:
                                                          i = new Intent(getApplicationContext(), Belajar_Minumharam.class);
                                                          startActivity(i);
                                                          break;
                                                      case 5:
                                                          i = new Intent(getApplicationContext(), Belajar_Binatanghalal.class);
                                                          startActivity(i);
                                                          break;
                                                      case 6:
                                                          i = new Intent(getApplicationContext(), Belajar_Binatangharam.class);
                                                          startActivity(i);
                                                          break;
                                                      case 7:
                                                          i = new Intent(getApplicationContext(), Belajar_Jualbeli.class);
                                                          startActivity(i);
                                                          break;
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> arg0) {
                                                  // TODO Auto-generated method stub
                                              }
                                          }
        );
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setPopupBackgroundResource(R.drawable.spinnercolor);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              public void onClick(View v) {
                                                  // TODO Auto-generated method stub
                                              }

                                              @Override
                                              public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                                                  final Intent i;
                                                  switch (position) {
                                                      case 0:
                                                          break;
                                                          case 1:
                                                          i = new Intent(getApplicationContext(), Belajar_Kurban.class);
                                                          startActivity(i);
                                                          break;
                                                      case 2:
                                                          i = new Intent(getApplicationContext(), Belajar_Haji.class);
                                                          startActivity(i);
                                                          break;
                                                      case 3:
                                                          i = new Intent(getApplicationContext(), Belajar_Haid.class);
                                                          startActivity(i);
                                                          break;
                                                      case 4:
                                                          i = new Intent(getApplicationContext(), Belajar_Khitan.class);
                                                          startActivity(i);
                                                          break;

                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> arg0) {
                                                  // TODO Auto-generated method stub
                                              }
                                          }
        );
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setPopupBackgroundResource(R.drawable.spinnercolor);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                               public void onClick(View v) {
                                                   // TODO Auto-generated method stub
                                               }

                                               @Override
                                               public void onItemSelected(AdapterView<?> arg0, View view, int position, long row_id) {
                                                   final Intent i;
                                                   switch (position) {
                                                       case 0:
                                                           break;
                                                       case 1:
                                                           i = new Intent(getApplicationContext(), Belajar_Jumat.class);
                                                           startActivity(i);
                                                           break;

                                                   }
                                               }

                                               @Override
                                               public void onNothingSelected(AdapterView<?> arg0) {
                                                   // TODO Auto-generated method stub
                                               }
                                           }
        );
    }

    public void bt_kembali(View view) {
        finish();
    }

    public void bt_ajar_kisah(View view) {
        Intent i = new Intent(getApplicationContext(), Belajar_Kisah.class);
        startActivity(i);
    }

    public void bt_ajar_anggota(View view) {
        Intent i = new Intent(getApplicationContext(), Belajar_Anggota.class);
        startActivity(i);
    }

}
