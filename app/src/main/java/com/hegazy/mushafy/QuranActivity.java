package com.hegazy.mushafy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Locale;

import static com.hegazy.mushafy.Const.PAGE_NUMBER;
import static com.hegazy.mushafy.SharedPreferencesManger.SaveData;

public class QuranActivity extends AppCompatActivity {
    ViewPager vp;
    SlideAdapter adapter;
    ArrayList<Integer> data;
    SlideAdapterOnline slideAdapterOnline;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);
       // setData();
        setDataOnline();

    }

    private void setDataOnline() {
        vp=findViewById(R.id.vp_home);
        list=new ArrayList<>();
        for (int i = 4; i <624 ; i++) {
            String format = String.format(Locale.ENGLISH,"%04d" , i);
         //   Toast.makeText(this, format, Toast.LENGTH_SHORT).show();
            list.add("http://moazen.schemecode.com/quraan_pages/"+format+".jpg");

        }
        slideAdapterOnline=new SlideAdapterOnline(this,list , this);
        vp.setAdapter(slideAdapterOnline);



        vp.setCurrentItem(getIntent().getExtras().getInt(PAGE_NUMBER));
        vp.setRotationY(180);
    }

//    private void setData() {
//        vp=findViewById(R.id.vp_home);
//        data=new ArrayList<>();
//        data.addAll(Arrays.asList(PAGES));
//        adapter=new SlideAdapter(this,data);
//        vp.setAdapter(adapter);
//
//
//
//        vp.setCurrentItem(getIntent().getExtras().getInt(PAGE_NUMBER));
//        vp.setRotationY(180);
//    }

}