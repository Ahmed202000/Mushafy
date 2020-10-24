package com.hegazy.mushafy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.hegazy.mushafy.Const.AUTHOR;
import static com.hegazy.mushafy.Const.SURAH;

public class PlayerActivity extends AppCompatActivity {
    //TODO
    AuthorClass author;
    SurahClass surah;
    String path, name, type;
    MediaPlayer mp = new MediaPlayer();

    Player player;
    boolean play = false;
    @BindView(R.id.player_tv_surah_name)
    TextView playerTvSurahName;
    @BindView(R.id.btn_share)
    ImageView btnShare;
    @BindView(R.id.btn_rate)
    ImageView btnRate;
    @BindView(R.id.playr_ivpreview)
    ImageView playrIvpreview;
    @BindView(R.id.player_sbprogress)
    SeekBar playerSbprogress;
    @BindView(R.id.tv_timefrom)
    TextView tvTimefrom;
    @BindView(R.id.tv_timeto)
    TextView tvTimeto;
    @BindView(R.id.d)
    RelativeLayout d;
    @BindView(R.id.player_btnplay)
    Button playerBtnplay;

    @BindView(R.id.rel1)
    RelativeLayout rel1;
//    @BindView(R.id.adView)
//    AdView adView;
    @BindView(R.id.pprogressBar)
    ProgressBar pprogressBar;

    Intent broad_cast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        ButterKnife.bind(this);

        try {
            author= (AuthorClass) getIntent().getSerializableExtra(AUTHOR);
            surah=(SurahClass) getIntent().getSerializableExtra(SURAH);
            path =  path = "https://server" + author.servername + ".mp3quran.net/" + author.name + "/" + surah.surah_number + ".mp3";
              playerTvSurahName.setText(author.server +"\n" + surah.surah_name);
            player = new Player();
        }
        catch (Exception e)
        {

        }




        player.start();
        playerSbprogress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser && mp != null) {
                    mp.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


//        AdRequest adRequest = new AdRequest.Builder().build();
//        adView.loadAd(adRequest);





        pprogressBar.setVisibility(View.VISIBLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pprogressBar.setVisibility(View.GONE);

            }
        }, 5000);




    }
    class Player extends Thread {


        @Override
        public void run() {
            try {
                mp.stop();
                mp.reset();
                mp.setDataSource(path);
                try {

                    mp.prepare();
                } catch (Exception e) {
                }
                playerSbprogress.setMax(mp.getDuration());

            } catch (IOException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        playerSbprogress.setProgress(mp.getCurrentPosition());
                        SoundTime();
                    }
                });
            }

                }

            }






    public void notifyData(String type , String name , String url) {
        broad_cast = new Intent();
        broad_cast.setAction("com.hegazy.roquia");
        broad_cast.putExtra("type", type);
        broad_cast.putExtra("name", name);
        broad_cast.putExtra("url" , url);


        sendBroadcast(broad_cast);
    }






    private void SoundTime() {
        playerSbprogress.setMax(mp.getDuration());
        int tim = (playerSbprogress.getMax() / 1000);
        int m = tim / 60;
        int s = tim % 60;
        //////
        int tim0 = (playerSbprogress.getProgress() / 1000);
        int m0 = tim0 / 60;
        int s0 = tim0 % 60;

        tvTimeto.setText(m + ":" + s);
        tvTimefrom.setText(m0 + ":" + s0);
    }
    @OnClick({R.id.btn_share, R.id.btn_rate, R.id.player_btnplay, R.id.player_btnforward , R.id.player_btnbackword})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_share:
                try {
                    final String appPackageName = getPackageName();
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "السكينه");
                    String shareMessage ="شارك التطبيق مع اصدقائك";
                    shareMessage = shareMessage + " https://play.google.com/store/apps/details?id=" + appPackageName;
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, getString(R.string.app_name)));
                } catch (Exception e) {
                    //e.toString();
                }
                break;
            case R.id.btn_rate:
                Intent ratingIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?" + "id=com.roqua"));
              startActivity(ratingIntent);
                break;
            case R.id.player_btnplay:

                if (!mp.isPlaying()) {
                    mp.start();
                    playerBtnplay.setBackgroundResource(R.drawable.img_btn_pause_pressed);
                  //  notifyData( type , name , path);


                } else if (mp.isPlaying()) {
                    mp.pause();
                    playerBtnplay.setBackgroundResource(R.drawable.img_btn_play_pressed);


                }

                break;

            case R.id.player_btnforward:
            mp.seekTo(mp.getCurrentPosition()+5000);
            break;
            case R.id.player_btnbackword:
                mp.seekTo(mp.getCurrentPosition()-5000);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mp.stop();
   
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}