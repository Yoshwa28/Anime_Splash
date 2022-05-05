package com.example.anime_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m, f;
    Button btn_shonen, btn_sponkon, btn_seinen, btn_mecha, btn_kodomo, btn_josei;
    ImageView btn_i, btn_s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m = MediaPlayer.create(this,R.raw.wind);
        m.setLooping(true);
        m.start();

        btn_i=findViewById(R.id.btn_iniciar);
        btn_s=findViewById(R.id.btn_pausa);

        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_i.setVisibility(View.GONE);
                btn_s.setVisibility(View.VISIBLE);

                m.start();
            }
        });

        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_s.setVisibility(View.GONE);
                btn_i.setVisibility(View.VISIBLE);

                m.pause();
            }
        });

        btn_shonen = findViewById(R.id.btn_shonen);
        btn_shonen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                switch (view.getId()){
                    case R.id.btn_shonen: intent.putExtra("INFO","shonen");      break;
                }
                startActivity(intent);
            }
        });
        btn_sponkon = findViewById(R.id.btn_sponkon);
        btn_sponkon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                switch (view.getId()){
                    case R.id.btn_sponkon: intent.putExtra("INFO","sponko");      break;
                }
                startActivity(intent);

            }
        });
        btn_seinen = findViewById(R.id.btn_seinen);
        btn_seinen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                switch (view.getId()){
                    case R.id.btn_seinen: intent.putExtra("INFO","seinen");      break;
                }
                startActivity(intent);

            }
        });
        btn_mecha = findViewById(R.id.btn_mecha);
        btn_mecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                switch (view.getId()){
                    case R.id.btn_mecha: intent.putExtra("INFO","mecha");      break;
                }
                startActivity(intent);

            }
        });
        btn_kodomo = findViewById(R.id.btn_kodomo);
        btn_kodomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                switch (view.getId()){
                    case R.id.btn_kodomo: intent.putExtra("INFO","kodomo");      break;
                }
                startActivity(intent);

            }
        });
        btn_josei = findViewById(R.id.btn_josei);
        btn_josei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                switch (view.getId()){
                    case R.id.btn_josei: intent.putExtra("INFO","josei");      break;
                }
                startActivity(intent);

            }
        });
    }

}