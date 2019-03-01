package com.gamerz.gamerzdelight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class latest extends AppCompatActivity {
    @BindView(R.id.listViewLatest)ListView mListViewLatest;

    private String[] latest = new String[]{"mortal kombat XII","dead or alive 6","far cry new dawn","devil may cry 5","crack down3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest);
        ButterKnife .bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,latest);
        mListViewLatest.setAdapter(adapter);
    }
}
