package com.hegazy.mushafy;

import android.os.Bundle;

import static com.hegazy.mushafy.Const.AUTHOR;
import static com.hegazy.mushafy.Const.replaceFragment;

public class SurahsListenActivity extends BaseActivity {
public static AuthorClass AUTHOR_S;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surahs_listen);
        AUTHOR_S=(AuthorClass) SurahsListenActivity.this.getIntent().getSerializableExtra(AUTHOR);
        replaceFragment(getSupportFragmentManager(), R.id.listener, new SurahFragment());

    }

    @Override
    public void superBackPressed() {
        super.superBackPressed();
    }
}