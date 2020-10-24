package com.hegazy.mushafy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.hegazy.mushafy.Const.ACTION;
import static com.hegazy.mushafy.Const.PAGE_NUMBER;
import static com.hegazy.mushafy.Const.SAVED;
import static com.hegazy.mushafy.SharedPreferencesManger.LoadData;
import static com.hegazy.mushafy.SharedPreferencesManger.SaveData;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.btn_read)
    Button btnRead;
    @BindView(R.id.btn_listen)
    Button btnListen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_read, R.id.btn_listen , R.id.btn_label})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_read:
                SaveData(this,ACTION ,"read");
                startActivity(new Intent(SplashActivity.this , MainActivity.class));


                break;
            case R.id.btn_listen:
             //   Toast.makeText(this, "bhjb", Toast.LENGTH_SHORT).show();
                SaveData(this,ACTION ,"listen");
                startActivity(new Intent(SplashActivity.this , AuthorsActivity.class));
                break;
            case R.id.btn_label:
            //    Toast.makeText(this, LoadData(SplashActivity.this , SAVED), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(SplashActivity.this,QuranActivity.class);
                if (LoadData(SplashActivity.this , SAVED)!=null)
                {
                    i.putExtra(PAGE_NUMBER , Integer.parseInt(LoadData(SplashActivity.this , SAVED)));
                    startActivity(i);
                }
                else
                {
                    i.putExtra(PAGE_NUMBER , 0);
                    startActivity(i);
                }

                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    }
