package com.example.application;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.my_profile_intent);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.gallery_sport);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.sport_intent);
        btnMove.setOnClickListener(this);

        btnMove = findViewById(R.id.news_intent);
        btnMove.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_profile_intent:
                startActivity(new Intent(this, profile.class));
                break;
            case R.id.gallery_sport:
                startActivity(new Intent(this, gallery.class));
                break;
            case R.id.sport_intent:
                startActivity(new Intent(this, Menu_Daftar_Makanan.class));
                break;
            case R.id.news_intent:
                startActivity(new Intent(this, news.class));
                break;

        }
    }
    public void feedback(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:violaalfhny10@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}