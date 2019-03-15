package com.veegadiego.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    ImageView imagen4;
    ImageView imagen5;
    ImageView imagen6;
    ImageView imagen7;
    ImageView imagen8;
    ImageView imagen9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen1 = findViewById(R.id.img1);
        imagen2 = findViewById(R.id.img2);
        imagen3 = findViewById(R.id.img3);
        imagen4 = findViewById(R.id.img4);
        imagen5 = findViewById(R.id.img5);
        imagen6 = findViewById(R.id.img6);
        imagen7 = findViewById(R.id.img7);
        imagen8 = findViewById(R.id.img8);
        imagen9 = findViewById(R.id.img9);

        imagen1.setOnClickListener(this);
        imagen2.setOnClickListener(this);
        imagen3.setOnClickListener(this);
        imagen4.setOnClickListener(this);
        imagen5.setOnClickListener(this);
        imagen6.setOnClickListener(this);
        imagen7.setOnClickListener(this);
        imagen8.setOnClickListener(this);
        imagen9.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int[] imagenes = {R.drawable.flor1, R.drawable.flor2,R.drawable.flor3,R.drawable.flor4,R.drawable.flor5,R.drawable.flor6,R.drawable.flor7,R.drawable.flor8,R.drawable.flor9};
        int viewId = v.getId();
        Log.i("id ", viewId+"");
        switch (viewId){
            case R.id.img1:
                imagen1.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img2:
                imagen2.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img3:
                imagen3.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img4:
                imagen4.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img5:
                imagen5.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img6:
                imagen6.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img7:
                imagen7.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img8:
                imagen8.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;
            case R.id.img9:
                imagen9.setImageResource(imagenes[(int) Math.floor(Math.random() * 9)]);
                break;

        }

    }
}
