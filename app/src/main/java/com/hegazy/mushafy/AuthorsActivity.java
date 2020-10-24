package com.hegazy.mushafy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.hegazy.mushafy.Const.AUTHOR;

public class AuthorsActivity extends AppCompatActivity {
    ArrayList<AuthorClass> data = new ArrayList<>();
    AuthorAdapter adapter;
    @BindView(R.id.list_authors)
    ListView listAuthors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authors);
        ButterKnife.bind(this);
        addData();
        listAuthors.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(AuthorsActivity.this,SurahsListenActivity.class);
                i.putExtra(AUTHOR , data.get(position));
                startActivity(i);
            }
        });
    }

    private void addData() {
        data.add(new AuthorClass("8", "frs_a", " فارس عباد"));
        data.add(new AuthorClass("12", "maher", " ماهر المعيقلي ح"));
        data.add(new AuthorClass("13", "basit_mjwd", " عبدالباسط عبدالصمد  م"));
        data.add(new AuthorClass("11", "mhsny", " محمد المحيسني"));
        data.add(new AuthorClass("11", "minsh_mjwd", "محمد صديق المنشاوي م"));
        data.add(new AuthorClass("10", "jleel", "خالد الجليل"));
        adapter=new AuthorAdapter(data,this);
        listAuthors.setAdapter(adapter);

    }
}