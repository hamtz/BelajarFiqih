package com.myapps.ayoobelajarfiqih;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

public class Belajar_Jualbeli extends AppCompatActivity implements View.OnClickListener {
    public ImageView imgv;
    Button btprev, btnext;
    int i = 0;
    public TextView halaman1,halaman2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar__anggota);

        btprev = (Button) findViewById(R.id.bt_prev);
        btnext = (Button) findViewById(R.id.bt_next);

        halaman1 = (TextView) findViewById(R.id.halamanini);
        halaman2 = (TextView) findViewById(R.id.halamanakhir);
        PhotoView photoView = (PhotoView) findViewById(R.id.isigambar);



        btprev.setOnClickListener(this);
        btnext.setOnClickListener(this);
        photoView.setImageResource(R.drawable.jb1);
        halaman1.setText("1");
        halaman2.setText("10");
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.bt_next:
                i++;
                if (i == 10) // switch to 11 because you got 10 images
                {
                    i = 9; // switch to 10, same reason
                }
                changeImage();
                changePage();
                break;
            case R.id.bt_prev:
                i--;
                if (i == -1) {
                    i = 0; // you can leave it this way or improve it later
                }
                changeImage();
                changePage();
                break;
        }
    }
    public void changeImage() {
        PhotoView photoView = (PhotoView) findViewById(R.id.isigambar);
        switch (i) {
            case 0:
                photoView.setImageResource(R.drawable.jb1);break;
            case 1:
                photoView.setImageResource(R.drawable.jb2);break;
            case 2:
                photoView.setImageResource(R.drawable.jb3);break;
            case 3:
                photoView.setImageResource(R.drawable.jb4);break; // and then it goes further
            case 4:
                photoView.setImageResource(R.drawable.jb5);break;
            case 5:
                photoView.setImageResource(R.drawable.jb6);break;
            case 6:
                photoView.setImageResource(R.drawable.jb7);break;
            case 7:
                photoView.setImageResource(R.drawable.jb8);break;
            case 8:
                photoView.setImageResource(R.drawable.jb9);break;
            case 9:
                photoView.setImageResource(R.drawable.jb10);break;
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


        }
    }


}

