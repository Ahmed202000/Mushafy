package com.hegazy.mushafy;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;


import static com.hegazy.mushafy.Const.SAVED;
import static com.hegazy.mushafy.SharedPreferencesManger.LoadData;
import static com.hegazy.mushafy.SharedPreferencesManger.SaveData;

public class SlideAdapterOnline extends PagerAdapter {
    Context context;
    public ArrayList<String> data;

    LayoutInflater mLayoutInflater;
    QuranActivity activity;


    public SlideAdapterOnline(Context context, ArrayList<String> data, QuranActivity activity) {
        this.context = context;
        this.data = data;
        this.activity = activity;
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
            ImageView mark = itemView.findViewById(R.id.mark);
            ProgressBar progressBar=imageView.findViewById(R.id.progressBar);

            Glide.with(context).load(data.get(position)).listener(new RequestListener<Drawable>() {
                @Override
                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                    return false;
                }

                @Override
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                    progressBar.setVisibility(View.GONE);
                    return false;
                }
            }).into(imageView);

            imageView.setRotationY(180);


            container.addView(itemView);
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    show(position, mLayoutInflater, mark);
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
        container.removeView((RelativeLayout) object);
    }


    void show(int page, LayoutInflater inflater, ImageView iv) {
        Dialog dialog = new Dialog(context, R.style.ThemeOverlay_AppCompat_Dialog);
        View v = inflater.inflate(R.layout.save_dpalog, null, false);
        dialog.setContentView(v);
        TextView sure = v.findViewById(R.id.tv_sure);
        TextView no = v.findViewById(R.id.tv_no);


        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveData(activity, SAVED, String.valueOf(page));
                dialog.dismiss();
                iv.setVisibility(View.VISIBLE);
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
