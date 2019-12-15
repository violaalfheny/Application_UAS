package com.example.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu_Detail_Makanan extends Activity {

    String HargaItem, NamaItem, Deskripsi, NomorHP, Lat, Long;
    int Gambar;
    int position;
    TextView tvHarga, tvNamaItem, tvDeskripsi;
    ImageView ImgGembar;


    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detail);

        tvHarga		    = (TextView)findViewById(R.id.textView1);
        tvNamaItem		= (TextView)findViewById(R.id.textView2);
        tvDeskripsi		= (TextView)findViewById(R.id.textView3);
        ImgGembar		= (ImageView)findViewById(R.id.imageView1);


        Intent i 		= getIntent();
        position 		= i.getExtras().getInt("position");
        HargaItem		= i.getStringExtra("HargaItem");
        NamaItem		= i.getStringExtra("NamaItem");
        Deskripsi	 	= i.getStringExtra("Deskripsi");
        NomorHP 	 	= i.getStringExtra("NomorHP");
        Gambar			= i.getIntExtra("Gambar", Gambar);
        Lat 	 	    = i.getStringExtra("Lat");
        Long 	 	    = i.getStringExtra("Long");

        tvHarga.setText(HargaItem);
        tvNamaItem.setText(NamaItem);
        tvDeskripsi.setText(Deskripsi);

        ImgGembar.setImageResource(Gambar);
    }
}
