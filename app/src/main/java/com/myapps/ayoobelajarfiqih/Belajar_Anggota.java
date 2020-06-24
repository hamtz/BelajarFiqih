package com.myapps.ayoobelajarfiqih;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Belajar_Anggota extends AppCompatActivity implements View.OnClickListener {
    public ImageView imgv;
    Button btprev, btnext;
    public TextView halaman1,halaman2;
    int i = 0;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar__anggota);

        btprev = (Button) findViewById(R.id.bt_prev);
        btnext = (Button) findViewById(R.id.bt_next);
        imgv = (ImageView) findViewById(R.id.isigambar);
        halaman1 = (TextView) findViewById(R.id.halamanini);
        halaman2 = (TextView) findViewById(R.id.halamanakhir);


        btprev.setOnClickListener(this);
        btnext.setOnClickListener(this);
        imgv.setImageResource(R.drawable.agb1);
        halaman1.setText("1");
        halaman2.setText("21");


    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.bt_next:
                i++;
                if (i == 21) // switch to 11 because you got 10 images
                {
                    i = 20; // switch to 10, same reason
                }
                changeImage();
                changePage();
                break;
            case R.id.bt_prev:
                i--;
                if (i == -1) {
                    i = 0; // you can leave it this way or improve it later
                }
                changePage();
                changeImage();
                break;
        }
    }
    public void changeImage() {
        imgv = (ImageView) findViewById(R.id.isigambar);

        switch (i) {
            case 0:
                imgv.setImageResource(R.drawable.agb1);break;
            case 1:
                imgv.setImageResource(R.drawable.agb2);break;
            case 2:
                imgv.setImageResource(R.drawable.agb3);break;
            case 3:
                imgv.setImageResource(R.drawable.agb4);break; // and then it goes further
            case 4:
                imgv.setImageResource(R.drawable.agb5);break;
            case 5:
                imgv.setImageResource(R.drawable.agb6);break;
            case 6:
                imgv.setImageResource(R.drawable.agb7);break;
            case 7:
                imgv.setImageResource(R.drawable.agb8);break;
            case 8:
                imgv.setImageResource(R.drawable.agb9);break;
            case 9:
                imgv.setImageResource(R.drawable.agb10);break;
            case 10:
                imgv.setImageResource(R.drawable.agb11);break;
            case 11:
                imgv.setImageResource(R.drawable.agb12);break;
            case 12:
                imgv.setImageResource(R.drawable.agb13);break;
            case 13:
                imgv.setImageResource(R.drawable.agb14);break;
            case 14:
                imgv.setImageResource(R.drawable.agb15);break;
            case 15:
                imgv.setImageResource(R.drawable.agb16);break;
            case 16:
                imgv.setImageResource(R.drawable.agb17);break;
            case 17:
                imgv.setImageResource(R.drawable.agb18);break;
            case 18:
                imgv.setImageResource(R.drawable.agb19);break;
            case 19:
                imgv.setImageResource(R.drawable.agb20);break;
            case 20:
                imgv.setImageResource(R.drawable.agb21);break;
        }
    }
    @SuppressLint("SetTextI18n")
    public void changePage(){
        halaman1 = (TextView) findViewById(R.id.halamanini);
        switch (i){
            case 0:
                halaman1.setText("1");break;
            case 1:
                halaman1.setText("2");break;
            case 2:
                halaman1.setText("3");break;
            case 3:
                halaman1.setText("4");break;
            case 4:
                halaman1.setText("5");break;
            case 5:
                halaman1.setText("6");break;
            case 6:
                halaman1.setText("7");break;
            case 7:
                halaman1.setText("8");break;
            case 8:
                halaman1.setText("9");break;
            case 9:
                halaman1.setText("10");break;
            case 10:
                halaman1.setText("11");break;
            case 11:
                halaman1.setText("12");break;
            case 12:
                halaman1.setText("13");break;
            case 13:
                halaman1.setText("14");break;
            case 14:
                halaman1.setText("15");break;
            case 15:
                halaman1.setText("16");break;
            case 16:
                halaman1.setText("17");break;
            case 17:
                halaman1.setText("18");break;
            case 18:
                halaman1.setText("19");break;
            case 19:
                halaman1.setText("20");break;
            case 20:
                halaman1.setText("21");break;

        }
    }

}
