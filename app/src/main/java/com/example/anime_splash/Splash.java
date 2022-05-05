package com.example.anime_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class Splash extends AppCompatActivity {

    public static final long SPLASH_SCREEN_DELAY = 6000;

    Animation topAnim, buttomAnim;
    MediaPlayer m;
    ImageView logo;
    TextView frase;
    GifImageView cucaracha, vaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        buttomAnim = AnimationUtils.loadAnimation(this,R.anim.button_animation);

        logo = findViewById(R.id.logo);
        frase = findViewById(R.id.frase);

        cucaracha = findViewById(R.id.cucaracha);
        vaca = findViewById(R.id.vaca);

        logo.setAnimation((topAnim));
        frase.setAnimation(buttomAnim);
        cucaracha.setAnimation((topAnim));
        vaca.setAnimation(topAnim);

        m = MediaPlayer.create(this,R.raw.meme);
        m.setLooping(true);
        m.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                m.stop();
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}