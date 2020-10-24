package com.hegazy.mushafy;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.hegazy.mushafy.Const.replaceFragment;

public class MainActivity extends BaseActivity {
    ArrayList<SurahClass> data;
    ListView list;
    SurahAdapter adapter;
    AuthorClass author;
    @BindView(R.id.tab_home)
    TabLayout tabHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        replaceFragment(getSupportFragmentManager(), R.id.orders_container, new SurahFragment());

        tabHome.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        replaceFragment(getSupportFragmentManager(), R.id.orders_container, new SurahFragment());

                        break;
                    case 1:
                        replaceFragment(getSupportFragmentManager(), R.id.orders_container, new AgzaaFragment());

                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        //TODO set default selection
        TabLayout.Tab tab = tabHome.getTabAt(0);
        tab.select();
    }

    @Override
    public void superBackPressed() {
        super.superBackPressed();
    }
}