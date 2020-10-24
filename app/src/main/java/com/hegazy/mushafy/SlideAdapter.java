package com.hegazy.mushafy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.viewpager.widget.PagerAdapter;




import java.util.ArrayList;

public class SlideAdapter extends PagerAdapter {
    Context context;
    public ArrayList<Integer> data;

    LayoutInflater mLayoutInflater;

    public SlideAdapter(Context context , ArrayList<Integer> data) {
        this.context = context;
        this.data=data;
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

            View itemView = mLayoutInflater.inflate(R.layout.slide_item, container, false);

            RelativeLayout imageView = itemView.findViewById(R.id.iv_slider_image);
            imageView.setBackgroundResource(data.get(position));
            imageView.setRotationY(180);




            container.addView(itemView);

            return itemView;

        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }
}
