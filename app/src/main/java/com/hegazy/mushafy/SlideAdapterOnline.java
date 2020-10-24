package com.hegazy.mushafy;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.viewpager.widget.PagerAdapter;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static com.hegazy.mushafy.Const.SAVED;
import static com.hegazy.mushafy.SharedPreferencesManger.SaveData;

public class SlideAdapterOnline extends PagerAdapter {
    Context context;
    public ArrayList<String> data;

    LayoutInflater mLayoutInflater;
    QuranActivity activity;

    public SlideAdapterOnline(Context context , ArrayList<String> data , QuranActivity activity) {
        this.context = context;
        this.data=data;
        this.activity=activity;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }



    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        try {

            View itemView = mLayoutInflater.inflate(R.layout.slide_item_online, container, false);

            ImageView imageView = itemView.findViewById(R.id.image);
            Glide.with(context).load(data.get(position)).into(imageView);

            imageView.setRotationY(180);




            container.addView(itemView);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    show(position , mLayoutInflater);
                    return false;
                }
            });

            return itemView;

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }


    void show(int page , LayoutInflater inflater)
    {
        Dialog dialog = new Dialog(context , R.style.ThemeOverlay_AppCompat_Dialog);
        View v = inflater.inflate(R.layout.save_dpalog ,null ,  false);
        dialog.setContentView(v);
        TextView sure = v.findViewById(R.id.tv_sure);
        TextView no = v.findViewById(R.id.tv_no);
        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveData(activity , SAVED , String.valueOf(page));
                dialog.dismiss();
                Toast.makeText(activity, "تم الحفظ", Toast.LENGTH_SHORT).show();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
