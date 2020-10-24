package com.hegazy.mushafy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.hegazy.mushafy.Const.PAGE_NUMBER;


public class AgzaaFragment extends BaseFragment {
    ArrayList<SurahClass> data = new ArrayList<>();
    SurahAdapter adapter;
    @BindView(R.id.surah_list_v)
    ListView surahListV;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_surah, container, false);
        SETupACTIVITY();
        ButterKnife.bind(this, v);
        addData();
        surahListV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO read
                    Intent i = new Intent(getActivity(), QuranActivity.class);
                    i.putExtra(PAGE_NUMBER, data.get(position).getSurah_position());
                    startActivity(i);
//



            }
        });
        // Inflate the layout for this fragment
        return v;
    }

    private void addData() {
        data.add(new SurahClass(0, " الجزء الاول", "" , ""));
        data.add(new SurahClass(21, " الجزء الثاني", "" , ""));
        data.add(new SurahClass(41, " الجزء الثالث", "" , ""));
        data.add(new SurahClass(61, " الجزء الرابع", "" , ""));
        data.add(new SurahClass(81, " الجزء الخامس", "" , ""));
        data.add(new SurahClass(101, " الجزء السادس", "" , ""));
        data.add(new SurahClass(120, " الجزءالسابع", "" , ""));
        data.add(new SurahClass(141, " الجزء الثامن", "" , ""));
        data.add(new SurahClass(161, " الجزء التاسع", "" , ""));
        data.add(new SurahClass(181, " الجزء العاشر", "" , ""));
        data.add(new SurahClass(200, " الجزء الحادي عشر", "" , ""));
        data.add(new SurahClass(221, " الجزء الثاني عشر", "" , ""));
        data.add(new SurahClass(241, " الجزء الثالث عشر", "" , ""));
        data.add(new SurahClass(261, " الجزء الرابع عشر", "" , ""));
        data.add(new SurahClass(281, " الجزء الخامس عشر", "" , ""));
        data.add(new SurahClass(301, " الجزء السادس عشر", "" , ""));
        data.add(new SurahClass(321, " الجزء السابع عشر", "" , ""));
        data.add(new SurahClass(341, " الجزء الثامن عشر", "" , ""));
        data.add(new SurahClass(361, " الجزء التاسع عشر", "" , ""));
        data.add(new SurahClass(381, " الجزء العشرون", "" , ""));
        data.add(new SurahClass(401, " الجزء الحادي و العشرون", "" , ""));
        data.add(new SurahClass(421, " الجزء الثاني والعشرون", "" , ""));
        data.add(new SurahClass(441, " الجزء الثالث و العشرون", "" , ""));
        data.add(new SurahClass(461, " الجزءالرابع و العشرون", "" , ""));
        data.add(new SurahClass(481, " الجزء الخامس و العشرون", "" , ""));
        data.add(new SurahClass(501, " الجزء السادس و العشرون", "" , ""));
        data.add(new SurahClass(521, " الجزء السابع و العشرون", "" , ""));
        data.add(new SurahClass(541, " الجزءالثامن و العشرون", "" , ""));
        data.add(new SurahClass(561, " الجزء التاسع و العشرون", "" , ""));
        data.add(new SurahClass(581, " الجزء الثلاثون", "" , ""));

        adapter=new SurahAdapter(data,getActivity());
        surahListV.setAdapter(adapter);

    }
    @Override
    public void onBack() {
        getActivity().finish();
    }
}