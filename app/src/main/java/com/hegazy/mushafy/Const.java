package com.hegazy.mushafy;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public interface Const {
    public static final String PAGE_NUMBER = "page_number";
    public static final String AUTHOR = "author";
    public static final String SURAH = "surah";
    public static final String ACTION = "action";
    public static final String SAVED = "saved";
    public static void replaceFragment(FragmentManager getChildFragmentManager, int id, Fragment fragment) {
        FragmentTransaction transaction = getChildFragmentManager.beginTransaction();
        transaction.replace(id, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    // public static  Integer [] PAGES;
//            = {R.drawable.page1,R.drawable.page2,R.drawable.page3,R.drawable.page4,
//            R.drawable.page5,R.drawable.page6,R.drawable.page7,R.drawable.page8,R.drawable.page9,R.drawable.page10,
//            R.drawable.page11,R.drawable.page12,R.drawable.page13,R.drawable.page14,R.drawable.page15,R.drawable.page16,
//            R.drawable.page17,R.drawable.page18,R.drawable.page19,R.drawable.page200,R.drawable.page21,R.drawable.page22,
//            R.drawable.page23,R.drawable.page24,R.drawable.page25,R.drawable.page26,R.drawable.page27,R.drawable.page28,
//            R.drawable.page29,R.drawable.page30,R.drawable.page31,R.drawable.page32,R.drawable.page33,R.drawable.page34,
//            R.drawable.page35,R.drawable.page36,R.drawable.page37,R.drawable.page38,R.drawable.page39,R.drawable.page40,
//            R.drawable.page41,R.drawable.page42,R.drawable.page43,R.drawable.page44,R.drawable.page45,R.drawable.page46,
//            R.drawable.page47,R.drawable.page48,R.drawable.page49,R.drawable.page50,R.drawable.page51,R.drawable.page52,
//            R.drawable.page53,R.drawable.page54,R.drawable.page55,R.drawable.page56,R.drawable.page57,R.drawable.page58,
//            R.drawable.page59,R.drawable.page60,R.drawable.page61,R.drawable.page62,R.drawable.page63,R.drawable.page64,
//            R.drawable.page65,R.drawable.page66,R.drawable.page67,R.drawable.page68,R.drawable.page69,R.drawable.page70,
//            R.drawable.page71,R.drawable.page72,R.drawable.page73,R.drawable.page74,R.drawable.page75,R.drawable.page76,
//            R.drawable.page77,R.drawable.page78,R.drawable.page79,R.drawable.page80,R.drawable.page81,R.drawable.page82,
//            R.drawable.page83,R.drawable.page84,R.drawable.page85,R.drawable.page86,R.drawable.page87,R.drawable.page88,
//            R.drawable.page89,R.drawable.page90,R.drawable.page91,R.drawable.page92,R.drawable.page93,R.drawable.page94,
//            R.drawable.page95,R.drawable.page96,R.drawable.page97,R.drawable.page98,R.drawable.page99,R.drawable.page100,
//            //TODO the first 100 page in holy quran
//
//            R.drawable.page101,R.drawable.page102,
//            R.drawable.page103,R.drawable.page104,R.drawable.page105,R.drawable.page106,
//            R.drawable.page107,R.drawable.page108,R.drawable.page109,R.drawable.page110,R.drawable.page111,R.drawable.page112,
//            R.drawable.page113,R.drawable.page114,R.drawable.page115,R.drawable.page116,R.drawable.page117,R.drawable.page181,
//            R.drawable.page119,R.drawable.page120,R.drawable.page121,R.drawable.page122,R.drawable.page123,R.drawable.page124,
//            R.drawable.page125,R.drawable.page126,R.drawable.page127,R.drawable.page128,R.drawable.page129,R.drawable.page130,
//            R.drawable.page131,R.drawable.page132,R.drawable.page133,R.drawable.page134,R.drawable.page135,R.drawable.page136,
//            R.drawable.page137,R.drawable.page138,R.drawable.page139,R.drawable.page140,R.drawable.page141,R.drawable.page142,
//            R.drawable.page143,R.drawable.page144,R.drawable.page145,R.drawable.page146,R.drawable.page147,R.drawable.page148,
//            R.drawable.page149,R.drawable.page150,R.drawable.page151,R.drawable.page152,R.drawable.page153,R.drawable.page154,
//            R.drawable.page155,R.drawable.page156,R.drawable.page157,R.drawable.page158,R.drawable.page159,R.drawable.page160,
//            R.drawable.page161,R.drawable.page162,R.drawable.page163,R.drawable.page164,R.drawable.page165,R.drawable.page166,
//            R.drawable.page167,R.drawable.page168,R.drawable.page169,R.drawable.page170,R.drawable.page171,R.drawable.page172,
//            R.drawable.page173,R.drawable.page174,R.drawable.page175,R.drawable.page176,R.drawable.page177,R.drawable.page178,
//            R.drawable.page179,R.drawable.page180,R.drawable.page181,R.drawable.page182,R.drawable.page183,R.drawable.page184,
//            R.drawable.page185,R.drawable.page186,R.drawable.page187,R.drawable.page188,R.drawable.page189,R.drawable.page190,
//            R.drawable.page191,R.drawable.page192,R.drawable.page193,R.drawable.page194,R.drawable.page195,R.drawable.page196,
//            R.drawable.page197,R.drawable.page198,R.drawable.page199,R.drawable.page200,
//            //TODO
//
//            R.drawable.page201,R.drawable.page202,
//            R.drawable.page203,R.drawable.page204,
//            R.drawable.page205,R.drawable.page206,R.drawable.page207,R.drawable.page208,
//            R.drawable.page209,R.drawable.page210,R.drawable.page211,R.drawable.page212,R.drawable.page213,R.drawable.page214,
//            R.drawable.page215,R.drawable.page216,R.drawable.page217,R.drawable.page218,R.drawable.page219,R.drawable.page220,
//            R.drawable.page221,R.drawable.page222,R.drawable.page223,R.drawable.page224,R.drawable.page225,R.drawable.page226,
//            R.drawable.page227,R.drawable.page228,R.drawable.page229,R.drawable.page230,R.drawable.page231,R.drawable.page232,
//            R.drawable.page233,R.drawable.page234,R.drawable.page235,R.drawable.page236,R.drawable.page237,R.drawable.page238,
//            R.drawable.page239,R.drawable.page240,R.drawable.page241,R.drawable.page242,R.drawable.page243,R.drawable.page244,
//            R.drawable.page245,R.drawable.page246,R.drawable.page247,R.drawable.page248,R.drawable.page249,R.drawable.page250,
//            R.drawable.page251,R.drawable.page252,R.drawable.page253,R.drawable.page254,R.drawable.page255,R.drawable.page256,
//            R.drawable.page257,R.drawable.page258,R.drawable.page259,R.drawable.page260,R.drawable.page261,R.drawable.page262,
//            R.drawable.page263,R.drawable.page264,R.drawable.page265,R.drawable.page266,R.drawable.page267,R.drawable.page268,
//            R.drawable.page269,R.drawable.page270,R.drawable.page271,R.drawable.page272,R.drawable.page273,R.drawable.page274,
//            R.drawable.page275,R.drawable.page276,R.drawable.page277,R.drawable.page278,R.drawable.page279,R.drawable.page280,
//            R.drawable.page281,R.drawable.page282,R.drawable.page283,R.drawable.page284,R.drawable.page285,R.drawable.page286,
//            R.drawable.page287,R.drawable.page288,R.drawable.page289,R.drawable.page290,R.drawable.page291,R.drawable.page292,
//            R.drawable.page293,R.drawable.page294,R.drawable.page295,R.drawable.page296,R.drawable.page297,R.drawable.page298,
//            R.drawable.page299,R.drawable.page300,
//            //TODO
//
//            R.drawable.page301,R.drawable.page302,R.drawable.page303,R.drawable.page304,
//            R.drawable.page305,R.drawable.page306,
//            R.drawable.page307,R.drawable.page308,R.drawable.page309,R.drawable.page310,
//            R.drawable.page311,R.drawable.page312,R.drawable.page313,R.drawable.page314,R.drawable.page315,R.drawable.page316,
//            R.drawable.page317,R.drawable.page318,R.drawable.page319,R.drawable.page320,R.drawable.page321,R.drawable.page322,
//            R.drawable.page323,R.drawable.page324,R.drawable.page325,R.drawable.page326,R.drawable.page327,R.drawable.page328,
//            R.drawable.page329,R.drawable.page330,R.drawable.page331,R.drawable.page332,R.drawable.page333,R.drawable.page334,
//            R.drawable.page335,R.drawable.page336,R.drawable.page337,R.drawable.page338,R.drawable.page339,R.drawable.page340,
//            R.drawable.page341,R.drawable.page342,R.drawable.page343,R.drawable.page344,R.drawable.page345,R.drawable.page346,
//            R.drawable.page347,R.drawable.page348,R.drawable.page349,R.drawable.page350,R.drawable.page351,R.drawable.page352,
//            R.drawable.page353,R.drawable.page354,R.drawable.page355,R.drawable.page356,R.drawable.page357,R.drawable.page358,
//            R.drawable.page359,R.drawable.page360,R.drawable.page361,R.drawable.page362,R.drawable.page363,R.drawable.page364,
//            R.drawable.page365,R.drawable.page366,R.drawable.page367,R.drawable.page368,R.drawable.page369,R.drawable.page370,
//            R.drawable.page371,R.drawable.page372,R.drawable.page373,R.drawable.page374,R.drawable.page375,R.drawable.page376,
//            R.drawable.page377,R.drawable.page378,R.drawable.page379,R.drawable.page380,R.drawable.page381,R.drawable.page382,
//            R.drawable.page383,R.drawable.page384,R.drawable.page385,R.drawable.page386,R.drawable.page387,R.drawable.page388,
//            R.drawable.page389,R.drawable.page390,R.drawable.page391,R.drawable.page392,R.drawable.page393,R.drawable.page394,
//            R.drawable.page395,R.drawable.page396,R.drawable.page397,R.drawable.page398,R.drawable.page399,R.drawable.page400,
//
//            //TODO
//            R.drawable.page401,R.drawable.page402,R.drawable.page404,R.drawable.page404,
//            R.drawable.page405,R.drawable.page406,
//            R.drawable.page407,R.drawable.page408,R.drawable.page409,R.drawable.page410,
//            R.drawable.page411,R.drawable.page412,R.drawable.page414,R.drawable.page414,R.drawable.page415,R.drawable.page416,
//            R.drawable.page417,R.drawable.page418,R.drawable.page419,R.drawable.page420,R.drawable.page421,R.drawable.page422,
//            R.drawable.page424,R.drawable.page424,R.drawable.page425,R.drawable.page426,R.drawable.page427,R.drawable.page428,
//            R.drawable.page429,R.drawable.page440,R.drawable.page441,R.drawable.page442,R.drawable.page444,R.drawable.page444,
//            R.drawable.page445,R.drawable.page446,R.drawable.page447,R.drawable.page448,R.drawable.page449,R.drawable.page440,
//            R.drawable.page441,R.drawable.page442,R.drawable.page444,R.drawable.page444,R.drawable.page445,R.drawable.page446,
//            R.drawable.page447,R.drawable.page448,R.drawable.page449,R.drawable.page450,R.drawable.page451,R.drawable.page452,
//            R.drawable.page454,R.drawable.page454,R.drawable.page455,R.drawable.page456,R.drawable.page457,R.drawable.page458,
//            R.drawable.page459,R.drawable.page460,R.drawable.page461,R.drawable.page462,R.drawable.page464,R.drawable.page464,
//            R.drawable.page465,R.drawable.page466,R.drawable.page467,R.drawable.page468,R.drawable.page469,R.drawable.page470,
//            R.drawable.page471,R.drawable.page472,R.drawable.page474,R.drawable.page474,R.drawable.page475,R.drawable.page476,
//            R.drawable.page477,R.drawable.page478,R.drawable.page479,R.drawable.page480,R.drawable.page481,R.drawable.page482,
//            R.drawable.page484,R.drawable.page484,R.drawable.page485,R.drawable.page486,R.drawable.page487,R.drawable.page488,
//            R.drawable.page489,R.drawable.page490,R.drawable.page491,R.drawable.page492,R.drawable.page494,R.drawable.page494,
//            R.drawable.page495,R.drawable.page496,R.drawable.page497,R.drawable.page498,R.drawable.page499,R.drawable.page500,
//            //TODO
//            R.drawable.page501,R.drawable.page502,R.drawable.page505,R.drawable.page505,
//            R.drawable.page505,R.drawable.page506,
//            R.drawable.page507,R.drawable.page508,R.drawable.page509,R.drawable.page510,
//            R.drawable.page511,R.drawable.page512,R.drawable.page515,R.drawable.page515,R.drawable.page515,R.drawable.page516,
//            R.drawable.page517,R.drawable.page518,R.drawable.page519,R.drawable.page520,R.drawable.page521,R.drawable.page522,
//            R.drawable.page525,R.drawable.page525,R.drawable.page525,R.drawable.page526,R.drawable.page527,R.drawable.page528,
//            R.drawable.page529,R.drawable.page550,R.drawable.page551,R.drawable.page552,R.drawable.page555,R.drawable.page555,
//            R.drawable.page555,R.drawable.page556,R.drawable.page557,R.drawable.page558,R.drawable.page559,R.drawable.page550,
//            R.drawable.page551,R.drawable.page552,R.drawable.page555,R.drawable.page555,R.drawable.page555,R.drawable.page556,
//            R.drawable.page557,R.drawable.page558,R.drawable.page559,R.drawable.page550,R.drawable.page551,R.drawable.page552,
//            R.drawable.page555,R.drawable.page555,R.drawable.page555,R.drawable.page556,R.drawable.page557,R.drawable.page558,
//            R.drawable.page559,R.drawable.page560,R.drawable.page561,R.drawable.page562,R.drawable.page565,R.drawable.page565,
//            R.drawable.page565,R.drawable.page566,R.drawable.page567,R.drawable.page568,R.drawable.page569,R.drawable.page570,
//            R.drawable.page571,R.drawable.page572,R.drawable.page575,R.drawable.page575,R.drawable.page575,R.drawable.page576,
//            R.drawable.page577,R.drawable.page578,R.drawable.page579,R.drawable.page580,R.drawable.page581,R.drawable.page582,
//            R.drawable.page585,R.drawable.page585,R.drawable.page585,R.drawable.page586,R.drawable.page587,R.drawable.page588,
//            R.drawable.page589,R.drawable.page590,R.drawable.page591,R.drawable.page592,R.drawable.page595,R.drawable.page595,
//            R.drawable.page595,R.drawable.page596,R.drawable.page597,R.drawable.page598,R.drawable.page599,R.drawable.page600,
//            R.drawable.page601, R.drawable.page602, R.drawable.page603 ,R.drawable.page604
//            //TODO
//
//
//    };
//    ArrayList<SurahClass> data;
//    data = new ArrayList<>();
//        data.add(new SurahClass(0, " الفاتحة", "مكية" , "001"));
//        data.add(new SurahClass(1, "البقرة", "مدنية" , "002"));
//        data.add(new SurahClass(49, "ال عمران ", "مدنية" , "003"));
//        data.add(new SurahClass(76, "النساء", "مدنية" , "004"));
//        data.add(new SurahClass(105, " المائدة", "مدنية" , "005"));
//        data.add(new SurahClass(127, " الانعام", "مكية" , "006"));
//        data.add(new SurahClass(150, " الأعراف", "مكية" , "007"));
//        data.add(new SurahClass(176, " الأنفال", "مدنية" , "008"));
//        data.add(new SurahClass(186, " التوبة ", "مدنية" , "009"));
//        data.add(new SurahClass(207, " يونس", "مكية" , "010"));
//        data.add(new SurahClass(220, " هود", "مكية" , "011"));
//        data.add(new SurahClass(234, " يوسف", "مكية" , "012"));
//        data.add(new SurahClass(248, " الرعد", "مدنية" , "013"));
//        data.add(new SurahClass(254, " إبراهيم", "مكية" , "014"));
//        data.add(new SurahClass(261, " الحجر", "مكية" , "015"));
//        data.add(new SurahClass(266, " النحل", "مكية" , "016"));
//        data.add(new SurahClass(281, " الإسراء", "مكية" , "017"));
//        data.add(new SurahClass(292, " الكهف", "مكية" , "018"));
//        data.add(new SurahClass(304, " مريم", "مكية" , "019"));
//        data.add(new SurahClass(311, " طه", "مكية" , "020"));
//        data.add(new SurahClass(321, " الأنبياء", "مكية" , "021"));
//        data.add(new SurahClass(331, " الحج", "مدنية" , "022"));
//        data.add(new SurahClass(341, " المؤمنون", "مكية" , "023"));
//        data.add(new SurahClass(349, " النّور", "مدنية" , "024"));
//        data.add(new SurahClass(358, "  الفرقان ", "مكية" , "025"));
//        data.add(new SurahClass(366, "  الشعراء ", "مكية" , "026"));
//        data.add(new SurahClass(376, " النّمل", "مكية" , "027"));
//        data.add(new SurahClass(384, " القصص", "مكية" , "028"));
//        data.add(new SurahClass(395, " العنكبوت", "مكية" , "029"));
//        data.add(new SurahClass(403, " الرّوم", "مكية" , "030"));
//        data.add(new SurahClass(410, " لقمان", "مكية" , "031"));
//        data.add(new SurahClass(414, " السجدة", "مكية" , "032"));
//        data.add(new SurahClass(417, " الأحزاب", "مدنية" , "033"));
//        data.add(new SurahClass(427, " سبأ", "مكية" , "034"));
//        data.add(new SurahClass(433, " فاطر", "مكية" , "035"));
//        data.add(new SurahClass(439, " يس", "مكية" , "036"));
//        data.add(new SurahClass(445, " الصافات", "مكية" , "037"));
//        data.add(new SurahClass(452, " ص", "مكية" , "038"));
//        data.add(new SurahClass(457, " الزمر", "مكية" , "039"));
//        data.add(new SurahClass(466, " غافر", "مكية" , "040"));
//        data.add(new SurahClass(476, " فصّلت", "مكية" , "041"));
//        data.add(new SurahClass(482, " الشورى", "مكية" , "042"));
//        data.add(new SurahClass(488, " الزخرف", "مكية" , "043"));
//        data.add(new SurahClass(495, " الدّخان", "مكية" , "044"));
//        data.add(new SurahClass(498, " الجاثية", "مكية" , "045"));
//        data.add(new SurahClass(501, " الأحقاف", "مكية" , "046"));
//        data.add(new SurahClass(506, " محمد", "مدنية" , "047"));
//        data.add(new SurahClass(510, " الفتح", "مدنية" , "048"));
//        data.add(new SurahClass(514, " الحجرات", "مدنية" , "049"));
//        data.add(new SurahClass(517, " ق", "مكية" , "050"));
//        data.add(new SurahClass(519, " الذاريات", "مكية" , "051"));
//        data.add(new SurahClass(522, " الطور", "مكية" , "052"));
//        data.add(new SurahClass(525, " النجم", "مكية" , "053"));
//        data.add(new SurahClass(527, " القمر", "مكية" , "054"));
//        data.add(new SurahClass(530, " الرحمن", "مدنية" , "055"));
//        data.add(new SurahClass(533, " الواقعة", "مكية" , "056"));
//        data.add(new SurahClass(536, " الحديد", "مدنية" , "057"));
//        data.add(new SurahClass(541, " المجادلة", "مدنية" , "058"));
//        data.add(new SurahClass(544, " الحشر", "مدنية" , "059"));
//        data.add(new SurahClass(548, " الممتحنة", "مدنية" , "060"));
//        data.add(new SurahClass(550, " الصف", "مدنية" , "061"));
//        data.add(new SurahClass(552, " الجمعة", "مدنية" , "062"));
//        data.add(new SurahClass(553, " المنافقون", "مدنية" , "063"));
//        data.add(new SurahClass(555, " التغابن", "مدنية" , "064"));
//        data.add(new SurahClass(557, " الطلاق", "مدنية" , "065"));
//        data.add(new SurahClass(559, " التحريم", "مدنية" , "066"));
//        data.add(new SurahClass(561, " الملك", "مكية" , "067"));
//        data.add(new SurahClass(563, " القلم", "مكية" , "068"));
//        data.add(new SurahClass(565, " الحاقة",  "مكية" , "069"));
//        data.add(new SurahClass(567, " المعارج", "مكية" , "070"));
//        data.add(new SurahClass(569, " نوح", "مكية" , "071"));
//        data.add(new SurahClass(571, " الجن", "مكية" , "072"));
//        data.add(new SurahClass(573, " المزّمّل", "مكية" , "073"));
//        data.add(new SurahClass(574, " المدّثر", "مكية" , "074"));
//        data.add(new SurahClass(576, " القيامة", "مكية" , "075"));
//        data.add(new SurahClass(5777, " الإنسان", "مدنية" , "076"));
//        data.add(new SurahClass(579, " المرسلات", "مكية" , "077"));
//        data.add(new SurahClass(581, " النبأ", "مكية" , "078"));
//        data.add(new SurahClass(582, " النازعات", "مكية" , "079"));
//        data.add(new SurahClass(584, " عبس", "مكية" , "080"));
//        data.add(new SurahClass(585, " التكوير", "مكية" , "081"));
//        data.add(new SurahClass(586, " الإنفطار", "مكية" , "082"));
//        data.add(new SurahClass(586, " المطفّفين", "مكية" , "083"));
//        data.add(new SurahClass(588, " الإنشقاق", "مكية" , "084"));
//        data.add(new SurahClass(589, " البروج", "مكية" , "085"));
//        data.add(new SurahClass(590, " الطارق", "مكية" , "086"));
//        data.add(new SurahClass(590, " الأعلى", "مكية" , "087"));
//        data.add(new SurahClass(591, " الغاشية", "مكية" , "088"));
//        data.add(new SurahClass(592, " الفجر", "مكية" , "089"));
//        data.add(new SurahClass(593, " البلد", "مكية" , "090"));
//        data.add(new SurahClass(594, " الشمس", "مكية" , "091"));
//        data.add(new SurahClass(594, " الليل", "مكية" , "092"));
//        data.add(new SurahClass(595, " الضحى", "مكية" , "093"));
//        data.add(new SurahClass(595, " الشرح", "مكية" , "094"));
//        data.add(new SurahClass(596, " التين", "مكية" , "095"));
//        data.add(new SurahClass(596, " العلق", "مكية" , "096"));
//        data.add(new SurahClass(597, " القدر", "مكية" , "097"));
//        data.add(new SurahClass(597, " البينة", "مدنية" , "098"));
//        data.add(new SurahClass(598, " الزلزلة", "مدنية" , "099"));
//        data.add(new SurahClass(598, " العاديات", "مكية" , "100"));
//        data.add(new SurahClass(598, " القارعة", "مكية" , "101"));
//        data.add(new SurahClass(599, " التكاثر", "مكية" , "102"));
//        data.add(new SurahClass(600, " العصر", "مكية" , "103"));
//        data.add(new SurahClass(600, " الهمزة", "مكية" , "104"));
//        data.add(new SurahClass(600, " الفيل", "مكية","105"));
//        data.add(new SurahClass(601, " قريش", "مكية" , "106"));
//        data.add(new SurahClass(601, " الماعون", "مكية" , "107"));
//        data.add(new SurahClass(601, " الكوثر", "مكية" , "108"));
//        data.add(new SurahClass(602, " الكافرون", "مكية" , "109"));
//        data.add(new SurahClass(602, " النصر", "مدنية" , "110"));
//        data.add(new SurahClass(602, " المسد", "مكية" , "111"));
//        data.add(new SurahClass(603, " الإخلاص", "مكية" , "112"));
//        data.add(new SurahClass(603, " الفلق", "مكية" , "113"));
//        data.add(new SurahClass( 603," النّاس", "مكية" , "114"));
}
