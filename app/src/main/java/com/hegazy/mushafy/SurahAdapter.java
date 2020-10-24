package com.hegazy.mushafy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class SurahAdapter extends BaseAdapter {
    ArrayList<SurahClass> list;
    Context context;

    public SurahAdapter(ArrayList<SurahClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.surahitem , null);

        TextView name = (TextView) view.findViewById(R.id.surahname);
        TextView type = view.findViewById(R.id.tv_type);
        type.setText(list.get(position).type);
        name.setText(list.get(position).surah_name);


        return view;
    }
}
