package com.hegazy.mushafy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_fullscreen);


        MediaPlayer mediaPlayer= MediaPlayer.create(FullscreenActivity.this, R.raw.ss);
        mediaPlayer.start();


        // 13000
        final Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a=new Intent(FullscreenActivity.this,SplashActivity.class);
                startActivity(a);
                finish();
            }
        },8000);

        //كود الافيقت
        ImageView image = findViewById(R.id.image);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
        image.startAnimation(animation);
    }
}