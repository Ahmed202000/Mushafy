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

import static com.hegazy.mushafy.Const.ACTION;
import static com.hegazy.mushafy.Const.AUTHOR;
import static com.hegazy.mushafy.Const.PAGE_NUMBER;
import static com.hegazy.mushafy.Const.SURAH;
import static com.hegazy.mushafy.SharedPreferencesManger.LoadData;
import static com.hegazy.mushafy.SurahsListenActivity.AUTHOR_S;


public class SurahFragment extends BaseFragment {
    ArrayList<SurahClass> data = new ArrayList<>();
    SurahAdapter adapter;
    @BindView(R.id.surah_list_v)
    ListView surahListV;
    SurahsListenActivity activity;


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
                                                  if (LoadData(getActivity(), ACTION).equals("read")) {
                                                      Intent i = new Intent(getActivity(), QuranActivity.class);
                                                      i.putExtra(PAGE_NUMBER, data.get(position).getSurah_position());
                                                      startActivity(i);
                                                  }


                                                  //TODO listen
                                                  else if (LoadData(getActivity(), ACTION).equals("listen")) {
                                                      Intent i = new Intent(getActivity(), PlayerActivity.class);
                                                      i.putExtra(SURAH, data.get(position));
                                                      i.putExtra(AUTHOR, AUTHOR_S);
                                                      startActivity(i);
                                                  }


                                              }
                                          });
        // Inflate the layout for this fragment
        return v;
    }

    private void addData() {
        data.add(new SurahClass(0, " الفاتحة", "مكية" , "001"));
        data.add(new SurahClass(1, "البقرة", "مدنية" , "002"));
        data.add(new SurahClass(49, "ال عمران ", "مدنية" , "003"));
        data.add(new SurahClass(76, "النساء", "مدنية" , "004"));
        data.add(new SurahClass(105, " المائدة", "مدنية" , "005"));
        data.add(new SurahClass(127, " الانعام", "مكية" , "006"));
        data.add(new SurahClass(150, " الأعراف", "مكية" , "007"));
        data.add(new SurahClass(176, " الأنفال", "مدنية" , "008"));
        data.add(new SurahClass(186, " التوبة ", "مدنية" , "009"));
        data.add(new SurahClass(207, " يونس", "مكية" , "010"));
        data.add(new SurahClass(220, " هود", "مكية" , "011"));
        data.add(new SurahClass(234, " يوسف", "مكية" , "012"));
        data.add(new SurahClass(248, " الرعد", "مدنية" , "013"));
        data.add(new SurahClass(254, " إبراهيم", "مكية" , "014"));
        data.add(new SurahClass(261, " الحجر", "مكية" , "015"));
        data.add(new SurahClass(266, " النحل", "مكية" , "016"));
        data.add(new SurahClass(281, " الإسراء", "مكية" , "017"));
        data.add(new SurahClass(292, " الكهف", "مكية" , "018"));
        data.add(new SurahClass(304, " مريم", "مكية" , "019"));
        data.add(new SurahClass(311, " طه", "مكية" , "020"));
        data.add(new SurahClass(321, " الأنبياء", "مكية" , "021"));
        data.add(new SurahClass(331, " الحج", "مدنية" , "022"));
        data.add(new SurahClass(341, " المؤمنون", "مكية" , "023"));
        data.add(new SurahClass(349, " النّور", "مدنية" , "024"));
        data.add(new SurahClass(358, "  الفرقان ", "مكية" , "025"));
        data.add(new SurahClass(366, "  الشعراء ", "مكية" , "026"));
        data.add(new SurahClass(376, " النّمل", "مكية" , "027"));
        data.add(new SurahClass(384, " القصص", "مكية" , "028"));
        data.add(new SurahClass(395, " العنكبوت", "مكية" , "029"));
        data.add(new SurahClass(403, " الرّوم", "مكية" , "030"));
        data.add(new SurahClass(410, " لقمان", "مكية" , "031"));
        data.add(new SurahClass(414, " السجدة", "مكية" , "032"));
        data.add(new SurahClass(417, " الأحزاب", "مدنية" , "033"));
        data.add(new SurahClass(427, " سبأ", "مكية" , "034"));
        data.add(new SurahClass(433, " فاطر", "مكية" , "035"));
        data.add(new SurahClass(439, " يس", "مكية" , "036"));
        data.add(new SurahClass(445, " الصافات", "مكية" , "037"));
        data.add(new SurahClass(452, " ص", "مكية" , "038"));
        data.add(new SurahClass(457, " الزمر", "مكية" , "039"));
        data.add(new SurahClass(466, " غافر", "مكية" , "040"));
        data.add(new SurahClass(476, " فصّلت", "مكية" , "041"));
        data.add(new SurahClass(482, " الشورى", "مكية" , "042"));
        data.add(new SurahClass(488, " الزخرف", "مكية" , "043"));
        data.add(new SurahClass(495, " الدّخان", "مكية" , "044"));
        data.add(new SurahClass(498, " الجاثية", "مكية" , "045"));
        data.add(new SurahClass(501, " الأحقاف", "مكية" , "046"));
        data.add(new SurahClass(506, " محمد", "مدنية" , "047"));
        data.add(new SurahClass(510, " الفتح", "مدنية" , "048"));
        data.add(new SurahClass(514, " الحجرات", "مدنية" , "049"));
        data.add(new SurahClass(517, " ق", "مكية" , "050"));
        data.add(new SurahClass(519, " الذاريات", "مكية" , "051"));
        data.add(new SurahClass(522, " الطور", "مكية" , "052"));
        data.add(new SurahClass(525, " النجم", "مكية" , "053"));
        data.add(new SurahClass(527, " القمر", "مكية" , "054"));
        data.add(new SurahClass(530, " الرحمن", "مدنية" , "055"));
        data.add(new SurahClass(533, " الواقعة", "مكية" , "056"));
        data.add(new SurahClass(536, " الحديد", "مدنية" , "057"));
        data.add(new SurahClass(541, " المجادلة", "مدنية" , "058"));
        data.add(new SurahClass(544, " الحشر", "مدنية" , "059"));
        data.add(new SurahClass(548, " الممتحنة", "مدنية" , "060"));
        data.add(new SurahClass(550, " الصف", "مدنية" , "061"));
        data.add(new SurahClass(552, " الجمعة", "مدنية" , "062"));
        data.add(new SurahClass(553, " المنافقون", "مدنية" , "063"));
        data.add(new SurahClass(555, " التغابن", "مدنية" , "064"));
        data.add(new SurahClass(557, " الطلاق", "مدنية" , "065"));
        data.add(new SurahClass(559, " التحريم", "مدنية" , "066"));
        data.add(new SurahClass(561, " الملك", "مكية" , "067"));
        data.add(new SurahClass(563, " القلم", "مكية" , "068"));
        data.add(new SurahClass(565, " الحاقة",  "مكية" , "069"));
        data.add(new SurahClass(567, " المعارج", "مكية" , "070"));
        data.add(new SurahClass(569, " نوح", "مكية" , "071"));
        data.add(new SurahClass(571, " الجن", "مكية" , "072"));
        data.add(new SurahClass(573, " المزّمّل", "مكية" , "073"));
        data.add(new SurahClass(574, " المدّثر", "مكية" , "074"));
        data.add(new SurahClass(576, " القيامة", "مكية" , "075"));
        data.add(new SurahClass(5777, " الإنسان", "مدنية" , "076"));
        data.add(new SurahClass(579, " المرسلات", "مكية" , "077"));
        data.add(new SurahClass(581, " النبأ", "مكية" , "078"));
        data.add(new SurahClass(582, " النازعات", "مكية" , "079"));
        data.add(new SurahClass(584, " عبس", "مكية" , "080"));
        data.add(new SurahClass(585, " التكوير", "مكية" , "081"));
        data.add(new SurahClass(586, " الإنفطار", "مكية" , "082"));
        data.add(new SurahClass(586, " المطفّفين", "مكية" , "083"));
        data.add(new SurahClass(588, " الإنشقاق", "مكية" , "084"));
        data.add(new SurahClass(589, " البروج", "مكية" , "085"));
        data.add(new SurahClass(590, " الطارق", "مكية" , "086"));
        data.add(new SurahClass(590, " الأعلى", "مكية" , "087"));
        data.add(new SurahClass(591, " الغاشية", "مكية" , "088"));
        data.add(new SurahClass(592, " الفجر", "مكية" , "089"));
        data.add(new SurahClass(593, " البلد", "مكية" , "090"));
        data.add(new SurahClass(594, " الشمس", "مكية" , "091"));
        data.add(new SurahClass(594, " الليل", "مكية" , "092"));
        data.add(new SurahClass(595, " الضحى", "مكية" , "093"));
        data.add(new SurahClass(595, " الشرح", "مكية" , "094"));
        data.add(new SurahClass(596, " التين", "مكية" , "095"));
        data.add(new SurahClass(596, " العلق", "مكية" , "096"));
        data.add(new SurahClass(597, " القدر", "مكية" , "097"));
        data.add(new SurahClass(597, " البينة", "مدنية" , "098"));
        data.add(new SurahClass(598, " الزلزلة", "مدنية" , "099"));
        data.add(new SurahClass(598, " العاديات", "مكية" , "100"));
        data.add(new SurahClass(598, " القارعة", "مكية" , "101"));
        data.add(new SurahClass(599, " التكاثر", "مكية" , "102"));
        data.add(new SurahClass(600, " العصر", "مكية" , "103"));
        data.add(new SurahClass(600, " الهمزة", "مكية" , "104"));
        data.add(new SurahClass(600, " الفيل", "مكية","105"));
        data.add(new SurahClass(601, " قريش", "مكية" , "106"));
        data.add(new SurahClass(601, " الماعون", "مكية" , "107"));
        data.add(new SurahClass(601, " الكوثر", "مكية" , "108"));
        data.add(new SurahClass(602, " الكافرون", "مكية" , "109"));
        data.add(new SurahClass(602, " النصر", "مدنية" , "110"));
        data.add(new SurahClass(602, " المسد", "مكية" , "111"));
        data.add(new SurahClass(603, " الإخلاص", "مكية" , "112"));
        data.add(new SurahClass(603, " الفلق", "مكية" , "113"));
        data.add(new SurahClass( 603," النّاس", "مكية" , "114"));

        adapter=new SurahAdapter(data,getActivity());
        surahListV.setAdapter(adapter);

    }

    @Override
    public void onBack() {
        getActivity().finish();
    }
}