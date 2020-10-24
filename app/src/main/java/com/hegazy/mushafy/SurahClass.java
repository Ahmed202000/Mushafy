package com.hegazy.mushafy;

import java.io.Serializable;

class SurahClass implements Serializable {
    public String surah_name;
    public int surah_position;
     public String type;
     public String surah_number;

    public String getSurah_number() {
        return surah_number;
    }

    public void setSurah_number(String surah_number) {
        this.surah_number = surah_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SurahClass(int surah_position , String surah_name , String type , String surah_number) {
        this.surah_name = surah_name;
        this.surah_position = surah_position;
        this.type=type;
        this.surah_number=surah_number;
    }

    public String getSurah_name() {
        return surah_name;
    }

    public void setSurah_name(String surah_name) {
        this.surah_name = surah_name;
    }

    public int getSurah_position() {
        return surah_position;
    }

    public void setSurah_position(int surah_position) {
        this.surah_position = surah_position;
    }
}
